class OddPattern {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5};

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[j]);

                if (j < numbers.length - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}