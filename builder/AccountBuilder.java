package builder;

import model.AccountDto;

import java.time.LocalDateTime;

public class AccountBuilder {
    private Long id;
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private LocalDateTime transactionDate;
    public AccountBuilder id(Long id){
        this.id = id;
        return this;
    }
    public AccountBuilder accountNumber(String accountNumber){
        this.accountNumber = accountNumber;
        return this;
    }
    public AccountBuilder accountHolder(String accountHolder){
        this.accountHolder = accountHolder;
        return this;
    }
    public AccountBuilder balance(double balance){
        this.balance = balance;
        return this;
    }
    public AccountBuilder transactionDate(LocalDateTime transactionDate){
        this.transactionDate = transactionDate;
        return this;
    }
    public AccountDto build(){
        return new AccountDto(id,accountNumber,accountHolder,balance,transactionDate);
    }
}
