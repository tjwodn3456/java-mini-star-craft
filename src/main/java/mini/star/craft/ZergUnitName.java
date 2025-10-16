package mini.star.craft;

public enum ZergUnitName {
    ZERGGLING{
        @Override
        public Unit create(int id) {
            return new Zerggling(id);
        }
    },
    HYDRA {
        @Override
        public Unit create(int id) {
            return new Hydra(id);
        }
    };

    public abstract Unit create(int id);

    public static ZergUnitName fromString(String input) {
        for (ZergUnitName unitName : values()) {
            if (unitName.name().equalsIgnoreCase(input)) {
                return unitName;
            }
        }
        return null;
    }

}
