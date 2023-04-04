package AbstractFactory;
import AbstractFactory.Furniture.*;

public class FurnitureFactory {
    public Furniture create(FurnitureType furnitureType) {
        switch (furnitureType) {
            case MODERN -> {
                return new ModernFurniture();
            }
            case VICTORIAN -> {
                return new VictorianFurniture();
            }
            default -> {
                return null;
            }
        }
    }
}
