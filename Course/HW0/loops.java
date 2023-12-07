public class loops {
    public static int whileSum(int[] a) {
        int i = 0;
        int sum = 0;
        while (i < a.length) {
            sum = sum + a[i];
            i += 1;
        }
        return sum;
    }
    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i += 1) {
            sum = sum + a[i];
        }
        return sum;
    }
    public static int forMax(int[] m) {
        for (int l = m.length-1, inter = 0; l > 0; l -= 1) {
            if (m[l] > m[l-1]) {
                inter = m[l];
                m[l] = m[l-1];
                m[l-1] = inter;
            }
        }
        return m[0];
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(forMax(numbers));
        System.out.println(whileSum(numbers));
        System.out.println(sum(numbers));

        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};
        for (String s : a) {
            for (int j = 0; j < 3; j += 1) {
                System.out.println(s);
                if (s.contains("horse")) {
                    break;
                }
            }
        }
    }
}