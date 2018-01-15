package com.github.evil94710;
import java.util.Random;
import java.util.Scanner;
public class D0511189 {
    private int condition;
    Scanner keyboard = new Scanner(System.in);

    public void setFunction() {
        System.out.println("1.午餐" + "\n" + "2.晚餐" + "\n" + "3.宵夜" + "\n" + "4.點心" + "\n");
        System.out.println("input your condition number(only one and number only):" + "\n");
        condition = keyboard.nextInt();
    }

    public void determine(String[] arrName, String[] arrClass, int count) {
        int i = 0, k = 0, j, p;
        String[] arr = new String[200];
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
            for (j = 0; j < 5; j++) {
                Random ran = new Random();
                int num = ran.nextInt(i);
                System.out.println(arr[num]);
            }
        }
    }
}
