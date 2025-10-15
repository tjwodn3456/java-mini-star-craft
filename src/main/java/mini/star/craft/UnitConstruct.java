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
                String input = print.askSelectUnitTerran();
                TerranUnitName selectUnit = TerranUnitName.fromString(input);
                if (selectUnit == null) {
                    print.printIncorrectUnit(input);
                    continue;
                }
                unitData.saveUnit(factory.creatUnit(selectUnit));
                unitCount++;
            }
        }
        else if (playerRace == Race.ZERG) {
            int unitCount = 0;
            while (unitCount < 3) {
                String input = print.askSelectUnitZerg();
                ZergUnitName selectUnit = ZergUnitName.fromString(input);
                if (selectUnit == null) {
                    print.printIncorrectUnit(input);
                    continue;
                }
                unitData.saveUnit(factory.creatUnit(selectUnit));
                unitCount++;
            }
        }
    }
}