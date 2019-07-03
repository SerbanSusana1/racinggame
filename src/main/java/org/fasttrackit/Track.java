package org.fasttrackit;

public class Track {
    private String name;
    private double lengh;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLengh() {
        return lengh;
    }

    public void setLengh(double lengh) {
        this.lengh = lengh;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", lengh=" + lengh +
                '}';
    }
}
