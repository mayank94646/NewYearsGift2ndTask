package mavenproject.chocolate;

public class ferreroRocher extends chocolate {

    public ferreroRocher()
    {
        super.setPrice(500);
        super.setWeight(125);
    }

    @Override
    public String toString() {
        return name("ferreroRocher");
    }
}
