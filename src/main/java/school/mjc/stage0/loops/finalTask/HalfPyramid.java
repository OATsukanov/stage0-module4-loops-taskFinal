package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {

        for (int i = 0; i < cathetusLength; i++) {

            String layer = "";
            for (int f = 1; f <= cathetusLength; f++)

                if (f >= cathetusLength - i) {
                    layer += "*";
                } else {
                    layer += " ";
                }

            System.out.println(layer);

        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
