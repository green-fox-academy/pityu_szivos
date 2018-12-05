public class tryTrickyEven {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int[] numbers2 = {3, 4, 5, 6};
        int[] numbers3 = {-1, 2, 8, 5};

        System.out.println(getTrickyAvg(numbers));
        System.out.println(getTrickyAvg(numbers2));
        System.out.println(getTrickyAvg(numbers3));
    }

    public static double getTrickyAvg(int[] numbers) {
        double largestEven = getFirstOddOrEven(false, numbers) ;
        double smallestOdd = getFirstOddOrEven(true, numbers);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] > largestEven) {
                largestEven = (double) numbers[i];
            }

            if (numbers[i] % 2 != 0 && numbers[i] < smallestOdd) {
                smallestOdd = (double) numbers[i];
            }
        }
        return ((largestEven + smallestOdd) / 2);
    }

    public static double getFirstOddOrEven(boolean odd, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (odd && nums[i] % 2 != 0) {
                return nums[i];
            } else if (nums[i] % 2 == 0 ) {
                return nums[i];
            }
        }
        return 0;
    }
}
