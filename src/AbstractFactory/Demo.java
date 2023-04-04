package AbstractFactory;

import AbstractFactory.Chair.Chair;
import AbstractFactory.Furniture.Furniture;
import AbstractFactory.Sofa.Sofa;
import AbstractFactory.Table.Table;

public class Demo {
    static Furniture furniture;
    static Chair chair;
    static Table table;
    static Sofa sofa;

    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new FurnitureFactory();
        furniture = furnitureFactory.create(FurnitureType.VICTORIAN);
        createFurniture();
        chair.sitOn();
        table.drinkCoffee();
        sofa.layOn();
    }

    public static void createFurniture() {
        chair = furniture.createChair();
        table = furniture.createTable();
        sofa = furniture.createSofa();
    }
}
