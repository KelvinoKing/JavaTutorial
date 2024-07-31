package controller;

import main.App;


public class SalesController {
    public SalesController() {
      App.addCenterSales();
    }  

    public void createOrder() {
      System.out.println("Create Order");
    }
}
