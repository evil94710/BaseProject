package com.github.evil94710;

import java.util.Scanner;
public class D0511189 {
    public static void main(String[] args) {
        int i=0,j=0,k=0,s,p,Array[20];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1.午餐"+"\n"+"2.晚餐"+"\n"+"3.點心"+"\n"+"4.宵夜"+"\n");
        System.out.println("input your condition number(only one):"+"\n");
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
                    for(p=0;p<20;p++){
                        if(list[s][5]==1){
                        list[p][0]=Array[i];
                        i++;
                        }
                    }
                    break;
                case 2:
                    for(p=0;p<20;p++) {
                        if (list[s][6] == 1) {
                            list[p][0] = Array[i];
                            i++;
                        }
                    }
                    break;
                case 3:
                    for(p=0;p<20;p++) {
                        if (list[s][7] == 1) {
                            list[p][0] = Array[i];
                            i++;
                        }
                    }
                    break;
                case 4:
                    for(p=0;p<20;p++) {
                        if (list[s][8] == 1) {
                            list[p][0] = Array[i];
                            i++;
                        }
                    }
                    break;
            }
        }
        for(j=0;j<Array.length;j++){
            System.out.println(Array[i]);
            k++;
            if(k==5)
                break;
        }
    }
}
