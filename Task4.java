import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
       
        String input;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word");
        input = sc.next();
        
        StringBuilder palindrome = new StringBuilder(input);
        palindrome.reverse();

        if(input.equals(palindrome.toString())){
            System.out.println("The input string is a palindrome");
        }else{
            System.out.println("The input string is NOT a palindrome");
        }

    }
}
