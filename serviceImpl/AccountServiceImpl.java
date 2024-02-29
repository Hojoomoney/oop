package serviceImpl;

import model.AccountDto;
import service.AccountService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    private static AccountService instance = new AccountServiceImpl();
    List<AccountDto> accounts;

    public static AccountService getInstance() {
        return instance;
    }
    private AccountServiceImpl(){
        this.accounts = new ArrayList<>();
    }

    @Override
    public String createAccount(AccountDto account) {
        accounts.add(account);
        return "계좌생성 완료";
    }

    @Override
    public String deposit(AccountDto account) {
        accounts.forEach(i -> {
            if (i.getAccountNumber().equals(account.getAccountNumber())){
                i.setBalance(i.getBalance() + account.getBalance());
                i.setTransactionDate(LocalDateTime.now());
            }
        });
        return "계좌 송금 성공";
    }

    @Override
    public String withdraw(AccountDto account) {
        accounts.forEach(i -> {
            if (i.getAccountNumber().equals(account.getAccountNumber())){
                i.setBalance(i.getBalance() - account.getBalance());
                i.setTransactionDate(LocalDateTime.now());
            }
        });
        accounts.stream().filter(i -> i.getAccountNumber().equals(account.getAccountNumber()))
                .forEach(i -> {
                    if(i.getBalance() >= account.getBalance()){
                        i.setBalance(i.getBalance() - account.getBalance());
                        i.setTransactionDate(LocalDateTime.now());
                    } else {
                    }
                });
        return "계좌 출금 성공";
    }

    @Override
    public String getBalance(String accountNumber) {
        return null;
    }

    @Override
    public String cancelAccount(String accountNumber) {
        accounts.removeIf(i -> i.getAccountNumber().equals(accountNumber));
        return "계좌 해지 완료";
    }

    @Override
    public List<AccountDto> getAccount() {
        return accounts;
    }
}
