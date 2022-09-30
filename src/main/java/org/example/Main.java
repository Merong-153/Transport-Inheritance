package org.example;

public class Main {
//    public static void main(String[] args) {
//        Bus bus1 = new Bus();
//        Bus bus2 = new Bus();
//        System.out.println("버스번호"+bus1.number);
//        System.out.println("버스번호"+bus2.number);
//        bus1.addperson(2);
//        bus1.gas(-50);
//        bus1.stop();
//        bus1.gas(10);
//        bus1.go();
//        bus1.addperson(45);
//        bus1.addperson(5);
//        bus1.gas(-55);
//
//    }

    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        taxi.addperson(2,"서울",2);
        taxi.print();
        taxi.gas(-80);
        taxi.pay();
        taxi.addperson(5, "서울",2);
        taxi.addperson(3, "구로디지털단지",12);
        taxi.print();
        taxi.gas(-20);
        taxi.print();
    }
}
