import java.text.NumberFormat;
public class E5_BankACC {

    // 自定义一个银行账户类，包括属性（用户名，账号，余额）以及方法（存钱、取钱、加利息、查询余额）。
    // 创建账户所需的信息由键盘输入；存钱、取钱的数额由随机数模拟。
    // 每次账户交易在屏幕打印交易后的账户信息，有一定的排版
    // 不允许出现账户金额为负数的操作。

    private String name;
    private double balance;
    private int AccountNum;

    public E5_BankACC(String name, int Accnumber, double balance)
    {
        this.name = name;
        this.AccountNum = Accnumber;
        this.balance = balance;
    }

    public void deposit(double AddMoney)
    {
        balance += AddMoney;

    }

    public void withdraw(double MinusMoney)
    {
        balance -= MinusMoney;

    }

    public double interest()
    {
        double rate = 0.035;
        balance = balance + balance * rate;

        return balance;
    }

    private void Check()
    {
        if (balance <= 0){
            balance = 0;
        }
    }

    public String toString()
    {
        Check();
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return "账户：" + AccountNum + "\t" + "姓名：" + name + "\t" + "余额：" + fmt.format(balance);
    }
}
