package mini.star.craft;

public class UnitConstruct {
    private final Factory factory;
    private final UnitData unitData;
    private final Print print;
    private final InputReader inputReader;

    public UnitConstruct(UnitData unitData, Print print, InputReader inputReader) {
        this.unitData = unitData;
        this.print = print;
        this.factory = Factory.getFactory();
        this.inputReader = inputReader;
    }


    public void unitConstruct(Race playerRace) {
        print.printConstructUnit();
            int unitCount = 0;
            while (unitCount < 3) {
                playerRace.askForUnitName(print);
                String input = inputReader.getValidStringInput();
                if (inputReader.isNumeric(input)) {
                    print.unitConstructMustStringInput();
                }
                Unit selectUnit = playerRace.creatByUnitName(input, factory);
                if (selectUnit == null) {
                    print.IncorrectUnitInput(input);
                    continue;
                }
                unitData.saveUnit(selectUnit);
                unitCount++;
            }
    }
}
