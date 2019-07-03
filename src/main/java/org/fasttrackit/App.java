package org.fasttrackit;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

     // Game game = new Game();
     //   game.start();

        // String pool
        String a = "test";
        String b = "test";
        String c = new String("test");

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(c));

        Vehicle vehicle1=new Vehicle();
        vehicle1.setName("Dacia");

        Vehicle vehicle2=new Vehicle();
        vehicle2.setName("Dacia");

        System.out.println(vehicle1.equals(vehicle2));





//      Engine engine = new Engine();
//      engine.manufacturer = "Renault";
//
//      Car car = new Car(engine);
//
//      car.setName("Dacia") ;
//      car.setColor("blue");
//      car.dorCount = 4;
//      car.setMileage(9.5);
//      car.setFuelLevel(50);
//      car.setRunning(true);
//
//
//
//
//      Car car1 =new Car(engine);
//      car1.setName("Mercedes");
//      car1.setColor("rosu");
//      car1.setMaxSpeed(100);
//        car1.setMileage(5.1);
//        car1.setFuelLevel(100);
//      car1.setRunning(false);
//
//      Car car3 = car;
//
//        System.out.println(car.getName());
//        System.out.println(car3.getName());
//      System.out.println("Changing value...");
//
//      car.setName("Dacia Logan");
//
//
//      System.out.println(car.getName());
//      System.out.println(car3.getName());
//
//      System.out.println(car.getMaxSpeed());
//      System.out.println(car.engine);
//      System.out.println("Our engine");
//      System.out.println(car.engine.manufacturer);
//
//      double distance = car.accelerate(60,0.5);
//        distance = car.accelerate(60,0.5);
//
//        System.out.println("Distance in App.main " + distance);
//      System.out.println("Studying static variables");
//
//
//// demo for static variabile
////      car.totalCount=1;
////      System.out.println("Total count from car:" + car.totalCount);
////
////      car3.totalCount=2;
////      System.out.println("Total count from car after setting car3:" + car.totalCount);
////      System.out.println("Total count from car3:" + car3.totalCount);
////      System.out.println("Total count from Vehicle class :"+ Vehicle.totalCount);
//
//      System.out.println("Total count from Vehicle class :"+Vehicle.getTotalCount());
//
//      car3.accelerate(100);
//
//      new AutoVehicle();
//
//      new Car();
//
//      System.out.println("Today...");
//      System.out.println(car.toString());
//
//      BatMobile batMobile = new BatMobile();
//      batMobile.setName("Cheating vevicle");
//
//      batMobile.accelerate(60,1);
//      batMobile.accelerate(60);
//      car.accelerate(60,1);

//      //polymorphism
//     Vehicle mobile = new BatMobile();
//     //method implementation invoker from object's class'
//      // not from class of the variable
//     mobile.accelerate(30,2);
//
//     // variable type determines  what methods
//      //we can invoke for the stored object
//     Vehicle testCar = new Car();
//      ((Car)testCar).getDoorCount();
//
//      Car casteCar =(Car) testCar;
//      casteCar.getDoorCount();









    }
}
