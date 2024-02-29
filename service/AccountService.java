package service;

public interface AccountService {
    void createAccount(String accountNumber, String accountHolder);
    void deposit(String accountNumber, double amount);
    void withdraw(String accountNumber, double amount);
    double getBalance(String accountNumber);
    void cancelAccount(String accountNumber);
}
