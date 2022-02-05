package chairs;

public class WoodenChairs extends Chair {

    public WoodenChairs (String color, double cost) {
        super("wood", color, cost);
    }

    public double getCostOfWoodenChairs () {

        return super.getCostOfChair();
    }
}

