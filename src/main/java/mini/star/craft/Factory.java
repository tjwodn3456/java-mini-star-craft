package mini.star.craft;

public class Factory {
    private static final Factory factory = new Factory();

    private Factory(){}

    public static Factory getFactory(){
        return factory;
    }


    private int unitIdCounter = 0;
    
    // Terran 용
    public Unit creatUnit(TerranUnitName unitName){
        int newID = ++ unitIdCounter;
        return unitName.create(newID);
    }
    // Zerg 용
    public Unit creatUnit(ZergUnitName unitName){
        int newID = ++ unitIdCounter;
        return unitName.create(newID);
    }
}
