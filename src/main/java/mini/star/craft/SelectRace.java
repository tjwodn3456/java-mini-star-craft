package mini.star.craft;

import java.util.InputMismatchException;

public class SelectRace {
    private final Print print;
    private final InputReader inputReader;

    public SelectRace(Print print, InputReader inputReader) {
        this.print = print;
        this.inputReader = inputReader;
    }

    public Race select() {
        while (true) {
            print.askSelectRace();
            String userInput = inputReader.getValidStringInput();
            if (inputReader.isNumeric(userInput)) {
                print.raceMustStringInput();
            } else {
                Race playerRace = Race.fromString(userInput);
                if (playerRace != null) {
                    return playerRace;
                } else {
                    print.IncorrectRaceInput(userInput);
                }
            }
        }
    }
}

