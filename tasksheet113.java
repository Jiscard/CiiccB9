public class tasksheet113{
    public static void main(String[] args) {
        int check_number = 10;
        String message = "";
        //https://docs.google.com/forms/d/e/1FAIpQLSdW_Sq8sqIEK--BSsfF-TFYr1hykwz__QzePX0wIUr2e5ksqg/viewscore?pli=1&viewscore=AE0zAgAR8MrtvRCHe57-s04SYY9qaXryfEZtwRKvRqYpgRcdqXjUcShueXzBaayyVDyy9p4
        for(int i = 1; i<= check_number; i++) {
            message = (i%2==0) ? i+" is even number" : i+ " is odd number";
            System.out.println(message);
        }
      
    }
}