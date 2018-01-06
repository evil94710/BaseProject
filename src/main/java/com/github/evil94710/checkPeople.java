package com.github.evil94710;

public class checkPeople {

    private String shopName;

    public void setShopName(String shopName){
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public int checkShopName(String shopName,String[] arrName){
        for (int i = 0 ; i < 200 ; i++) {
            if (arrName[i].equals(shopName)) {
                return i;
            }
        }
        return -1;
    }



}
