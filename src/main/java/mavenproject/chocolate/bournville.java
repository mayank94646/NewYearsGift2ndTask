package mavenproject.chocolate;

public class bournville extends chocolate {
    public bournville()
    {
        super.setPrice(100);
        super.setWeight(105);
    }

    @Override
    public String toString() {
        return name("bournville");
    }
}
