
public class PracticeWithXOR {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 3, 4, 2, 5};

        int xor = 0;
        for (int j : arr) {
            xor ^= j;
        }

        System.out.println(xor);
    }

}
