package TrickyAverage;

public class TrickyAverage {
    public static void main(String[] args) {
        int[] myIntArray = {3, 5, 6, 11};
        System.out.println(getTrickyAvg(myIntArray));
    }
    public static int getTrickyAvg(int [] trickyArray){
        int smallestOdd = 0;
        boolean firstOddnumber = true;
        for (int i = 0; i <trickyArray.length ; i++) {
            if (Math.abs(trickyArray[i] % 2) == 1  && firstOddnumber){
                smallestOdd = trickyArray[i];
                firstOddnumber = false;
            }else if(trickyArray[i] % 2 == 1 && trickyArray[i] < smallestOdd){
                smallestOdd = trickyArray[i];
            }
        }
        int largestEven = 0;
        boolean firstEvenNumber = true;
        for (int i = 0; i <trickyArray.length ; i++) {
            if (trickyArray[i] % 2 == 0 && firstEvenNumber){
                largestEven = trickyArray[i];
                firstEvenNumber = false;
            }else if(trickyArray[i] % 2 == 0 && trickyArray[i] > largestEven){
                largestEven = trickyArray[i];
            }
        }
        int average = (largestEven + smallestOdd) / 2;
        return average;
    }
    /**
     * Create and test a function called `getTrickyAvg` that takes a number array (only integers) as parameter
     * and returns the average of the smallest odd and largest even.
     *  - use only basic control flow statements, like 'for', 'if', etc.
     *  - do not use built-in methods like 'filter', 'forEach', 'map', etc.
     *  - write test for 2 different scenarios (test file is provided: TrickyAverageTest.java)
     *
     * Example cases:
     * [1, 2, 3] -> should return 1.5
     * [3, 4, 5, 6] -> should return 4.5
     * [5, 2, 8, -1] -> should return 3.5
     */

}
