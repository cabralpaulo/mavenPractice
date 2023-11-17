package week7;

public class Pool {
    private String name; //Name Field
    private double length; //Length Field

    Pool(String name, double length){ //Constructor
        this.name = name;
        this.length = length;
    }

    public double distanceForLaps (int laps){ //Instance Methods
        return laps * length;
    }

    @Override
    public String toString(){ //Instance Methods
        return name + " pool is " + length + " meters long ";
    }

}


