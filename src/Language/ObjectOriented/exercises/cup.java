package Language.ObjectOriented.exercises;

public class cup {
    int v = 0;
    int volum = 0;

    void fillin(int volum, int t) {
        v += volum * t;
    }
    void fillout(int volum, int t) {
        v -= volum * t;
    }

    public static void main(String[] args) {
        cup cup1 = new cup();

        cup1.v = 10;
        cup1.fillin(10, 5);
        System.out.println(cup1.v);
        System.out.println();
    }
}