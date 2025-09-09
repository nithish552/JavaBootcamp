import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int val=in.nextInt();
        if(val%2==0){
            System.out.println("ON");
        }
        else{
            System.out.println("OFF");
        }
    }
}