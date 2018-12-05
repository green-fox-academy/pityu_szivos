public class Try {
    public static void main(String[] args) {
        int [] inputArray = {2, 5, 7, 9};
            double largestEven = inputArray[0];
            double smallestOdd = inputArray[0];
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] % 2 == 0) {
                    if (largestEven < inputArray[i]) {
                        largestEven = inputArray[i];
                    }
                } else {
                    if (smallestOdd > inputArray[i]) {
                        smallestOdd = inputArray[i];
                    }
                }
            }

            double average = (largestEven + smallestOdd) / 2.0;
        System.out.println(average);
        }
    }
