package com.github.evil94710;

public class insertData{
    private String name;
    private String great;
    private String data;
    private String rushtime;
    private String time;
    private int count;
    private int counting = 0;
    Scanner scn = new Scanner(System.in);

    public void getShopname(String name){
        this.name = name;
    }

    public int setCounting(){
        counting = 0;
        return counting;

    }

    public boolean checkList(Sting ...arrName){

        counting = setCounting;

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

    public int setCount(){                        /*  新增  */
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

    public void getRushtime(){
        System.out.print("請輸入該店家尖峰時間: ");
        rushtime = scn.nextLine();
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

    public void setRushtime(String ...arrRush){
        arrRush[count] = rushtime;
    }

    public void setTime(String ...arrTime){
        arrTime[count] = time;
    }





}
