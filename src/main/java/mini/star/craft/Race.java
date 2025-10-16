package mini.star.craft;

public enum Race {
    TERRAN{
        @Override
        public Unit creatByUnitName(String unitName, Factory factory) {
            TerranUnitName name = TerranUnitName.fromString(unitName);
            return (name != null) ? factory.creatUnit(name) : null;
        }

        @Override
        public void askForUnitName(Print print) {
            print.askSelectUnitTerran();
        }
    }, ZERG{
        @Override
        public Unit creatByUnitName(String unitName, Factory factory) {
            ZergUnitName name = ZergUnitName.fromString(unitName);
            return (name != null) ? factory.creatUnit(name) : null;
        }

        @Override
        public void askForUnitName(Print print) {
            print.askSelectUnitZerg();
        }
    };

    public abstract Unit creatByUnitName(String unitName, Factory factory);
    public abstract void askForUnitName(Print print);



    public static Race fromString(String input) {
        for (Race race : values()) {
            if (race.name().equalsIgnoreCase(input)) {
                return race;
            }
        }
        return null;
    }
}
