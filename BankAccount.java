public class BankAccount {
    int AccountNum;
    String AccountNam;
    int Balance;

    BankAccount (int AccNum, String AccNam, int Bal){
        AccountNum = AccNum;
        AccountNam = AccNam;
        Balance = Bal;
    }
    BankAccount (int AccNum,String AccNam){
        AccountNam = AccNam;
        AccountNum = AccNum;
        Balance = 0;
    }
    void display(){
        System.out.println("Account Number: " +AccountNum);
        System.out.println("Account Name: " +AccountNam);
        System.out.println("Balance: " +Balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(100, "Faaiz", 3000);
        BankAccount acc2 = new BankAccount(101, "Umar");
        acc1.display();
        acc2.display();
    }
}
