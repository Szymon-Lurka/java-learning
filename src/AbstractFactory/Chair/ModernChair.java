package AbstractFactory.Chair;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on Modern Chair!");
    }
}
