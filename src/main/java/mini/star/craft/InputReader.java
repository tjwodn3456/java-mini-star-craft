package mini.star.craft;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputReader {
    private final Scanner scanner = new Scanner(System.in);
    private final Print print;

    public InputReader(Print print) {
        this.print = print;
    }


    public int getValidIntegerInput(){
        while (true){
            try {
                int input = scanner.nextInt();
                bufferScanner();
                return input;
            } catch (InputMismatchException e) {
                print.printMustIntegerInput();
                bufferScanner();
            }
        }
    }
    public String getValidStringInput(){
        return scanner.nextLine();
    }
    public boolean isNumeric(String string){
        if (string == null || string.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(string);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    public void bufferScanner(){scanner.nextLine();}
}
