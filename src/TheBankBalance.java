import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int balance=in.nextInt();
        if(balance>0){
            System.out.println("positive balance");
        }
        else if(balance<0){
            System.out.println("overdraft");
        }
        else{
            System.out.println("zero balance");
        }
    }
}