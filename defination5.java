import java.util.*;
class SingleDigit {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int singleDigit = convertToSingleDigit(number);
        System.out.println("The single digit is: " + singleDigit);
    }
    public static int convertToSingleDigit(int num) {
        while (num >= 10) {
            num = sumOfDigits(num);
        }
        return num;
    }
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}




/*OUTPUT:-

Enter a number: 674
The single digit is: 8*/

/* LOGIC:- 
sum=0
674 % 10= 4 --> sum= 0+4= 4
674/10= 67

sum=4
67 % 10= 7 --> sum= 4+7= 11
67/10= 6

sum=11
6 % 10= 6 -->sum= 6+4+7= 17
6/10= 0 

sum=17
convert to single digit = 1+7-> 8 */
