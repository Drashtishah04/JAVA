import java.util.*;

class ds {
    public static void main(String s[]) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);     
        System.out.print("Enter value 1: ");
        a = sc.nextInt();    
        System.out.print("Enter value 2: ");
        b = sc.nextInt();
        System.out.println("A = " + a + " B = " + b);
        System.out.println("Choose an operation:");
        System.out.println("1: Add");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4: Divide");
        System.out.println("5: Modulus"); 
        int choice = sc.nextInt();
        switch (choice) {
            case 1: 
                c = a + b;
                System.out.println("Sum = " + c);
                break;
            case 2:
                c = a - b;
                System.out.println("Subtraction = " + c);
                break;
            case 3:
                c = a * b;
                System.out.println("Multiplication = " + c);
                break;
            case 4:
                if (b != 0) {
                    c = a / b;
                    System.out.println("Division = " + c);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            case 5:
                c = a % b;
                System.out.println("Modulus = " + c);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}