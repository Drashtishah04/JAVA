class Arithmetic {
    public static void main(String s[])
     {
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int choice = Integer.parseInt(s[2]);
        int c;
        System.out.println("A = " + a + ", B = " + b);
        switch (choice) {
            case 1:
                c = a + b;
                System.out.println("Sum: " + c);
                break;
            case 2:
                c = a - b;
                System.out.println("Subtraction: " + c);
                break;
            case 3:
                c = a * b;
                System.out.println("Multiplication: " + c);
                break;
            case 4:
                if (b != 0) {
                    c = a / b;
                    System.out.println("Division: " + c);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            case 5:
                c = a % b;
                System.out.println("Modulus: " + c);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        
        }
    
    }
}