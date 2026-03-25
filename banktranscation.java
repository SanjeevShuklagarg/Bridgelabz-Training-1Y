import java.util.*;
class Main{
    static void withdrwa(int amount){
        double balance = 0;
        double withdrwal = 10000;
        if(amount>=0){
            balance = amount + balance;
            System.out.println("Balance of the account" + balance);
        }else{
            throw new RuntimeException("IllegalArgumentException");
        }
        if(withdrwal<=balance){
            balance = balance - withdrwal;
            System.out.println("Withdrwal Sucessfull");
            System.out.println("Balance of the account"+balance);
        }else{
            throw new RuntimeException("InsufficientBalanceException");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Main.withdrwa(50000);


    }
}