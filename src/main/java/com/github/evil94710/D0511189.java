package com.github.evil94710;

import java.util.Scanner;
public class D0511189 {
    private int condition;
    Scanner keyboard = new Scanner(System.in);

    public void setfunction(){
        System.out.println("1.午餐"+"\n"+"2.晚餐"+"\n"+"3.宵夜"+"\n"+"4.點心"+"\n");
        System.out.println("input your condition number(only one and only number):"+"\n");
        condition = keyboard.nextInt();
    }
    public int getfunction(){
        return condition;
    }
    public void determine(int condition){
        int i=0,j=0,s, p,k, count,Array[20];
        if(condition<1||condition>4){
            System.out.print("輸入錯誤"+"\n");
        }
        else if(condition==""){
            System.out.print("輸入不能為空白哦"+"\n");
        }
        else {
            switch (condition) {
                case 1:
                    for (p = 0; p < count; p++) {
                        if (arrClass[p].charat[0].equal("1")) {
                            arrName[p] = Array[i];
                            i++;
                        }
                    }
                    break;
                case 2:
                    for (p = 0; p < count; p++) {
                        if (arrClass[p].charat[1].equal("1")) {
                            arrName[p] = Array[i];
                            i++;
                        }
                    }
                    break;
                case 3:
                    for (p = 0; p < count; p++) {
                        if (arrClass[p].charat[2].equal("1")) {
                            arrName[p] = Array[i];
                            i++;
                        }
                    }
                    break;
                case 4:
                    for (p = 0; p < count; p++) {
                        if (arrClass[p].charat[3].equal("1")) {
                            arrName[p] = Array[i];
                            i++;
                        }
                    }
                    break;
            }
            for(j=0;j<Array.length;j++){
                System.out.println(Array[j]);
                k++;
                if(k==5)
                    break;
            }
        }
    }
}
