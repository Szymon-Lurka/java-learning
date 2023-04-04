package AbstractFactory.Furniture;

import AbstractFactory.Chair.Chair;
import AbstractFactory.Chair.VictorianChair;
import AbstractFactory.Sofa.Sofa;
import AbstractFactory.Sofa.VictorianSofa;
import AbstractFactory.Table.Table;
import AbstractFactory.Table.VictorianTable;

public class VictorianFurniture implements Furniture {
    @Override
    public Table createTable() {
        return new VictorianTable();
    }

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
