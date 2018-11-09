public class practice_divideZero {

    public static void main(String[] args) {


        int a = 15;
        int b = 2;

        divideZero(a, b);


            }


    public static void divideZero(int a_in, int b_in){

        try { // Prevents the program breaking when attempting dividing by zero
            int result = a_in / b_in; // If the input value for divisor was 0 it stops the try block
            System.out.println(result); // The program doesn't reach this line if the input was 0
        } catch (ArithmeticException e) {
            System.out.println("Fail"); // This line only runs if the input was 0
        }
    }
}
