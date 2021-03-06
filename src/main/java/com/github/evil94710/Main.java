package com.github.evil94710;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.util.ArrayList;
import java.lang.*;


public class Main {
    public static void main(String args[]) throws IOException{
        int count = 19;
        FileReader file = new FileReader ("list.txt");
        BufferedReader br = new BufferedReader(file);//取得完整的字串
        String line,tempString;
        String[] tempArray = new String[200];
        ArrayList<String> myList = new ArrayList<String>();
        while((line=br.readLine())!=null) {
            tempString = line;
            tempArray = tempString.split(",");
            for(int i = 0;i<tempArray.length;i++) {
                myList.add(tempArray[i]);
            }
        }
        int k = myList.size()/9,num = 0;
        String[][] list = new String[k][9];
        for(int i = 0;i < k;i++) {
            for(int j = 0;j < 9;j++) {
                list[i][j] = String.valueOf((String)myList.get(num));
                num++;
            }
        }

        file.close();
        String[] arrName = new String[200];//  店家名稱
        String[] arrGreat = new String[200];//  評價
        String[] arrData = new String[200];// 店家資訊
        String[] arrRush = new String[200];// 尖峰時間
        String[] arrTime = new String[200];// 營業時間
        String[] arrClass = new String[200];//類別
        String[] arrClass1 = new String[200];// 類別1
        String[] arrClass2 = new String[200];// 類別2
        String[] arrClass3 = new String[200];// 類別3
        String[] arrClass4 = new String[200];// 類別4

        for(int i = 0;i < k;i++) {//arrName陣列
            arrName[i] = list[i][0];
        }

        for(int i = 0;i < k;i++) {//arrGreat陣列
            arrGreat[i] = list[i][1];
        }

        for(int i = 0;i < k;i++){//arrRush陣列
            arrRush[i] = list[i][2];
        }

        for(int i = 0;i < k;i++) {//arrData陣列
            arrData[i] = list[i][3];
        }

        for(int i = 0;i < k;i++) {//arrTime陣列
            arrTime[i] = list[i][4];
        }

        for(int i = 0;i < k;i++) {//arrClass1類別
            arrClass1[i] = list[i][5];
        }

        for(int i = 0;i < k;i++) {//arrClass2類別
            arrClass2[i] = list[i][6];
        }

        for(int i = 0;i < k;i++) {//arrClass3類別
            arrClass3[i] = list[i][7];
        }

        for(int i = 0;i < k;i++) {//arrClass4類別
            arrClass4[i] = list[i][8];
        }

        for(int i = 0;i < k;i++) {//arrClass類別
            arrClass[i] = arrClass1[i]+arrClass2[i]+arrClass3[i]+arrClass4[i];
        }

        arrName[0] = arrName[0].substring(2,arrName[0].length());
        boolean exit;
        boolean exitMain = true;
        Scanner keyboard = new Scanner(System.in);
        while(exitMain){
            System.out.println("1.查看店家人潮2.找出符合條件店家3.新增資訊4.隨機選擇店家5.GoogleMap導航6.離開");
            int choose = 0;
            if(keyboard.hasNextInt())
                choose = keyboard.nextInt();
            switch(choose) {

                case 1:
                    checkPeople people = new checkPeople();
                    while (true) {
                        String name = "";
                        System.out.println("輸入店家名稱:");
                        if(keyboard.hasNext())
                            name = keyboard.next();
                        people.setShopName(name);
                        int number = people.checkShopName(name,arrName,arrRush,count);
                        if (number == -1) {
                            System.out.println("此名稱不完整或不收錄於名單內，請重新輸入!");
                            continue;
                        } else {
                            System.out.println("店家名稱:" + people.getShopName());
                            System.out.println("尖峰人潮時間:" + people.getRushTime());
                        }
                        exit = exit();
                        if(exit){
                            break;
                        }
                    }
                    break;

                case 2:
                    D0511189 search=new D0511189();
                    while(true){
                        search.setFunction();
                        search.determine(arrName,arrClass,count);
                        exit = exit();
                        if(exit){
                            break;
                        }
                    }
                    break;

                case 3:
                    insertData insert = new insertData();
                    String ans;
                    String name;
                    int counting;
                    int a;

                    while(true){

                        while (true) {
                            System.out.print("請輸入店家名稱:");
                            name = keyboard.next();
                            insert.getShopName(name);
                            if (name.equals(""));
                            else
                                break;
                        }

                        boolean check = insert.checkList(arrName);
                        if (check) {

                            counting = insert.returnCounting();
                            System.out.println(name+" (原資料)");
                            System.out.println("評價:"+arrGreat[counting]);
                            System.out.println("資訊:"+arrData[counting]);
                            System.out.println("尖峰時間:"+arrRush[counting]);
                            System.out.println("營業時間:"+arrTime[counting]);
                            System.out.println("(輸入不可為空)");
                            while (true){
                                while(true){
                                    a=insert.getGreat();
                                    if(a==0)
                                        insert.errorInput();
                                    else
                                        break;
                                }
                                while(true){
                                    a=insert.getData();
                                    if(a==0)
                                        insert.errorInput();
                                    else
                                        break;
                                }
                                while(true){
                                    a=insert.getRush();
                                    if(a==0)
                                        insert.errorInput();
                                    else
                                        break;
                                }
                                while(true){
                                    a=insert.getTime();
                                    if(a==0)
                                        insert.errorInput();
                                    else
                                        break;
                                }


                                System.out.println("是否新增資料: Y / N");
                                ans = keyboard.next();
                                if (ans.equalsIgnoreCase("Y"))
                                    break;
                            }


                            insert.setCount(counting);
                            arrName = insert.setName(arrName);
                            arrGreat = insert.setGreat(arrGreat);
                            arrData = insert.setData(arrData);
                            arrRush = insert.setRush(arrRush);
                            arrTime = insert.setTime(arrTime);


                            System.out.println("剛剛所新增之資料:");
                            System.out.println("店家名稱:" + arrName[counting]);
                            System.out.println("評價:" + arrGreat[counting]);
                            System.out.println("資訊:"+arrData[counting]);
                            System.out.println("尖峰時間:"+arrRush[counting]);
                            System.out.println("營業時間:"+arrTime[counting]);

                            System.out.print("新增資料成功 ");
                            exit = exit();
                            if(exit){
                                break;
                            }
                        } else {

                            System.out.println("是否新增名單: Y / N");
                            ans = keyboard.next();
                            insert.motd();
                            if (ans.equalsIgnoreCase("Y")) {

                                while (true) {

                                    while(true){
                                        a=insert.getGreat();
                                        if(a==0)
                                            insert.errorInput();
                                        else
                                            break;
                                    }
                                    while(true){
                                        a=insert.getData();
                                        if(a==0)
                                            insert.errorInput();
                                        else
                                            break;
                                    }
                                    while(true){
                                        a=insert.getRush();
                                        if(a==0)
                                            insert.errorInput();
                                        else
                                            break;
                                    }
                                    while(true){
                                        a=insert.getTime();
                                        if(a==0)
                                            insert.errorInput();
                                        else
                                            break;
                                    }

                                    System.out.println("是否新增資料: Y / N");
                                    ans = keyboard.next();
                                    if (ans.equalsIgnoreCase("Y"))
                                        break;
                                }

                                insert.setCount(count,1);
                                count = insert.returnCount();
                                arrName = insert.setName(arrName);
                                arrGreat = insert.setGreat(arrGreat);
                                arrData = insert.setData(arrData);
                                arrRush = insert.setRush(arrRush);
                                arrTime = insert.setTime(arrTime);

                                System.out.println("剛剛所新增之資料:");
                                System.out.println("店家名稱:" + name);
                                System.out.println("評價:" + arrGreat[count]);
                                System.out.println("資訊:" + arrData[count]);
                                System.out.println("尖峰時間:" + arrRush[count]);
                                System.out.println("營業時間:" + arrTime[count]);


                                exit = exit();
                                if(exit){
                                    break;
                                }
                            }else {
                                System.out.println("重新輸入店家名稱");
                            }
                        }
                    }
                    break;

                case 4:
                    while (true){
                        D0588491 randomSelect = new D0588491();
                        randomSelect.randomShop(count,arrName);
                        exit = exit();
                        if(exit){
                            break;
                        }
                    }
                    break;

                case 5:
                    while (true){
                        googleMap openMap = new googleMap();
                        try{
                            openMap.openGoogleMap();
                        }catch (Exception e){
                            System.out.println("googleMap function is error.");
                        }

                        exit = exit();
                        if(exit){
                            break;
                        }
                    }
                    break;

                case 6:
                    exit = exitMain();
                    if(exit){
                        exitMain = false;
                        break;
                    }
                    break;
            }
        }
        keyboard.close();
    }

    private static boolean exit(){
        Scanner keyboard = new Scanner(System.in);
        while (true){
            System.out.println("是否離開此功能? Y/N");
            String exit = keyboard.next();
            if(exit.equalsIgnoreCase("Y"))
                return true;
            else if(exit.equalsIgnoreCase("N"))
                return false;
            else
                continue;
        }
    }

    private static boolean exitMain(){
        Scanner keyboard = new Scanner(System.in);
        while (true){
            System.out.println("是否離開此程式? Y/N");
            String exit = keyboard.next();
            if(exit.equalsIgnoreCase("Y"))
                return true;
            else if(exit.equalsIgnoreCase("N"))
                return false;
            else
                continue;
        }

    }
}
