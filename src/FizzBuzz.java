/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {


        int i = 1;
        while (i < 100) {
            i = doFizzBuzz(i);
        }
    }

    public static int doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {
            i++;
            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {
            i++;
            System.out.println("Fizz");

        } else if (divisibleBy5) {
            i++;
            System.out.println("Buzz");

        } else {
            i++;
            System.out.println(i);

        }
        return i;
    }
}
