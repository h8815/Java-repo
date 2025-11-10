import java.util.Scanner;
class Palindrome {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = scanner.next();
        String revStr = "";
        int strlen = str.length();
        for(int i = (strlen - 1) ; i>=0 ; i--){
            revStr = revStr + str.charAt(i);
        }
        String Lstr = str.toLowerCase();
        String LrevStr = revStr.toLowerCase();
        if(Lstr.equals(LrevStr)){
            System.out.println(str + " is a palindrome");
        }
        else{
            System.out.println(str + " is not a palindrome number");
        }
    }    
}
