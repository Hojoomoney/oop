package controller;

import service.AccountService;
import serviceImpl.AccountServiceImpl;

public class AccountController {
    AccountService account;

    public AccountController() {
        this.account = AccountServiceImpl.getInstance();
    }
}
