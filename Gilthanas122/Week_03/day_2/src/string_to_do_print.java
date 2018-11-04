public class string_to_do_print {
    public static void main(String[] args) {


        String todoText = " - Buy milk\n";

        todoText = todoText.concat(" - Download games");
        todoText = todoText.concat(" \n \t - Diablo");
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        StringBuilder _first = new StringBuilder(todoText);

       _first.insert(0, "My todo: \n");



        System.out.println(_first);
    }
}
