package com.tnsif.multithreading.synchronization;

public interface Bank {
 int MINBAL=5000;
 int DAILY_LIMIT=25000;
 void deposit(int amt) throws DepositLimitExceedsException;
 void withdraw(int amt)throws InsufficientBalanceException;
}