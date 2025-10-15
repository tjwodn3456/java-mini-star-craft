package mini.star.craft;

public enum TerranUnitName {
    MARIN {
        @Override
        public Unit create(int id) {
            return new Marin(id);
        }
    };

    public abstract Unit create(int id);


    public static TerranUnitName fromString(String input) {
        for (TerranUnitName unitName : values()) {
            if (unitName.name().equalsIgnoreCase(input)) {
                return unitName;
            }
        }
        return null;
    }
}
