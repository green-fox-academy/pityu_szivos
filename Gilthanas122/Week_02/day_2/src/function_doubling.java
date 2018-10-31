public class function_doubling {
    public static void main(String[] args) {

        // - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`
        int baseNum = 123;
        doubling_java(baseNum);
        System.out.print(doubling_java(baseNum));
    }
        public static int doubling_java(int a_number)
                {
            int double_thing = a_number *2;
            return double_thing;
        }


    }
