package activity2;

public class Calculator {
    public int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public int subtract(int x, int y) {
      return x-y;
        }



    private static int multiply(int[] numbers) {
        int temp = 1;

        for (int i = 0; i < numbers.length; i++) {
            temp = temp * numbers[i];
        }
        return temp;

    }

    private static int divide(int x, int y) {
        int divValue = 0;
        if (x == 0 || y == 0) {
            System.out.println("One of the number is 0, I can't do the divide operation");
            divValue = 0;
            return divValue ;

        } else {
            divValue = x/y;

        }
        return divValue;

    }
}