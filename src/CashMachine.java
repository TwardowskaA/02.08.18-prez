public class CashMachine {
    public static void main(String[] args) {
        Person person = new Person("Jan","Kowalski");
        BankAccount bankAcc = new BankAccount(person,4500);
        bankAcc.deposit(200);
        System.out.println(bankAcc.getMoney());
        bankAcc.withdraw(4500);
        System.out.println(bankAcc.getMoney());
    }
}
