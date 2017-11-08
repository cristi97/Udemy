public class Account {
    private String accountNumber,customerName,email,phoneNumber;
    private int balance;

    public Account(String accountNumber, String customerName, String email, String phoneNumber, int balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }
    public String toString(){
        return accountNumber+" "+customerName+ " "+email+" "+phoneNumber+" "+balance;
    }
}
