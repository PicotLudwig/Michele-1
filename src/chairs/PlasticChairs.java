package chairs;

public class PlasticChairs extends Chair {



    public PlasticChairs (String color, double cost) {
        super("plastic", color, cost);
    }

    public double getCostofPlasticChairs () {
        return super.getCostOfChair();
    }
}