import java.io.*;

public class hard_substring {
    public static void main(String[] args) {

        String sub_1 = " This is a og";
        String sub_2 = "dog";


        System.out.println(sub_str(sub_1, sub_2));

    }


    public static int sub_str(String input, String q) {
        //String new_stuff = " ";
      if (input.indexOf(q) > 0){
          return input.indexOf(q);


        }
        else{
            return -1;
      }


    }
}

/*
  int index = 0 ;
        for (int i = 0; i < q.length(); i++) {
            for (int j = 0; j < input.length(); j++)
{
                if (input.charAt(j) == q.charAt(i)) {
                    // new_stuff = new_stuff + input.charAt(j);

                }
            }*/

//System.out.print(new_stuff);}