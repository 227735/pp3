public class BankTest {
    public static void main(String[] args) {
        Bank a = new Bank();
        System.out.println(a.displayBalance());
        a.deposit(500);
        System.out.println(a.displayBalance());
        a.deposit(200);
        System.out.println(a.displayBalance());
        a.withdraw(300);
        System.out.println(a.displayBalance());
        a.withdraw(501);
        System.out.println(a.displayBalance());

    }
}

