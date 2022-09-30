package org.example;

public class Bus extends Transport{



    void addperson (int person){
        super.addperson(person);
        if(person < personmax){
            totalmoney = person*1000;
            System.out.println("요금확인"+totalmoney);
        }


    }

Bus(){
    number = cnt++;
    fuel = fuel;
    speed = speed;
    personmax = 30;
    money = 1000;

}
}
