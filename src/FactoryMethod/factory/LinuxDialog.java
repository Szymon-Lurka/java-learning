package FactoryMethod.factory;

import FactoryMethod.buttons.Button;
import FactoryMethod.buttons.LinuxButton;

public class LinuxDialog extends Dialog {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
