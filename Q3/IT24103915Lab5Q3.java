import java.util.Scanner;

public class IT24103915Lab5Q3 {

  
    private static final int ROOM_CHARGE_PER_DAY = 48000;
    private static final int NO_DISCOUNT = 0;
    private static final int DISCOUNT_10 = 10;
    private static final int DISCOUNT_20 = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start date of the reservation (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter the end date of the reservation (1-31): ");
        int endDate = scanner.nextInt();
   
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Start date and end date must be between 1 and 31.");
            return; 
        }
       
        if (startDate >= endDate) {
            System.out.println("Start date should be less than end date.");
            return;  
        }
   
        int numberOfDays = endDate - startDate;
        
        if (numberOfDays < 3) {
            System.out.println("No discount available. Reservation duration must be 3 days or more.");
            return;  
        }
      
        int discountRate = NO_DISCOUNT; 

        if (numberOfDays >= 3 && numberOfDays <= 4) {
            discountRate = DISCOUNT_10;
        } else if (numberOfDays >= 5) {
            discountRate = DISCOUNT_20;
        }
       
        int totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
        int discountAmount = (totalAmount * discountRate) / 100;
        int finalAmount = totalAmount - discountAmount;
    
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Total amount before discount: Rs " + totalAmount);
        System.out.println("Discount applied: " + discountRate + "%");
        System.out.println("Discount amount: Rs " + discountAmount);
        System.out.println("Total amount to be paid: Rs " + finalAmount);

scanner.close();
    }
}