package FactoryMethod.factory;

import FactoryMethod.buttons.Button;

public abstract class Dialog {

    // Each Dialog subclass will have a corresponding button rendering for the respective system.
    public void render() {
        Button button = createButton();
        button.render();
    }

    // Each subclass creates its own button type.
    public abstract Button createButton();
}
