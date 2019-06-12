package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Car car = new Car();

      car.name = "Dacia";
      car.color ="blue";
      car.dorCount = 4;
      car.mileage = 9.5;
      car.fuelLevel = 50;
      car.running = true;

       Engine engine1 = new Engine();
       engine1.manufacturer = "Renault";
       car.engine =engine1;


      Car car1 =new Car();
      car1.name ="Mercedes";
      car1.color = "rosu";
      car1.maxSpeed = 100;
        car1.mileage = 5.1;
        car1.fuelLevel = 100;
      car1.running = false;

      Car car3 = car;

        System.out.println(car.name);
        System.out.println(car3.name);
      System.out.println("Changing value...");

      car.name="Dacia Logan";


      System.out.println(car.name);
      System.out.println(car3.name);

      System.out.println(car.maxSpeed);
      System.out.println(car.engine);
      System.out.println("Our engine");
      System.out.println(car.engine.manufacturer);

      double distance = car.accelerate(60,0.5);

        System.out.println("Distance in App.main " + distance);



    }
}
