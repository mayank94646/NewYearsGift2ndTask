package mavenproject.toffee;

public class melody implements toffee {

    private double price = 0;
    private double weight = 0;
    public melody()
    {
        setPrice(5);
        setWeight(2);
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
        return "melody{" +
                "price=" + price +
                ", weight=" + weight +
                '}';
    }
}
