import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter number");

    int num = scan.nextInt();  // Read user input
    if (num>0){
      System.out.println("+" +num);

    }else{
    System.out.println(num);  // Output user input
  }
}
}