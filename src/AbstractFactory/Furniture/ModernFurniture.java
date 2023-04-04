package AbstractFactory.Furniture;

import AbstractFactory.Chair.Chair;
import AbstractFactory.Chair.ModernChair;
import AbstractFactory.Sofa.ModernSofa;
import AbstractFactory.Sofa.Sofa;
import AbstractFactory.Table.ModernTable;
import AbstractFactory.Table.Table;

public class ModernFurniture implements Furniture {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
