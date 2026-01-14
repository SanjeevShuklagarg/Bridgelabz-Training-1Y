import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number");
        float number1 = sc.nextFloat();
        System.out.print("Enter the second number");
        float number2 = sc.nextFloat();
        System.out.print("choose 1 for addition");
        System.out.print("choose 2 for subtracton");
        System.out.print("choose 3 for mutiplication");
        System.out.print("choose 4 for division");
        System.out.print("Enter the number for operation");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.print("Addition of two numbers :" + (number1 + number2));
                break;
            case 2:
                System.out.print("Subtraction of two numbers :" + (number1 - number2));
                break;
            case 3:
                System.out.print("multipication of two numbers :" + (number1*number2));
                break;
            default:
                System.out.print("Division of two numbers :" + (number1/number2));

        }

    }
	
}