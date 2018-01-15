package com.github.evil94710;
import java.util.Random;

public class D0588491{
    private String shopName;

    public String randomShop(int count){
        Random ran = new Random();
        int num = ran.nextInt(count);
        String Name = getShopName(arrName[],num);
        return Name;
    }

    public String getShopName(String[] arrName,int num){
        this.shopName = arrName[num];
        return shopName;
    }

}
