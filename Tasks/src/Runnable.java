import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
public class Bank {

    private final Map<String, Account> accounts;
    private final Random random = new Random();
    private final Lock lock = new ReentrantLock();

    public Bank() {
        accounts = new HashMap<>();
    }

    public synchronized boolean isFraud(String fromAccountNum, String toAccountNum, long amount)
            throws InterruptedException {
        Thread.sleep(1000);
        return random.nextBoolean();
    }

    public synchronized void setBlocked(Account account) {
        Thread.sleep(1000);
    }

    public void transfer(String fromAccountNum, String toAccountNum, long amount) {
        lock.lock();
        try {
            var from = accounts.get(fromAccountNum);
            var to = accounts.get(toAccountNum);

            if (from == null || to == null || from.getMoney() < amount) {
                throw new IllegalArgumentException("Неверные данные");
            }

            from.setMoney(from.getMoney() - amount);
            to.setMoney(to.getMoney() + amount);

            if (amount > 50000) {
                try {
                    if (isFraud(fromAccountNum, toAccountNum, amount)) {
                        from.wait(100);
                        to.wait(100);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            lock.unlock();
        }
    }

    public long getBalance(String accountNum) {
        lock.lock();
        try {
            var account = accounts.get(accountNum);
            if (account == null) {
                throw new IllegalArgumentException("Неверный номер счета");
            }
            return account.getMoney();
        } finally {
            lock.unlock();
        }
    }

    public long getSumAllAccounts() {
        lock.lock();
        try {
            long sum = 0;
            for (var account : accounts.values()) {
                sum += account.getMoney();
            }
            return sum;
        } finally {
            lock.unlock();
        }
    }

    public void setAccounts(int count){
        lock.lock();
        try {
            accounts.clear();
            for (var i = 0; i < count; i++) {
                var account = new Account();
                account.setAccNumber(String.valueOf(i));
                account.setMoney(200000);
                accounts.put(account.getAccNumber(), account);
            }
        } finally {
            lock.unlock();
        }
    }
}

public class Account {
    private long money;
    private String accNumber;

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }
}

public class TransferRun implements Runnable {

    private static Bank bank; //поле банка
    private final int count; //количество аккаутов
    private final int operationsCount; //количество операций, которые нужно совершить

    public TransferRun(Bank bank, int count, int operationsCount){
        TransferRun.bank = bank;
        this.count = count;
        this.operationsCount = operationsCount;
    }

    @Override
    public void run() {
        var random = new Random();

        for (int i = 0; i < operationsCount; i++) {
            var from = String.valueOf(random.nextInt(count));
            var to = String.valueOf(random.nextInt(count));
            var sum = random.nextInt(100000);

            bank.transfer(from, to, sum);
        }
    }
}


 */