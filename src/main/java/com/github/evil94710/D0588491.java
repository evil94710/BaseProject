package com.github.evil94710;
import java.util.Random;

public class D0588491{
    private String shopName;

    public void randomShop(int count,String[] arrName) {
        Random ran = new Random();
        int num = ran.nextInt(count);
        getShopName(arrName, num);
    }

    public void getShopName(String[] arrName,int num){
        this.shopName = arrName[num];
        System.out.println("隨機選擇到: "+shopName);
    }
}
