import java.util.*;
public class Task5 {
    public static void main(String[] args) {
        
        int in1,in2,in3;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First nubmer: ");
        in1 = sc.nextInt();
        System.out.println("Enter Second nubmer: ");
        in2 = sc.nextInt();
        System.out.println("Enter Last nubmer: ");
        in3 = sc.nextInt();

        if(in1 == in2 && in2 == in3){
            System.out.println("All numbers are equals");
        }else{
            int max; 
            max = Math.max(in1,Math.max(in2, in3));
            System.out.println("the largest number is "+ max);
        }
    }
}
