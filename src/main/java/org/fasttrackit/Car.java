package org.fasttrackit;

import java.time.LocalDate;


// inheritance "is-a" relashionship
public class Car  extends AutoVehicle{

    int dorCount;


    public Car(Engine engine) {
        super(engine);
    }
    public Car(){
        // any constructor will try to call the "no-parameter"
    }
}
