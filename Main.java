public class Main {

    public static void main(String[] args) {
         Bank account = new Bank(1000);

        Transactions.withdraw(account, 100, new TransactionListener() {
            @Override
            public void onComplete(Bank acount) {
		System.out.printf("Your balance is: %d%n", account.getTotal());
            }            
        });
    }
}

