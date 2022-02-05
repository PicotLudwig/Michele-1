package chairs;

public class Chair {
    private String material;
    private String color;
    private double cost;
    int example = 1;
    protected String proprietaire;

    public Chair(String material, String color, double cost) {
        int example = 1;
        this.material = material;
        this.color = color;
        this.cost = cost;
    }

    public double getCostOfChair() {
        int example = 1;
        return cost;
    }
}


