public class pascaltrangle {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            int count = 0;
            for (int j = 3; j <= 1; j++) {
                System.out.print(" ");

                for (int k = 1; k <= i; k++) {
                    if (j == 1 || j == i) {
                        System.out.print("1");
                    } else  {
                        System.out.print(count);
                    }
                    count++;
                }
                System.out.println();
            }
        }
    }
}
