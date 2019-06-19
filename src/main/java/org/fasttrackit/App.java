package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Engine engine = new Engine();
      engine.manufacturer = "Renault";

      Car car = new Car(engine);

      car.setName("Dacia") ;
      car.setColor("blue");
      car.dorCount = 4;
      car.setMileage(9.5);
      car.setFuelLevel(50);
      car.setRunning(true);




      Car car1 =new Car(engine);
      car1.setName("Mercedes");
      car1.setColor("rosu");
      car1.setMaxSpeed(100);
        car1.setMileage(5.1);
        car1.setFuelLevel(100);
      car1.setRunning(false);

      Car car3 = car;

        System.out.println(car.getName());
        System.out.println(car3.getName());
      System.out.println("Changing value...");

      car.setName("Dacia Logan");


      System.out.println(car.getName());
      System.out.println(car3.getName());

      System.out.println(car.getMaxSpeed());
      System.out.println(car.engine);
      System.out.println("Our engine");
      System.out.println(car.engine.manufacturer);

      double distance = car.accelerate(60,0.5);
        distance = car.accelerate(60,0.5);

        System.out.println("Distance in App.main " + distance);
      System.out.println("Studying static variables");


// demo for static variabile
//      car.totalCount=1;
//      System.out.println("Total count from car:" + car.totalCount);
//
//      car3.totalCount=2;
//      System.out.println("Total count from car after setting car3:" + car.totalCount);
//      System.out.println("Total count from car3:" + car3.totalCount);
//      System.out.println("Total count from Vehicle class :"+ Vehicle.totalCount);

      System.out.println("Total count from Vehicle class :"+Vehicle.getTotalCount());






    }
}
