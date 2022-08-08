import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 1, 2, 4, 1, 4, 5};
        int[] frequency = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            frequency[i] = 1;
            for (int j = i + 1; j < list.length; j++) {
                if ((list[i] == list[j])) {
                    frequency[i]++;
                    list[j] = 0;
                }
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (frequency[i] > 1) {
                if (list[i] != 0) {
                    System.out.println("Number " + list[i] + " repeated " +  frequency[i] + " times.");
                }

            }
        }
    }
}
