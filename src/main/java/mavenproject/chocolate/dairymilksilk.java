package mavenproject.chocolate;

public class dairymilksilk extends chocolate {
    public dairymilksilk()
    {
        super.setPrice(200);
        super.setWeight(100);
    }

    @Override
    public String toString() {
        return name("dairymilksilk");
    }
}
