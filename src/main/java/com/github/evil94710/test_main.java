package com.github.evil94710;



public class test_main {

    Scanner keyboard = new Scanner(System.in);
    insertData insert = new insertData();
    String ans;

    while(true){

        while (true) {
            System.out.print:("請輸入店家名稱:");
            String name = keyboard.nextLine();

            if (name.equals(""))
                System.out.println("輸入錯誤");
            else
                break;
        }

        boolean check = insert.checkList(arrName);
        if (check == true) {

            int counting = insert.setCounting();
            System.out.println(name+" (原資料)");
            System.out.println("評價:"+arrGreat[counting]);
            System.out.println("資訊:"+arrData[counting]);
            System.out.println("尖峰時間:"+arrRush[counting]);
            System.out.println("營業時間:"+arrTime[counting]);

            while (true){
                insert.getGreat();
                insert.getData();
                insert.getRushtime();
                insert.getTime();

                System.out.println("是否新增資料: Y / N");
                ans = keyboard.nextLine();
                if (ans.equalsIgnoreCase(Y))
                    break;
            }

            insert.getCounting();
            insert.setName(arrName);
            insert.setGreat(arrGreat);
            insert.setData(arrData);
            insert.setRush(arrRush);
            insert.setTime(arrTime);

            System.out.print("新增新增資料成功, 使否離開此功能? Y/N");
            ans = keyboard.nextLine();
            if (ans.equalsIgnoreCase(Y))
                break;

        } else {

            System.out.println("是否新增名單: Y / N");
            ans = keyboard.nextLine();

            if (ans.equalsIgnoreCase(Y)) {

                while (true) {

                    insert.motd();
                    insert.getGreat();
                    insert.getData();
                    insert.getRushtime();
                    insert.getTime();

                    System.out.println("是否新增資料: Y / N");
                    ans = keyboard.nextLine();
                    if (ans.equalsIgnoreCase(Y))
                        break;
                }

                insert.getCount(count);
                insert.setName(arrName);
                insert.setGreat(arrGreat);
                insert.setData(arrData);
                insert.setRush(arrRush);
                insert.setTime(arrTime);

                count = setCount();

                System.out.print("新增新增資料成功, 使否離開此功能? Y/N");
                ans = keyboard.nextLine();
                if (ans.equalsIgnoreCase(Y))
                    break;

            } else {
                System.out.println("重新輸入店家名稱");
            }
        }
    }

}


