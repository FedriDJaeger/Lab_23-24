import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in); 
    System.out.println(" inserire il primo numero:");
    int num1 = scan.nextInt();

    System.out.println(" inserire il SECONDO numero:");
    int num2 = scan.nextInt();
    if (num1>=num2 && num1%num2 == 0 ) {
        System.out.println("il primo numero è multiplo del secondo");
    }else{

        System.out.println("il primo numero non è multiplo del secondo");
    }
  }
}
