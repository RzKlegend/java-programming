
// This is q1 of the assignment

/*Create a Bank Account program where account number is final and cannot be
changed.  */

public class bankAccount{
    
    // First we declare the account number as final
    final int accountNumber;

    // Constructor to declare the final variable
    public bankAccount(int accountNumber){
        this.accountNumber = accountNumber;

    }

    public static void main(String[] args) {

        // Creating a new bank account with an account number
        bankAccount akashAccount = new bankAccount(1900);

        // To display the account number
        System.out.println("Account number:- " + akashAccount.accountNumber);

        // if we try to run the following lines, the program will throw an error as the final variables cannot be reassigned/changed
        // akashAccount.accountNumber = 1020;
    }

}
