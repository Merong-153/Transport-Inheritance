package org.example;

import org.w3c.dom.ls.LSOutput;

public class Taxi extends Transport {


    int distance;
    int basicdist = 1;
    int distmoney = 1000;
    String dest;
    String[] arr = {"일반", "운행중", "운행불가"};
    String stat = arr[0];
    int paymoney;
    int totaldistance;
    int person;


    void dest(int person, String des, int km) {
        this.person = person;
        dest = des;
        distance = km;
    }

    Taxi() {
        number = cnt++;
        personmax = 4;
        money = 3000;

    }

    @Override
    void stop() {
        super.stop();
        stat = arr[2];
        System.out.println();
    }

    @Override
    void addperson(int person) {
        super.addperson(person);

    }

    void addperson(int person, String dest, int totaldistance) {
        if (stat == arr[0] && person <= personmax) {
            personnow += person;
            this.dest = dest;
            this.totaldistance = totaldistance;
            paymoney = money + ((totaldistance - basicdist) * distmoney);
            stat = arr[1];
            System.out.println(person + "명 탑승했습니다");
        } else {
            System.out.println("인원초과");
        }
    }

    void pay() {
        totalmoney += paymoney;
        paymoney = 0;
        dest = "";
        personnow = 0;
        if (fuel >= 10) {
            stat = arr[0];
        } else {
            stat = arr[2];
        }
    }

    void print() {
        System.out.println("잔여승객수" + (personmax - personnow));
        System.out.println("기본요금 확인" + money);
        System.out.println("목적지" + dest);
        System.out.println("목적지까지 거리" + totaldistance);
        System.out.println("지불할요금" + paymoney);
        System.out.println("총요금"+totalmoney);
        System.out.println(stat);
    }
}
