import java.util.Scanner;

public class IT24103915Lab5Q1 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        int smallest = (num1 < num2 && num1 < num3) ? num1 : 
                       (num2 < num1 && num2 < num3) ? num2 : num3;
      
        int largest = (num1 > num2 && num1 > num3) ? num1 : 
                      (num2 > num1 && num2 > num3) ? num2 : num3;

        
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);

        
scanner.close();
    }
}