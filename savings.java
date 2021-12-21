import java.util.Scanner;

public class SavingsAccount {
}
    String accountNumber;
    String ifscCode;
    String bankName;
    String branchName;
    String accountHolderName;
    double availableBalance;
    String accountType;
    int atmPin;
    public double getAvailableBalance(){
        return this.availableBalance;
    }

public void withdrawal(double amount){
    if(this.availableBalance > amount) {
        this.availableBalance = this.availableBalance  - amount;
        System.out.println("Withdrawal of Rs : "+amount+" successful!");
        System.out.println("Available balance : Rs: "+ this.availableBalance);
    } else {
        System.out.println("Insufficient Funds!!");
    }
    public void deposit(double amount){
        if(amount > 0) {
            this.availableBalance = this.availableBalance + amount;
            System.out.println("Despoit of Rs : "+ amount+"successful!");
            System.out.println("Available balance : Rs: "+ this.availableBalance);
        }else{
            System.out.println("Invalid Amount!");
        }
    }
    
    public void changePin(){
        System.out.println("Enter the old pin: ");
        Scanner scan = new Scanner(System.in);
        int userpin =scan.nextInt ();
        if(this.atmpin == userpin) {
            System.out.println("Enter New PIN: ");
            this.atmPin = scan.nextInt () ;
            System.out.println("New Pin ["+ this.atmPin +"]Set Successfully ! ");
        }else{
            System.out.println("Incorrect Pin! !");

        }
        public void changePassword(){

        }
        public SavingsAccount()
    }
}
}