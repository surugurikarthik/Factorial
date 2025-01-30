import java.util.Scanner;

public class FactorialNumber {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("");
    int k  = sc.nextInt();
    int  fact=1;
    for(int i=1;i<=k;i++){
        fact*=i;
        

      
    }
    sc.close();


  }
    
}
