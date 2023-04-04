package FactoryMethod;

import FactoryMethod.factory.Dialog;
import FactoryMethod.factory.HtmlDialog;
import FactoryMethod.factory.LinuxDialog;
import FactoryMethod.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        // Starting configuration - creating the appropriate dialog
        configure();
        // Running business logic. Each dialogue, regardless of the system, has the same methods.
        runBusinessLogic();
    }

    static void configure() {
        // Depending on the operating system, the appropriate type of dialogue is created, with the appropriate logic for displaying the dialogue on a particular device.
        // Each dialog extends the Dialog class, so it has the same methods. Only the implementation differs.
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else if(System.getProperty("os.name").equals("WHATEVER_OS")){
            dialog = new HtmlDialog();
        } else {
            dialog = new LinuxDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.render();
    }
}
