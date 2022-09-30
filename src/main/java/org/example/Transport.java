package org.example;


public class Transport {

    static int cnt=1003;
    int number;
    int fuel=100;
    int speed;
    int personnow;
    int personmax;

    int totalmoney;

    int money;
    boolean run = true;


    void num(){
    number+=1;
    }


    void go(){
        run = true;
        System.out.println("운행중");
    }
    void stop(){
        run = false;
        personnow=0;
        System.out.println("차고지행" );

    }

    void addperson(int person){
        if(person > personmax  ){
            System.out.println("최대 승객수 초과");
        }else{
            this.personnow += person;
            personmax -=person;
            System.out.println("탑승승객 수:"+personnow);
            System.out.println("잔여승객 수:" +personmax);
        }
    }
void gas(int fuel){
        this.fuel+=fuel;
    System.out.println(this.fuel);
        if(fuel<10){
            stop();
            System.out.println("주유필요");
        }

}


}
