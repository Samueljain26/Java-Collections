package com.bridgelabz.bankingsystem;

import java.util.*;

public class BankingSystem {
    private Map<Integer, Double> accounts;
    private Queue<WithdrawalRequest> withdrawalQueue;

    public BankingSystem() {
        accounts = new HashMap<>();
        withdrawalQueue = new LinkedList<>();
    }

    // Add a customer account
    public void addAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
    }

    // Deposit money
    public void deposit(int accountNumber, double amount) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found.");
            return;
        }
        accounts.put(accountNumber, accounts.get(accountNumber) + amount);
        System.out.println("Deposited " + amount + " into Account " + accountNumber);
    }

    // Request withdrawal
    public void requestWithdrawal(int accountNumber, double amount) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found.");
            return;
        }
        withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
        System.out.println("Withdrawal request for " + amount + " from Account " + accountNumber + " added.");
    }

    // withdrawal
    public void processWithdrawals() {
        System.out.println("\nProcessing Withdrawal Requests:");
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            if (accounts.get(request.accountNumber) >= request.amount) {
                accounts.put(request.accountNumber, accounts.get(request.accountNumber) - request.amount);
                System.out.println("Withdrawn " + request.amount + " from Account " + request.accountNumber);
            } else {
                System.out.println("Insufficient funds in Account " + request.accountNumber + " for " + request.amount);
            }
        }
    }

    // Display sorted accounts by balance
    public void displaySortedAccountsByBalance() {
        TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();
        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            sortedAccounts.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\nAccounts Sorted by Balance:");
        for (Map.Entry<Double, Integer> entry : sortedAccounts.entrySet()) {
            System.out.println("Account " + entry.getValue() + " -> Balance: " + entry.getKey());
        }
    }

    // Inner class to represent withdrawal requests
    static class WithdrawalRequest {
        int accountNumber;
        double amount;

        public WithdrawalRequest(int accountNumber, double amount) {
            this.accountNumber = accountNumber;
            this.amount = amount;
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Adding accounts
        bank.addAccount(1001, 5000);
        bank.addAccount(1002, 3000);
        bank.addAccount(1003, 7000);

        // Transactions
        bank.deposit(1001, 2000);
        bank.requestWithdrawal(1002, 1500);
        bank.requestWithdrawal(1003, 8000); // Insufficient funds
        bank.requestWithdrawal(1001, 3000);

        bank.processWithdrawals();

        bank.displaySortedAccountsByBalance();
    }
}
