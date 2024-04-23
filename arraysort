import java.util.Arrays;
class sort {
    public static void main(String args[]) {

        String names[] = {"virat", "jadeja", "messi", "zaka"};
        int len = names.length;
        for (
                int i = 0;
                i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;


                }
            }

        }
        System.out.println(Arrays.toString(names));
    }
}
