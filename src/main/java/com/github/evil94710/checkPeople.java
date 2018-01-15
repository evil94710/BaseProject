package com.github.evil94710;

public class checkPeople {

    private String shopName;
    private String rushTime;

    public void setShopName(String shopName){
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setRushTime(String rushTime){
        this.rushTime = rushTime;
    }

    public String getRushTime() {
        return rushTime;
    }
    public int checkShopName(String shopName,String[] arrName,String[] arrRush,int count){
        for (int i = 0 ; i < count ; i++) {
            if (arrName[i].equals(shopName)) {
                setRushTime(arrRush[i]);
                return i;
            }
        }
        return -1;
    }


}
