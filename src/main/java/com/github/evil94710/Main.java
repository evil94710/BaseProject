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
        Sanner keyboard = new Scanner(System.in);
        while(br.ready()){
            System.out.println(br.readLine());
        }
        public String  arrName[200]; //  店家名稱
        public String arrGreat[200];  //  評價
        public Stirng arrData[200]; // 店家資訊
        public String arrRush[200]; // 尖峰時間
        public String arrTime[200]; // 營業時間
        public String arrClass[200];// 類別
        while(true){
            System.out.println("1.選擇輸入店家2.選擇輸入想要條件3.選擇隨機選擇4.新增資訊5.離開\n");
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
                        boolean check = people.checkShopName(name);
                        if (check == true) {
                            System.out.println("店家名稱:" +);
                            System.out.println("尖峰人潮時間:" +);
                        } else {
                            System.out.println("此名稱不完整或不收錄於名單內，請重新輸入!");
                        }
                        System.out.println("是否離開此功能:(yes/no)");
                        String exit = scn.nextLine();
                        if (exit.equalsIgnoreCase("yes")) {
                            break;
                        } else {
                            continue;
                        }
                    }
                    break;
                case 2:

                    break;
                case 3:
                    insertData insert = new insertData();
                    String ans;

                    while(true){

                        while (true) {
                            System.out.print:("請輸入店家名稱:");
                            String name = keyboard.nextLine();

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
                                if (ans.equalsIgnoreCase(Y))
                                    break;
                            }

                            insert.getCounting();
                            insert.setName(arrName);
                            insert.setGreat(arrGreat);
                            insert.setData(arrData);
                            insert.setRush(arrRush);
                            insert.setTime(arrTime);

                            System.out.print("新增新增資料成功, 使否離開此功能? Y/N");
                            ans = keyboard.nextLine();
                            if (ans.equalsIgnoreCase(Y))
                                break;

                        } else {

                            System.out.println("是否新增名單: Y / N");
                            ans = keyboard.nextLine();

                            if (ans.equalsIgnoreCase(Y)) {

                                while (true) {

                                    insert.motd();
                                    insert.getGreat();
                                    insert.getData();
                                    insert.getRushtime();
                                    insert.getTime();

                                    System.out.println("是否新增資料: Y / N");
                                    ans = keyboard.nextLine();
                                    if (ans.equalsIgnoreCase(Y))
                                        break;
                                }

                                insert.getCount(count);
                                insert.setName(arrName);
                                insert.setGreat(arrGreat);
                                insert.setData(arrData);
                                insert.setRush(arrRush);
                                insert.setTime(arrTime);

                                count = setCount();

                                System.out.print("新增新增資料成功, 使否離開此功能? Y/N");
                                ans = keyboard.nextLine();
                                if (ans.equalsIgnoreCase(Y))
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
