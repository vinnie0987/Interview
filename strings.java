public class strings{
    public static void main(String[] args){
        // creating strings 
        String  str1 = "Hello world"; //  java here adds the string t the string pool
        String str2 =  new String("Java Programming"); // creates a new object in the heap memory
        // using string literal is more efficient and recommended in most cases
         
        // common string methods 

        System.out.println("length of str1:" + str1.length());
        System.out.println("Char at index 1 of str1: " + str1.charAt(1));
        System.out.println("Substring of str2: "+ str2.substring(5,16));

        /*The beginIndex is inclusive.
The endIndex is exclusive.
str2.substring(5, 16) extracts the substring from index 5 to 15 of the original string str2, resulting in "Programming".
you can have multiple classes in a single file, but only one of them can be 
public and if there is a public class the file name must match the public class name.if 
none of the classes in the file are public the file can have any name but its still good practice 
t name the file after one of the classes it contains  */
        
         
    }
}


 class AdvancedStringMethods{
    public static void main(String[] args){
        String str1 = "hello, ";
        String str2 = "world!";
        String str3 = "java programming  ";

        // concatenation
        String result = str1.concat(str2);
        System.out.println("concanated string  " + result);
        // comparison
        System.out.println("comaring " + str1.equals(str2));
        // replacement
        String replacedString = str3.replace("java","python");
        System.out.println("Replaced " + replacedString);
        // trimming
        String trimmedString = str3.trim();
        System.out.println("trimmed" + trimmedString);
        // splitting 
        String[] words = str3.trim().split("");
        for(String word : words){
            System.out.println(word);
        }

        //trimming removes leading and trailing whitespaces
        // splitting splits the string into an array using an empty string '""' as the delimiter
        // splitting with an empty string separates each character
        // the result of split is stored in the array words where each element of the array represents a single character from the string 
        /*the for each loop iterates over each element in the words array. each word is actally a single character extracted from str3
        this also prints each character of str3 on a new line because each character is printed individually due to the splitting by split */ 


    }
}

 class StringBuilderExample{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");

        // Stringbuilder is a class that provides a mutable sequence of characters unlike the Strig class which is immutable 
        // once created , its value cannot be changed... Stringbuilder allows you to modify,append,insert and delete characters in a sequence

        /*When to Use StringBuilder:
Concatenation in Loops: When you need to build a string in a loop (e.g., constructing a long string from multiple parts iteratively).

Dynamic String Construction: When you have dynamic content that changes frequently, and you want to efficiently modify and manipulate the string.
 */

 /*Performance Considerations:
Using StringBuilder is generally more efficient than concatenating strings using the + operator, especially in scenarios involving loops or frequent modifications. This is because StringBuilder uses a resizable array internally to store characters, allowing it to efficiently manage and modify the character sequence. */

         //APPEND
         sb.append (", World");
         System.out.println("Appended " + sb);

         // INSERT
         sb.insert(5,"java");
         System.out.println(" inserted" + sb);

         // Replace

         sb.replace(5,10,"python");
         System.out.println("replaced" + sb);

         //delete
         sb.delete(5,12);
         System.out.println("deleted" + sb);

         // reverse

         sb.reverse();
         System.out.println("reversed " + sb);


    }
 }

/* 1. Logging Systems
Scenario: Imagine you are developing a logging system for an application. This system needs to log various events, errors, and messages from different parts of the application concurrently.*/

 class Logger{
    private static StringBuffer buffer = new StringBuffer();

    public static void log(String message){
        synchronized (buffer){
            buffer.append(message).append("\n");
        }
    }

    /* log method appends a log message to the StringBuffer with synchronization t ensure thread safety */


    public static String getLogs(){
        synchronized(buffer){
            return buffer.toString();
        }
    }

    /* getlogs method retrieves all logged messages as a single string also synchronized to ensure consistency */

 }


 class NetworkHandler{
    private static StringBuffer responseBuffer = new StringBuffer();

    public static void handleRequest(String request){
        //process request and generate response
        String response = "response to " + request;

        synchronized (responseBuffer){
            responseBuffer.append(response).append("\n");

        }
    }

    public static String getResonse(){
        synchronized (responseBuffer){
            return responseBuffer.toString();

        }
    }
 }