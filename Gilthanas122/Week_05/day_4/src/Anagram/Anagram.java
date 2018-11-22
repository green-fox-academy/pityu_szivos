package Anagram;

public class Anagram {

    public boolean anagram(String first, String second) {

        boolean anagram = false;
        if (first.length() == second.length()){
            if(first.length() % 2 == 0){

                for (int i = 1; i < first.length() / 2; i++){

                    if(first.charAt(i - 1) != second.charAt(second.length() - i)){
                        return false;
                    }
                    else{
                        return true;
                    }
                }
            }
            else{
                for(int i = 1; i < (first.length()-1)/2 +1; i++){
                    if(first.charAt(i - 1) != second.charAt(second.length() - i)){
                        return false;
                    }
                    else{
                        return true; }
                } } } else{
            return false; }
        return false;}
}

