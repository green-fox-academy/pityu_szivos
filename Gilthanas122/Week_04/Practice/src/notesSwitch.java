public class notesSwitch {
    public static void main(String[] args) {
        int score = 90;

        switch (score){

            case 100:                           // get executed, but next line also since no break;
                System.out.println("test");     // this line is not executed
            case 90:
                System.out.println("Very good");
                break;                          //stops switsch
            case 60:
                System.out.println(" Good");
                break;
            default:                            // if none of the cases is true -> "else'
                System.out.println(" The grade are not defined");
        }
    }
}

