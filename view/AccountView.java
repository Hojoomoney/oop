package view;

import controller.AccountController;

import java.util.Scanner;

public class AccountView {
    public static void main(Scanner scan) {
        AccountController accountController = new AccountController();

        while(true){
            System.out.println("[계좌메뉴] 0-Exit 1-Create 2-Deposit 3-Withdraw 4-Balance 5-Remove 6-Account List");
            switch (scan.next()){
                case "0" :
                    System.out.println("Exit");
                    return;
                case "1":
                    System.out.println("=== Create ===");
                    System.out.println(accountController.createAccount(scan));
                    break;
                case "2":
                    System.out.println("=== Deposit ===");
                    System.out.println(accountController.deposit(scan));
                    break;
                case "3":
                    System.out.println("=== Withdraw ===");
                    System.out.println(accountController.withdraw(scan));
                    break;
                case "4":
                    System.out.println("=== Balance ===");
                    System.out.println(accountController.getBalance(scan));
                    break;
                case "5":
                    System.out.println("=== Remove ===");
                    System.out.println(accountController.cancelAccount(scan));
                    break;
                case "6":
                    System.out.println("=== Account List ===");
                    accountController.getAccount().forEach(i ->{
                        System.out.println(i);
                    });

            }
        }
    }
}
