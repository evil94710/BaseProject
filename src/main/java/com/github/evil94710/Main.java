package com.github.evil94710;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

/*  String arrName[200]*/

public class Main {
    public static void main(String args[]) throws
IOException{
        int count = 0;
        FileReader file = new FileReader("list.txt");
        BufferedReader br = new BufferedReader(file);
        Scanner keyboard = new Scanner(System.in);
        while(br.ready()){
            System.out.println(br.readLine());
        }
        public String  arrName[200]; //  店家名稱
        public String arrGreat[200];  //  評價
        public String arrData[200]; // 店家資訊
        public String arrRush[200]; // 尖峰時間
        public String arrTime[200]; // 營業時間
        public String arrClass[200];// 類別
        while(true){
            System.out.println("1.選擇輸入店家2.選擇輸入想要條件3.新增資訊4.隨機選擇5.離開\n");
            int choose = keyboard.nextInt();
            switch(choose) {
                case 1:
                    checkPeople people = new checkPeople();
                    while (true) {
                        Scanner scn = new Scanner(System.in);
                        System.out.println("enter the shop name:");
                        String name = scn.nextLine();
                        people.setShopName(name);
                        System.out.println(people.getShopName());
                        int num = people.checkShopName(name,arrName,arrRush);
                        if (num == -1) {
                            System.out.println("此名稱不完整或不收錄於名單內，請重新輸入!");
                        } else {
                            System.out.println("店家名稱:" + people.getShopName());
                            System.out.println("尖峰人潮時間:" + people.getRushTime());
                        }
                        System.out.println("是否離開此功能? Y/N");
                        String exit = scn.nextLine();
                        if (exit.equalsIgnoreCase("Y")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    D0511189 search=new D0511189();
                    Scanner keyboard = new Scanner(System.in);
                    while(true){
                        search.setFunction();
                        search.determine(search.getFunction());
                        System.out.println("是否離開此功能? Y/N");
                        String exit = keyboard.nextLine();
                        if (exit.equalsIgnoreCase("Y")) {
                            break;
                        }
                    }
                    break;
                case 3:
                    insertData insert = new insertData();
                    String ans;

                    String name;
                    while(true){

                        while (true) {
                            System.out.print("請輸入店家名稱:");
                            name = keyboard.nextLine();

                            if (name.equals(""))
                                System.out.println("輸入錯誤");
                            else
                                break;
                        }

                        boolean check = insert.checkList(arrName);
                        if (check == true) {

                            int counting = insert.setCounting();
                            System.out.println(name+" (原資料)");
                            System.out.println("評價:"+arrGreat[counting]);
                            System.out.println("資訊:"+arrData[counting]);
                            System.out.println("尖峰時間:"+arrRush[counting]);
                            System.out.println("營業時間:"+arrTime[counting]);

                            while (true){
                                insert.getGreat();
                                insert.getData();
                                insert.getRushtime();
                                insert.getTime();

                                System.out.println("是否新增資料: Y / N");
                                ans = keyboard.nextLine();
                                if (ans.equalsIgnoreCase("Y"))
                                    break;
                            }

                            insert.getCounting();
                            insert.setName(arrName);
                            insert.setGreat(arrGreat);
                            insert.setData(arrData);
                            insert.setRush(arrRush);
                            insert.setTime(arrTime);

                            System.out.print("新增新增資料成功, 是否離開此功能? Y/N");
                            ans = keyboard.nextLine();
                            if (ans.equalsIgnoreCase("Y"))
                                break;

                        } else {

                            System.out.println("是否新增名單: Y / N");
                            ans = keyboard.nextLine();

                            if (ans.equalsIgnoreCase("Y")) {

                                while (true) {

                                    insert.motd();
                                    insert.getGreat();
                                    insert.getData();
                                    insert.getRushtime();
                                    insert.getTime();

                                    System.out.println("是否新增資料: Y / N");
                                    ans = keyboard.nextLine();
                                    if (ans.equalsIgnoreCase("Y"))
                                        break;
                                }

                                insert.getCount(count);
                                insert.setName(arrName);
                                insert.setGreat(arrGreat);
                                insert.setData(arrData);
                                insert.setRush(arrRush);
                                insert.setTime(arrTime);

                                count = insert.setCounting(1);

                                System.out.print("新增新增資料成功, 使否離開此功能? Y/N");
                                ans = keyboard.nextLine();
                                if (ans.equalsIgnoreCase("Y"))
                                    break;

                            } else {
                                System.out.println("重新輸入店家名稱");
                            }
                        }
                    }

                    break;
                case 4:
                    Random ran = new Random();
                    System.out.println(ran.nextInt(20));
                    break;
                case 5:
                    break;
            }
        }
        file.close();
    }
}
