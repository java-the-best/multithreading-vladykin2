package multithreading.example4;

public class LockDemo {

    public static void main() throws InterruptedException {
        Account account = new Account(0);
        new DepositThread(account).start();
        System.out.println("Entering waitAndWithdraw");
        account.waitAndWithdraw(50_000_000);
        System.out.println("waitAndWithdraw finishrd, end balance = " + account.getBalance());
    }

    private static class DepositThread extends Thread {

        private final Account account;

        private DepositThread(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            for (int i = 0; i < 60_000_000; i++) {
                account.deposit(1);
            }
        }
    }
}
