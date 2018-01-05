package com.github.evil94710;

public class checkPeople {

    private String shopName;

    public void setShopName(String shopName){
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public boolean checkShopName(String shopName){
        for (String element:name) {
            if (element.equals(shopName)) {
                return true;
            }
        }
        return false;
    }


}
