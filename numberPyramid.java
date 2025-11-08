class Print_pattern{
    void printingFunction(int line){
        System.out.println("Printing upward Pattern :-");
        for(int i=1 ; i<=line ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("\nPrinting downward Pattern :-");
        for(int i = line ; i>=1 ; i--){
             for(int j = i ; j>=1 ; j--){
                 System.out.print(i+" ");
             }
             System.out.println();
         }
    }
}
public class numberPyramid{
    public static void main(String[] args) {
        Print_pattern Pattern = new Print_pattern();
        Pattern.printingFunction(5);
    }
}