public class Alphabet {
    static boolean isAlphabet(String t){
        int j=0;
        for (int i=1; i<t.length(); i++){
            char letter = t.charAt(j); 
            char letter2 = t.charAt(i);
            if (letter2<letter){
                return false;
            }
            j++;
            
        }
    return true;
    } 
    
}