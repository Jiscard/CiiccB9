public class Test {
    public static void main(String[] args) {
        int luck = 10;

        if((luck>10 ? luck++ : --luck) < 10){
            System.out.println("Unlucky");
        } else {
            System.out.println("Lucky");
        }
       
    }
}