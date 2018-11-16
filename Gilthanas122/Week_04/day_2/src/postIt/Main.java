package postIt;

public class Main {

    public static void main(String[] args) {

        postIt postItItem_1 = new postIt();
        postIt postItItem_2 = new postIt();
        postIt postItItem_3 = new postIt();

        postItItem_1.backgroundColor = "orange";
        postItItem_1.text = "Idea 1";
        postItItem_1.textColor= "blue";

        postItItem_2.backgroundColor = "pink";
        postItItem_2.text = "Awesome";
        postItItem_2.textColor= "black";

        postItItem_3.backgroundColor = "yellow";
        postItItem_3.text = "Superb";
        postItItem_3.textColor= "green";

        System.out.println(postItItem_3.text);
    }


}



