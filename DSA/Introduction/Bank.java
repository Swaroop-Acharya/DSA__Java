class BankAccout{
    private double balance;

    public BankAccout(double openingBalance){
        balance=openingBalance;
    }

    public void deposite(double amount){
        balance=balance+amount;
    }
    public void withDraw(double amount){
        balance=balance-amount;
    }

    public void displayBalance(){
        System.out.println("Balance:= "+balance);
    
    }
}

class BankApp{
    public static void main(String[] args) {
        BankAccout cus1=new BankAccout(100.0);

        cus1.displayBalance();

        cus1.deposite(50.1);
        cus1.displayBalance();

        cus1.withDraw(80);
        cus1.displayBalance();
    }
}