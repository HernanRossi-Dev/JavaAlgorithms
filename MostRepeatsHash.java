import java.util.*; 
import java.io.*;

class Main {  
  public static String LetterCountI(String str) { 
    HashMap<String, Integer> charCounts;    
    String[] words = str.split(" ");
    int resultIndex = 0;
    int mostRepeats = 0;
    for ( int i = 0; i < words.length; i++) {
        String[] characters = words[i].split("");
        charCounts = new HashMap<String, Integer>(); 
        for (String curr : characters ) {
            boolean hasItem =  charCounts.containsKey(curr);
            int count = 1;
            if ( hasItem ) {
                count = charCounts.get(curr) + 1;
                charCounts.put(curr, count);
            } else {
                charCounts.put(curr, 1);
            }
            if (count > mostRepeats) {
                mostRepeats = count;
                resultIndex = i;
            }
        }
    }
    if (mostRepeats == 1) {
        return "-1";
    }
    return words[resultIndex];
    
  } 
  
  public static void main (String[] args) {  
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCountI(s.nextLine())); 
  }   
}