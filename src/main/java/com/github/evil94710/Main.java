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
        Sanner keyboard = new Scanner();
        while(br.ready()){
            System.out.println(br.readLine());
        }
        public String  arrNamr[200]; //  店家名稱
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
                    Random ran = new Random();
                    System.out.println(ran.nextInt(20));
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }
        file.close();
    }
}
