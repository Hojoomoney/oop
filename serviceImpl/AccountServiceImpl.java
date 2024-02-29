package serviceImpl;

import service.AccountService;

public class AccountServiceImpl implements AccountService {
    private static AccountService instance = new AccountServiceImpl();

    public static AccountService getInstance() {
        return instance;
    }

    @Override
    public void createAccount(String accountNumber, String accountHolder) {

    }

    @Override
    public void deposit(String accountNumber, double amount) {

    }

    @Override
    public void withdraw(String accountNumber, double amount) {

    }

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public void cancelAccount(String accountNumber) {

    }
}
