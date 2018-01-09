package com.github.evil94710;

import java.util.Scanner;
public class D0511189 {
    private int i=0;
    private int j=0;
    private int k=0;
    private int s;
    private int p;
    private int count;
    private int Array[20];
    private int condition;
    Scanner keyboard = new Scanner(System.in);

    public void setfunction(){
        System.out.println("1.午餐"+"\n"+"2.晚餐"+"\n"+"3.點心"+"\n"+"4.宵夜"+"\n");
        System.out.println("input your condition number(only one):"+"\n");
        condition = keyboard.nextInt();
    }
    public String getfunction(){
        return condition;
    }
    public void determine(int condition){
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
                        if (list[s][5] == 1) {
                            list[p][0] = Array[i];
                            i++;
                        }
                    }
                    break;
                case 2:
                    for (p = 0; p < count; p++) {
                        if (list[s][6] == 1) {
                            list[p][0] = Array[i];
                            i++;
                        }
                    }
                    break;
                case 3:
                    for (p = 0; p < count; p++) {
                        if (list[s][7] == 1) {
                            list[p][0] = Array[i];
                            i++;
                        }
                    }
                    break;
                case 4:
                    for (p = 0; p < count; p++) {
                        if (list[s][8] == 1) {
                            list[p][0] = Array[i];
                            i++;
                        }
                    }
                    break;
            }
        }
    }
    public void getName(int Array[]){
        for(j=0;j<Array.length;j++){
            System.out.println(Array[i]);
            k++;
            if(k==5)
                break;
        }
    }
}
