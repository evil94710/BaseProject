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

    public void getShopName(String name){
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
            System.out.println("開始新增 " + name + " 資訊(輸入不可為空)");
        }

    public void setCount(int counting){              /*  新增店家 總店家數+1*/
        this.count = counting ;
    }
    public void setCount(int count,int num){              /*  新增店家 總店家數+1*/
        this.count = count + num  ;
    }
    public int returnCount(){                     /* 回傳店家數*/
        return count;
    }
    public void errorInput(){
        System.out.println("輸入不可為空");
    }
    public int getGreat(){
        System.out.print("請輸入該店家評價: ");
        great = scn.nextLine();
        if(great.trim().isEmpty())
            return 0;
        else
            return 1;
    }

    public int getData(){
        System.out.print("請輸入該店家資訊: ");
        data = scn.nextLine();
        if(data.trim().isEmpty())
            return 0;
        else
            return 1;
    }

    public int getRush(){
        System.out.print("請輸入該店家尖峰時間: ");
        rushTime = scn.nextLine();
        if(rushTime.trim().isEmpty())
            return 0;
        else
            return 1;
    }

    public int getTime(){
        System.out.print("請輸入該店家營業時間: ");
        time = scn.nextLine();
        if(time.trim().isEmpty())
            return 0;
        else
            return 1;
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
