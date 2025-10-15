package mini.star.craft;

import java.util.InputMismatchException;

public class SelectRace {
    private final Print print;

    public SelectRace(Print print) {
        this.print = print;
    }

    public Race select() {
        try {
            Race playerRace = Race.fromString(print.askSelectSpecies()); // 종족 선택값이 더 외부에 있어야한다.
            return playerRace;
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력 값 입니다. 다시 입력하세요.");
        }
        return null;
    }

}
