package Animals;

public class Dog implements Animal {

    @Override
    public void Voice() {
        System.out.println("Bark-bark");
    }

    @Override
    public void Walk() {
        System.out.println("Dog is walking");
    }
}
