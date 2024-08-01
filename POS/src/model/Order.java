package model;

import java.util.Date;


public class Order {
  private String orderNumber;
  private String customerFirstName;
  private String customerLastName;
  private String customerEmail;
  private String customerPhoneNumber;
  private String customerLocation;
  private String customerCity;
  private String customerCountry;
  private String productName;
  private String productProfile;
  private String productColor;
  private String productTexture;
  private int productGauge;
  private int productQuantity;
  private double productPerMeter;
  private Date orderDate;
  private String orderStatus;

  public Order(
    String customerFirstName, String customerLastName, String customerEmail, String customerPhoneNumber,
    String customerCity, String customerCountry, String customerLocation, String productName,
    String productProfile, String productColor, String productTexture, int productGauge,
    int productQuantity, double productPerMeter
    ) {
    this.orderNumber = java.util.UUID.randomUUID().toString();
    this.orderDate = new Date();
    this.customerFirstName = customerFirstName;
    this.customerLastName = customerLastName;
    this.customerEmail = customerEmail;
    this.customerPhoneNumber = customerPhoneNumber;
    this.customerLocation = customerLocation;
    this.customerCity = customerCity;
    this.customerCountry = customerCountry;
    this.productName = productName;
    this.productProfile = productProfile;
    this.productColor = productColor;
    this.productTexture = productTexture;
    this.productGauge = productGauge;
    this.productQuantity = productQuantity;
    this.productPerMeter = productPerMeter;
    this.orderStatus = "Pending";
  }

  public String getOrderNumber() {
    return orderNumber;
  }

  public String getCustomerFirstName() {
    return customerFirstName;
  }
  public void setCustomerFirstName(String customerFirstName) {
    this.customerFirstName = customerFirstName;
  }

  public String getCustomerLastName() {
    return customerLastName;
  }
  public void setCustomerLastName(String customerLastName) {
    this.customerLastName = customerLastName;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }
  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public String getCustomerPhoneNumber() {
    return customerPhoneNumber;
  }
  public void setCustomerPhoneNumber(String customerPhoneNumber) {
    this.customerPhoneNumber = customerPhoneNumber;
  }

  public String getCustomerLocation() {
    return customerLocation;
  }
  public void setCustomerLocation(String customerLocation) {
    this.customerLocation = customerLocation;
  }

  public String getCustomerCity() {
    return customerCity;
  }
  public void setCustomerCity(String customerCity) {
    this.customerCity = customerCity;
  }

  public String getCustomerCountry() {
    return customerCountry;
  }
  public void setCustomerCountry(String customerCountry) {
    this.customerCountry = customerCountry;
  }

  public String getProductName() {
    return productName;
  }
  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getProductProfile() {
    return productProfile;
  }
  public void setProductProfile(String productProfile) {
    this.productProfile = productProfile;
  }

  public String getProductColor() {
    return productColor;
  }
  public void setProductColor(String productColor) {
    this.productColor = productColor;
  }

  public String getProductTexture() {
    return productTexture;
  }
  public void setProductTexture(String productTexture) {
    this.productTexture = productTexture;
  }

  public int getProductGauge() {
    return productGauge;
  }
  public void setProductGauge(int productGauge) {
    this.productGauge = productGauge;
  }

  public int getProductQuantity() {
    return productQuantity;
  }
  public void setProductQuantity(int productQuantity) {
    this.productQuantity = productQuantity;
  }

  public double getProductPerMeter() {
    return productPerMeter;
  }
  public void setProductPerMeter(double productPerMeter) {
    this.productPerMeter = productPerMeter;
  }

  public Date getOrderDate() {
    return orderDate;
  }

  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  @Override
  public String toString() {
    return "Order{\n" +
      "orderNumber='" + orderNumber + '\n' +
      ", customerFirstName='" + customerFirstName + '\n' +
      ", customerLastName='" + customerLastName + '\n' +
      ", customerEmail='" + customerEmail + '\n' +
      ", customerPhoneNumber='" + customerPhoneNumber + '\n' +
      ", customerAddress='" + customerLocation + '\n' +
      ", customerCity='" + customerCity + '\n' +
      ", customerCountry='" + customerCountry + '\n' +
      ", productName='" + productName + '\n' +
      ", productProfile='" + productProfile + '\n' +
      ", productColor='" + productColor + '\n' +
      ", productTexture='" + productTexture + '\n' +
      ", productGauge='" + productGauge + '\n' +
      ", productQuantity=" + productQuantity + '\n' +
      ", productPerMeter=" + productPerMeter + '\n' +
      ", orderDate=" + orderDate + '\n' +
      ", orderStatus=" + orderStatus + '\n' +
      '}';
  }
}
