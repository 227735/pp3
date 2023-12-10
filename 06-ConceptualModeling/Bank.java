public class Bank{
    private String accountNumber;
    private String owner;
    private int moneyOnTheAccount = 0;
    
    public Bank(){
    
    }

    public Bank(String accountNumber, String owner, int moneyOnTheAccount){
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.moneyOnTheAccount = moneyOnTheAccount;
    }

    public void deposit(int money){
        moneyOnTheAccount += money;
    }

    public void withdraw(int money){
        if (money <= 500 && money <= moneyOnTheAccount){
            moneyOnTheAccount -= money;}
            else {
                if (money > 500){
                    System.out.println("You can't withdraw more than PLN 500 ");  
            }  else{
                if (money <= 500 && money <= moneyOnTheAccount){
                    System.out.println("You don't have enough money on your bank account.");
                }
            }
        }
    }


    public int displayBalance(){
        return moneyOnTheAccount;
    }


}