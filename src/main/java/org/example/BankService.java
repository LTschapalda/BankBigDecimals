package org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class BankService {
    // Implementiert eine Methode im BankService, um ein Konto zu eröffnen.
    // Man soll dafür nur einen Kunden als Argument übergeben müssen.
    // Es soll die neue Kontonummer zurückgeben.

    Map<String,Account> accountList = new HashMap<>();

    public String openAccount(Client newClient){
        int length = 10;
        Random accountNumber = new Random();
        StringBuilder randomAccountNumber = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int digit = accountNumber.nextInt(10);
            randomAccountNumber.append(digit);
        }
        String newAccountNumber = randomAccountNumber.toString();

        accountList.put(newAccountNumber,new Account(newAccountNumber,new BigDecimal("0.0"),newClient));
        return newAccountNumber;
    }


    //Implementiert eine Methode im BankService, von einer Kontonummer (als String)
    // einen bestimmten Betrag (als BigDecimal) auf eine andere Kontonummer (als String) zu überweisen.

    public void transfer(Account accountA, Account accountB,BigDecimal transferAmount) {
        accountA.setBalance(accountA.getBalance().subtract(transferAmount));
        accountB.setBalance(accountB.getBalance().add(transferAmount));
    }

}
