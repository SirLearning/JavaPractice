package HW0;

public class max {
    public static int max(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }
    public static int maxarray(int[] m) {
        int l = m.length-1;
        int inter = 0;
        while (true) {
            if (l-1 >= 0) {
                if (m[l] > m[l-1]) {
                    inter = m[l];
                    m[l] = m[l-1];
                    m[l-1] = inter;
                };
                l -= 1;
            } else {
                return m[0];
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(max(10, 15));
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(maxarray(numbers));
        System.out.println(numbers);
    }
}