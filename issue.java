import java.util.Scanner;


public class issue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int");
        int in=sc.nextInt();
        
        System.out.println(in+"\nEnter string");
        String str = sc.nextLine();
        System.out.println(str);
    }
}
