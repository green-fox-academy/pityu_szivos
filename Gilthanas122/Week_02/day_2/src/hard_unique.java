import java.util.Arrays;

public class hard_unique {
  public static void main(String[] args) {


      int[] input = new int[]{1, 1, 18, 7, 9, 8, 9, 9, 9, 10};
      Arrays.sort(input);
      int current = input[0];
      boolean found = false;
      int[] new_list = new int[input.length];

      for (int i = 0; i < input.length; i++) {
          if (current == input[i] && !found) {
              found = true;
          } else if (current != input[i]) {
              System.out.print(" " + current);
              current = input[i];
              found = false;
          }
      }

    }
}


