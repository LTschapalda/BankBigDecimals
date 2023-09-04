package org.example;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {



    //Variablen
    private String accountNumber;
    private BigDecimal balance;
    private Client newClient;

    //Implementiert eine Methode, um Geld auf das Konto einzuzahlen.

    public void deposit(BigDecimal deposit){
       balance = balance.add(deposit);
    }

    //Implementiert eine Methode, um Geld vom Konto abzuheben.
    public void withdraw(BigDecimal withdraw) {
        balance = balance.subtract(withdraw);
    }

    //Getter & Setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Client getNewClient() {
        return newClient;
    }

    public void setNewClient(Client newClient) {
        this.newClient = newClient;
    }

    //equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber) && Objects.equals(balance, account.balance) && Objects.equals(newClient, account.newClient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance, newClient);
    }

    //Constructor
    public Account(String accountNumber, BigDecimal balance, Client newClient) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.newClient = newClient;
    }

    //toString

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", newClient=" + newClient +
                '}';
    }
}
