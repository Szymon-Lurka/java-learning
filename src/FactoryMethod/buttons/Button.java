package FactoryMethod.buttons;

public interface Button {
    // Each button will have a rendering option appropriate to the system.
    void render();
// Same with onClick.
    void onClick();
}
