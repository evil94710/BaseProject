package com.github.evil94710;
import java.util.Random;
import java.util.Scanner;
public class D0511189 {
    private int condition;
    Scanner keyboard = new Scanner(System.in);

    public void setFunction() {
        System.out.println("1.午餐" + "\n" + "2.晚餐" + "\n" + "3.宵夜" + "\n" + "4.點心" );
        System.out.println("input your condition number(only one and number only):");
        condition = keyboard.nextInt();
    }

    public void determine(String[] arrName, String[] arrClass, int count) {
        int i = 0, s , j, p;
        String[] arr = new String[200];
        int[] rand = new int[5];
        String Condition = String.valueOf(condition);
        if (condition < 1 || condition > 4) {
            System.out.print("輸入錯誤" + "\n");
        } else if (Condition.equals("")) {
            System.out.print("輸入不能為空白哦" + "\n");
        } else {
            switch (condition) {
                case 1:
                    for (p = 0; p < count; p++) {
                        if (arrClass[p].charAt(0) == '1') {
                            arr[i] = arrName[p];
                            i++;
                        }
                    }
                    break;
                case 2:
                    for (p = 0; p < count; p++) {
                        if (arrClass[p].charAt(1) == '1') {
                            arr[i] = arrName[p];
                            i++;
                        }
                    }
                    break;
                case 3:
                    for (p = 0; p < count; p++) {
                        if (arrClass[p].charAt(2) == '1') {
                            arr[i] = arrName[p];
                            i++;
                        }
                    }
                    break;
                case 4:
                    for (p = 0; p < count; p++) {
                        if (arrClass[p].charAt(3) == '1') {
                            arr[i] = arrName[p];
                            i++;
                        }
                    }
                    break;
            }
            if( i <= 5){
                for( j = 0; j < i ; j ++){
                    System.out.println(arr[j]);
                }
            }
            else{
                for (j = 0; j < 5; j++) {
                    Random ran = new Random();
                    int num = ran.nextInt(i);
                    rand[j] = num;
                    for (s = 0; s < j; s++) {
                        if (rand[j] == rand[s]) {
                            j--;
                            break;
                        }
                    }
                }
                for ( j = 0;j < 5;j++){
                    if(arr[rand[j]]==null){
                        break;
                    }
                    System.out.println(arr[rand[j]]);
                }
            }
        }
    }
}
