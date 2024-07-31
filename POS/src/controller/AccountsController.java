package controller;

import main.App;


public class AccountsController {
    public AccountsController() {
      // Add the Accounts view to the center of the app window
      App.addCenterAccounts();
    }

    public static void addTransaction() {
      // Add the Add Transaction view to the center of the app window
      System.out.println("Add Transaction");
    }
}
