package mavenproject.chocolate;

public class chocolate {
    private double weight;
    private double price;



    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String name(String choco) {
        return choco + "{" +
                "weight=" + weight +
                ", price=" + price +
                '}';
    }


}
