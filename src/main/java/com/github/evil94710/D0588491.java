package com.github.evil94710;
import java.util.Random;

public class D0588491{
    private String shopName;
    private String shopGreat;
    private String shopData;
    private String shopRush;
    private String shopTime;

    public String randomShop(int count){
        Random ran = new Random();
        int num = ran.nextInt(count);
        getShopName(arrName[200],num);
        //getGreat(arrGreat[200],num);
        //getData(arrData[200],num);
        //getRush(arrRush[200],num);
        //getTime(arrTime[200],num);
        String[] arrName = new String[200];   //  店家名稱
        //String[] arrGreat = new String[200];  //  評價
        //String[] arrData = new String[200];   // 店家資訊
        //String[] arrRush = new String[200];   // 尖峰時間
        //String[] arrTime = new String[200];   // 營業時間
        //String[] arrClass = new String[200];  // 類別
        //return Name;
    }

    public void getShopName(String[] arrName,int num){
        this.shopName = arrName[num];
        System.out.println(shopName);
        //return shopName;
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
