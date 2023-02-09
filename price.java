import java.util.Scanner;
public class price {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       double  nprc ;
       System.out.println("orignal price = RM ");
       double oriprc= sc.nextDouble();
       nprc = 0.7 * oriprc ;
       System.out.print("new Price= RM " + nprc);
    }
    
}
