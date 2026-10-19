class MessWallet {
    private double balance;

    MessWallet(double opening) {
        if (opening < 0) {
            System.out.println("Invalid opening balance");
            balance = 0;
        } else {
            balance = opening;
        }
    }

    void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Top-up rejected");
        } else {
            balance += amount;
        }
    }

    void deduct(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deduction");
        } else if (amount > balance) {
            System.out.println("Deduct rejected: insufficient balance");
        } else {
            balance -= amount;
        }
    }

    double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        MessWallet wallet = new MessWallet(500);

        wallet.topUp(200);
        System.out.println("Balance after top-up: "
                           + wallet.getBalance());

        wallet.deduct(1000);

        System.out.println("Final balance: "
                           + wallet.getBalance());
    }
}