package com.github.evil94710;

import java.util.Scanner;
/*  String arrName[200]


*/
public class Main {
    public static void main(String args[]){

        checkPeople people = new checkPeople();
        while (true){
            Scanner scn = new Scanner(System.in);
            System.out.println("enter the shop name:");
            String name = scn.nextLine();
            people.setShopName(name);
            System.out.println(people.getShopName());
            boolean check = people.checkShopName(name);
            if(check == true){
                System.out.println("店家名稱:" + );
                System.out.println("尖峰人潮時間:" + );
            }else{
                System.out.println("此名稱不完整或不收錄於名單內，請重新輸入!");
            }
            System.out.println("是否離開此功能:(yes/no)");
            String exit = scn.nextLine();
            if(exit.equalsIgnoreCase("yes")){
                break;
            }
            else{
                continue;

            }
        }
    }
}
