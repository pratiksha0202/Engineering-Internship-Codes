import java.util.Scanner;

public class ATM_Interface {
    public static void main(String args[]) {
        int balance = 50000, withdraw ,deposit;
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for withdraw");
            System.out.println("Choose 2 for deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Exit");
            System.out.print("Choose the operation you want to perform:");


            int n = s.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter money to be withdraw: ");
                    withdraw = s.nextInt();
                    if(balance>=withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money!!!");
                    }
                    else{
                        System.out.println("Insufficient Balance!!!");
                    }
                    System.out.println("");
                    break;
                    
                case 2:
                    System.out.println("Enter money to be deposition: ");
                    deposit = s.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your money has been successfully deposited!!!");
                    System.out.println("");

                    break;

                case 3:
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
                    }
            }

        }
    }
