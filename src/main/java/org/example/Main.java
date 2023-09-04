package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Implementiert eine Methode im BankService, um ein Konto zu eröffnen.
        // Man soll dafür nur einen Kunden als Argument übergeben müssen.
        // Es soll die neue Kontonummer zurückgeben.

        //Konten Anlegen

        //Konto eröffnen
        BankService newCustomer = new BankService();
        String account1 = newCustomer.openAccount(new Client("Hanne", "Lohre", 01));

        System.out.println(account1);

    }
}