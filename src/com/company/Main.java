package com.company;


class Vehicle{

    String model, type;
    int price, x, speed, average;

    public void carsName(){

        System.out.println("This Car Model Name is : " + model );
        System.out.println("This Car Type is : " + type );
        System.out.println("This Car Speed is : " + speed );
        System.out.println("This Car Price is : " + price );
        System.out.println("This Car Average is : " + average );

    }

    public void bikesName() {


        System.out.println("This Bike Model Name is : " + model );
        System.out.println("This Bike Type is : " + type );
        System.out.println("This Bike Speed is : " + speed );
        System.out.println("This Bike Price is : " + price );
        System.out.println("This Bike Average is : " + average );
    }
}
public class Main {

    public static void main(String[] args) {


        System.out.println("This is the Cars Names and Description : -");

        System.out.println("--------------------------------------");

        Vehicle ob = new Vehicle();
        ob.model = "Mustang";
        ob.type = "Sportz";
        ob.speed = 300;
        ob.price = 50000000;
        ob.average = 20;
        ob.carsName();

        System.out.println("--------------------------------------");

        Vehicle ob1 = new Vehicle();
        ob1.model = "Audi";
        ob1.type = "Sportz";
        ob1.speed = 250;
        ob1.price = 20000000;
        ob1.average = 25;
        ob1.carsName();

        System.out.println("--------------------------------------");

        Vehicle ob2 = new Vehicle();
        ob2.model = "Volvo";
        ob2.type = "Sportz";
        ob2.speed = 200;
        ob2.price = 10000000;
        ob2.average = 30;
        ob2.carsName();

        System.out.println("--------------------------------------");

        Vehicle ob3 = new Vehicle();
        ob3.model = "BMW";
        ob3.type = "Sportz";
        ob3.speed = 150;
        ob3.price = 5000000;
        ob3.average = 30;
        ob3.carsName();

        System.out.println("--------------------------------------");

        System.out.println("This is The Bike Names and Description : -");

        System.out.println("--------------------------------------");

        Vehicle ob4 = new Vehicle();
        ob.model = "Suzuki";
        ob.type = "Sportz";
        ob.speed = 400;
        ob.price = 5000000;
        ob.average = 10;
        ob.bikesName();

        System.out.println("--------------------------------------");

        Vehicle ob5 = new Vehicle();
        ob1.model = "BMW Motor";
        ob1.type = "Sportz";
        ob1.speed = 300;
        ob1.price = 2000000;
        ob1.average = 15;
        ob1.bikesName();

        System.out.println("--------------------------------------");

        Vehicle ob6 = new Vehicle();
        ob2.model = "Bajaj Pulsar";
        ob2.type = "Sportz";
        ob2.speed = 130;
        ob2.price = 100000;
        ob2.average = 50;
        ob2.bikesName();

        System.out.println("--------------------------------------");

        Vehicle ob7 = new Vehicle();
        ob3.model = "Hero";
        ob3.type = "Standard";
        ob3.speed = 80;
        ob3.price = 50000;
        ob3.average = 70;
        ob3.bikesName();

        System.out.println("--------------------------------------");



    }

}
