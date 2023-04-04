package FactoryMethod.buttons;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendered linux button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Linux button clicked!");
    }
}
