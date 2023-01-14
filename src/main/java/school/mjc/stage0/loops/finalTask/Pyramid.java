package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {

        for (int i = 1; i <= cathetusLength; i++) {

            //String centralPartOfLayer = "1";
            String leftPartOfLayer = "";
            String rightPartOfLayer = "";



            for (int f = cathetusLength; f > 1; f--) {

                if (f > i) {
                    leftPartOfLayer += " ";
                } else {
                    leftPartOfLayer += f;
                }

            }

            for (int f = 1; f <= cathetusLength; f++) {

                if (f <= i) {
                    rightPartOfLayer += f;

                }

            }


            String layer = leftPartOfLayer + rightPartOfLayer;

            System.out.println(layer);



        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
