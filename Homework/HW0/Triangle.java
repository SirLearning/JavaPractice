public class Triangle {
    public static void main(String[] arg) {
        int control = 1;
        int counter = 0;
        int n = 6;
        while (control < n + 1) {
            if (counter < control) {
                System.out.print("*");
                counter += 1;
            } else {
                counter = 0;
                control += 1;
                System.out.print("\n");
            }
        }
    }
}