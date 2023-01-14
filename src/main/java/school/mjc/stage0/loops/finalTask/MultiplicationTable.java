package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){

        int i = 10;

        for (int f = 1; f <= i; f++) {

            int sum = f * numberTableToPrint;

            System.out.println(f + " x " + numberTableToPrint + " = " + sum);
        }

    }
}
