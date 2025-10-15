package mini.star.craft;

public enum Race {
    TERRAN, ZERG;


    public static Race fromString(String input) {
        for (Race race : values()) {
            if (race.name().equalsIgnoreCase(input)) {
                return race;
            }
        }
        return null;
    }
}
