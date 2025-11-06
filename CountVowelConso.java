import java.util.Scanner;
class vowelConsonant{
    int vowel = 0, consonant = 0;
    void display(String ch){
        String lowerch = ch.toLowerCase();
        for(int i=0 ; i<ch.length() ; i++){
            if(ch.charAt(i) == 'a' || ch.charAt(i) == 'e' ||ch.charAt(i) =='i'||ch.charAt(i)=='o'||ch.charAt(i)=='u'){
                vowel++;
            }
            else{
                consonant++; 
            }
        }
        System.out.println("Total vowel in  "+ch+": "+vowel);
        System.out.println("Total consonant in  "+ch+": "+consonant);
    }
}
public class CountVowelConso{
    public static void main(String[] args) {
        String ch;
        vowelConsonant vc1 = new vowelConsonant();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        ch = sc.nextLine();
        vc1.display(ch);
    }
}
