package com.github.evil94710;

import java.util.Scanner;

public class insertData{
    private String name;
    private String great;
    private String data;
    private String rushTime;
    private String time;
    private int count;
    private int counting;
    Scanner scn = new Scanner(System.in);

    public void getShopName(String name){    /*傳入要新增或修改的店家名稱*/
        this.name = name;
    }

    public int setCounting(){         /*初始化計數*/
        counting = 0;
        return counting;

    }



    public boolean checkList(String[] arrName){

        counting = 0;

        for(String search : arrName){

            if(name.equals(search))
                return true;

            counting++;
        }
        return false;

    }

    public int returnCounting(){                         /*  已有  */
                           /*回傳店家的在店家中的位置*/
        return counting;
    }
    public void getCounting(){                     /*  已有  */
        count = counting;
    }

    public void motd() {
            System.out.println("開始新增 " + name + " 資訊");
        }



    public void getCount(int counting){              /*  新增店家 總店家數+1*/
        this.count = counting ;
    }
    public void getCount(){              /*  新增店家 總店家數+1*/
        this.count = count + 1  ;
    }
    public int returnCount(){                     /* 回傳店家數*/
        return count;
    }

    public void getGreat(){
        System.out.print("請輸入該店家評價: ");
        great = scn.nextLine();
    }

    public void getData(){
        System.out.print("請輸入該店家資訊: ");
        data = scn.nextLine();
    }

    public void getRush(){
        System.out.print("請輸入該店家尖峰時間: ");
        rushTime = scn.nextLine();
    }

    public void getTime(){
        System.out.print("請輸入該店家營業時間: ");
        time = scn.nextLine();
    }

    public String[] setName(String ...arrName){
        arrName[count] = name;
        return arrName;
    }

    public String[] setGreat(String ...arrGreat) {
        arrGreat[count] = great;
        return arrGreat;
    }

    public String[] setData(String ...arrData){
        arrData[count] =  data;
        return arrData;
    }

    public String[] setRush(String ...arrRush){
        arrRush[count] = rushTime;
        return arrRush;
    }

    public String[] setTime(String ...arrTime){
        arrTime[count] = time;
        return arrTime;
    }





}
