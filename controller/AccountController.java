package controller;

import builder.AccountBuilder;
import model.AccountDto;
import service.AccountService;
import serviceImpl.AccountServiceImpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class AccountController{
    AccountService accountService;

    public AccountController() {
        this.accountService = AccountServiceImpl.getInstance();
    }


    public String createAccount(Scanner scan) {
        System.out.println("계좌번호, 예금주를 입력하시오.");
        return accountService.createAccount(new AccountBuilder()
                                            .id(scan.nextLong())
                                            .accountNumber(scan.next())
                                            .accountHolder(scan.next())
                                            .transactionDate(LocalDateTime.now())
                                            .build());
    }

    public String deposit(Scanner scan) {
        System.out.println("계좌번호와 송금할 금액을 입력하시오.");
        return accountService.deposit(new AccountBuilder()
                                        .accountNumber(scan.next())
                                        .balance(scan.nextDouble())
                                        .transactionDate(LocalDateTime.now())
                                        .build());
    }

    public String withdraw(Scanner scan) {
        System.out.println("계좌번호와 출금할 금액을 입력하시오.");
        return accountService.withdraw(new AccountBuilder()
                                        .accountNumber(scan.next())
                                        .balance(scan.nextDouble())
                                        .transactionDate(LocalDateTime.now())
                                        .build());
    }

    public String getBalance(Scanner scan) {
        return accountService.getBalance(scan.next());
    }

    public String cancelAccount(Scanner scan) {
        System.out.println("해지할 계좌의 번호를 입력하시오.");
        return accountService.cancelAccount(scan.next());
    }

    public List<AccountDto> getAccount() {
        return accountService.getAccount();
    }
}
