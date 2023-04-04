package AbstractFactory.Furniture;

import AbstractFactory.Chair.Chair;
import AbstractFactory.Sofa.Sofa;
import AbstractFactory.Table.Table;

public interface Furniture {
    Chair createChair();

    Sofa createSofa();

    Table createTable();
}
