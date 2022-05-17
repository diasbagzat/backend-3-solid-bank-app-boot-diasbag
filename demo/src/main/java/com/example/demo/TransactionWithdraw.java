package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class TransactionWithdraw {
    private AccountWithdrawService accountWithdrawService;
    private TransactionDAO transactionDAO;
    public TransactionWithdraw(AccountWithdrawService accountWithdrawService, TransactionDAO transactionDAO) {
        this.accountWithdrawService = accountWithdrawService;
        this.transactionDAO = transactionDAO;
    }

    //Метод execute() выполняет снятие денег вызывая метод withdraw() из AccountWithdrawService
    public void execute(AccountWithdraw accountWithdraw, double amount) {
        accountWithdrawService.withdraw(amount, accountWithdraw);
    }
}
