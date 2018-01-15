package com.github.evil94710;
import java.util.Random;

public class D0588491{
    private String shopName;

    public void randomShop(int count, String[] arrName){
        Random ran = new Random();
        int num = ran.nextInt(count);
        getShopName(arrName,num);
    }

    public void getShopName(String[] arrName,int num){
        this.shopName = arrName[num];
        System.out.println(shopName);
    }

    /*public void getGreat(String[] arrGreat,int num){
        this.shopGreat = arrGreat[num];
        System.out.println(shopGreat);
    }

    public void getData(String[] arrData,int num){
        this.shopData = arrData[num];
        System.out.println(shopData);
    }

    public void getRush(String[] arrGreat,int num){
        this.shopRush = arrRush[num];
        System.out.println(shopGreat);
    }*/

}
