package com.github.evil94710;

import java.util.Scanner;

public class insertData{
    private String name;
    private String great;
    private String data;
    private String rushTime;
    private String time;
    private int count;
    private int counting = 0;
    Scanner scn = new Scanner(System.in);

    public void getShopName(String name){
        this.name = name;
    }

    public int setCounting(){
        counting = 0;
        return counting;

    }

    public int setCounting(int num){
        counting = count + num;
        return counting;

    }

    public boolean checkList(String... arrName){

        counting = setCounting();

        for(String search : arrName){

            if(name.equals(search))
                return true;

            counting++;
        }
        return false;

    }

    public int counting(){                         /*  已有  */
        return counting;
    }
    public void getCounting(){                     /*  已有  */
        count = counting;
    }

    public void motd() {
            System.out.println("開始新增 " + name + " 資訊");
        }



    public void getCount(int count){              /*  新增  */
        this.count = count+1 ;
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

    public void setName(String ...arrName){
        arrName[count] = name;
    }

    public void setGreat(String ...arrGreat) {
        arrGreat[count] = great;
    }

    public void setData(String ...arrData){
        arrData[count] =  data;
    }

    public void setRush(String ...arrRush){
        arrRush[count] = rushTime;
    }

    public void setTime(String ...arrTime){
        arrTime[count] = time;
    }





}
