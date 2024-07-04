//1. Design a function that reverses the digits of an integer. For example, 50
//should become 5 and -12 should become -21.

public class NumberUtil {

    public int reverseDigits(int num) {
      boolean isNegative = num < 0;
      String strNum = Integer.toString(Math.abs(num));
      String reverseStr = new StringBuilder(strNum).reverse().toString();
      int reversedNum = Integer.parseInt(reverseStr);
      return isNegative ? -reversedNum : reversedNum;
    }
  
    public static void main(String[] args) {
      NumberUtil numberUtil = new NumberUtil(); 
      int number = 5678;
      int reversedNumber = numberUtil.reverseDigits(number);
      System.out.println("Original number: " + number);
      System.out.println("Reversed number: " + reversedNumber);
    }
  }


// 2. Write a recursive function to calculate the factorial of a number

public class factorial{

    public static void main(String[] args){
    
        System.out.println(factorial(5));
    
    }
    
    public static int factorial(int n){
    
        //5! = 5 * 4 * 3 * 2 * 1
    
        if(n==1){
            return 1;
        } else{
            
           return n * factorial(n - 1);
        }
    }
    }



// 3. Design a function that takes a string or sequence of characters as input and
// returns the character that appears most frequently.


import java.util.HashMap;
import java.util.Map;

public class lettercounter {
    public static void getcount(String name){

        Map<Character , Integer> letMap = new HashMap<Character , Integer>();
        char strArray [] = name.toCharArray();
            for (char h : strArray){
                if(letMap.containsKey(h)){
                    letMap.put(h,letMap.get(h)+1);
                }else{
                    letMap.put(h,1);
                }
            }
            System.out.println(name + " : " + letMap);
        }

    


    public static void main(String [] args){
        getcount("hello");
        getcount("11189");
    }
}




/*4. Design a function that determines whether a given string is a pangram. A
pangram is a sentence or phrase containing every letter of the alphabet at
least once. Punctuation and case are typically ignored. For example, the
string "The quick brown fox jumps over the lazy dog" is a pangram, while
"Hello, world!" is not*/

public static void main(String[] args){

    String sent = "The quick brown fox jumps over the lazy dog";
    System.out.println(isPanagram(sent.toLowerCase()));

}

public static boolean isPanagram(String sent){
    if(sent.length()< 26){
        return false;
    }else {
        for(char s = 'a'; s <= 'z'; s++){
            if (sent.indexOf(s)< 0){
                return false;
            }
        }
    }
    return true;
}



/*5. Design a function that takes a list of integers as input. The function should
return True if the list contains two consecutive threes (3 next to a 3) anywhere
within the list. Otherwise, it should return False. For example, the function
should return True for [1, 3, 3] and False for [1, 3, 1, 3].*/

public static void main(String[] args) {
    // Example 1: Array with consecutive threes
    int[] numArray1 = {1, 3, 3, 4, 5};
    boolean hasThrees1 = hasConsecutiveThrees(numArray1);
    System.out.println("Array {1, 3, 3, 4, 5} has consecutive threes: " + hasThrees1); // Output: true
  
    // Example 2: Array without consecutive threes
    int[] numArray2 = {1, 1, 2, 4};
    boolean hasThrees2 = hasConsecutiveThrees(numArray2);
    System.out.println("Array {1, 1, 2, 4} has consecutive threes: " + hasThrees2); // Output: false
  }
  
public static boolean hasConsecutiveThrees(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == 3 && nums[i + 1] == 3) {
            return true;
        }
    }
    return false;
}


/*6. Master Yoda, a renowned Jedi Master from the Star Wars universe, is known
for his unique way of speaking. He often reverses the order of words in his
sentences. For example, instead of saying "I am home" he might say "Home
am I" Design a function that takes a sentence as input and returns a new
sentence with the words reversed in the same order that Master Yoda would
use. */



public static void main(String[] args) {
    // Example sentence
    String sentence = "May the Force be with you";
  
    // Call yodaSpeak function and store the result
    String yodaSentence = yodaSpeak(sentence);
  
    // Print the original and Yoda-fied sentences
    System.out.println("Original sentence: " + sentence);
    System.out.println("Yoda speak: " + yodaSentence);
  }
  




public static  String yodaSpeak(String sentence) {
    String[] words = sentence.split(" ");
    StringBuilder yodaSentence = new StringBuilder();
    for (int i = words.length - 1; i >= 0; i--) {
        yodaSentence.append(words[i]).append(" ");
    }
    return yodaSentence.toString().trim();
}


    