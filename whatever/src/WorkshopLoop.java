
public class WorkshopLoop {

    public static void main(String[] args) {
        int start = 9;
        // Line1
        for (int i = 0; i < start; i++) {
            if (i == 1 || i == 2 || i == 6 || i == 7) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        newLine();
        // Line2
        for (int i = 0; i < start; i++) {
            if (i == start / 2) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        newLine();
        // Line3-7
        for (int round = 0; round < 5; round++) {
            generateSpace(round);
            generateStar(start);
            newLine();
            start = start - 2;
        }

    }

    private static void newLine() {
        System.out.println();
    }

    private static void generateStar(int start) {
        for (int i = 0; i < start; i++) {
            System.out.print("*");
        }
    }

    private static void generateSpace(int round) {
        for (int i = 0; i < round; i++) {
            System.out.print(" ");
        }
    }

}
