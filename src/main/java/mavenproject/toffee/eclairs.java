package mavenproject.toffee;

public class eclairs implements toffee {

    private double price = 0;
    private double weight = 0;
    public eclairs()
    {
        setPrice(10);
        setWeight(5);
    }
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "eclairs{" +
                "price=" + price +
                ", weight=" + weight +
                '}';
    }
}
