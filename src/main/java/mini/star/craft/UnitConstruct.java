package mini.star.craft;

public class UnitConstruct {
    private final Factory factory;
    private final UnitData unitData;
    private final Print print;

    public UnitConstruct(UnitData unitData, Print print) {
        this.unitData = unitData;
        this.print = print;
        this.factory = Factory.getFactory();
    }


    public void unitConstruct(Race playerRace) {
        print.printConstructUnit();
        if (playerRace == Race.TERRAN) {
            int unitCount = 0;
            while (unitCount < 3) {
                TerranUnitName selectUnit = TerranUnitName.fromString(print.askSelectUnitTerran());
                unitData.saveUnit(factory.creatUnit(selectUnit));
                unitCount++;
            }
        }
        else if (playerRace == Race.ZERG) {
            int unitCount = 0;
            while (unitCount < 3) {
                ZergUnitName selectUnit = ZergUnitName.fromString(print.askSelectUnitZerg());
                unitData.saveUnit(factory.creatUnit(selectUnit));
                unitCount++;
            }
        }
    }
}