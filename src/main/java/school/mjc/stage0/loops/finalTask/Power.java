package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {

        int numberOfPrintPrime = numberToPrint;

        for (int i = 1; i < power; i++) {

            numberToPrint = numberToPrint * numberOfPrintPrime;

        }

        System.out.println(numberToPrint);

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
