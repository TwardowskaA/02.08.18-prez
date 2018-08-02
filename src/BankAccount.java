public class BankAccount {

    public static final int MAX_W = 3000;
    private Person person;
    private double money;

    public BankAccount(Person person, double money) {
        if (person == null)
            throw new NullPointerException("Nie można utworzyć konta");
        this.person = person;
        this.money = money;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double deposit(double x) {
        return money = money + x;
    }

    private int max;

    public void withdraw(double x) {

        if (x > money)
            throw new NotEnoughBalanceException("Nie mozna wyplacic kwoty wiekszej niz stan konta");
        if (max > MAX_W)
            throw new MaxWithdrawException("Przekroczono limit wyplat");
        else money = money - x;

    }
}
