package com.github.evil94710;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
public class D0511189 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        FileReader file = new FileReader("list.txt");
        BufferedReader br = new BufferedReader(file);
        while(br.ready()){
            System.out.println(br.readLine());
        }
        System.out.println("1.早餐"+"\n"+"2.午餐"+"\n"+"3.晚餐"+"\n"+"4.宵夜"+"\n");
        System.out.println("input your condition number:");
        int condition = keyboard.nextInt();
        if(condition<1||condition>4){
            System.out.print("輸入錯誤"+"\n");
        }
        else if(condition==" "){
            System.out.print("輸入不能為空白哦"+"\n");
        }
        else{
            switch(condition){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
        file.close();
    }
}
