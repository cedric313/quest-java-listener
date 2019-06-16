

public interface TransactionListener {
    /**
     * @param account returns the connected user
     */

    void onComplete(Bank account);
}
