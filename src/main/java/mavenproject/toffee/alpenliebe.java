package mavenproject.toffee;

public class alpenliebe implements toffee {

    private double price = 0;
    private double weight = 0;
    public alpenliebe()
    {
        setPrice(2);
        setWeight(3);
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
        return "alpenliebe{" +
                "price=" + price +
                ", weight=" + weight +
                '}';
    }
}

