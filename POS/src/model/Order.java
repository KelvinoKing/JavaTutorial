package model;

import java.util.Date;


public class Order {
  private String id;
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
    this.id = java.util.UUID.randomUUID().toString();
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

    // Print the order details
    // System.out.println(this.toString());
  }

  public String getId() {
    return id;
  }
  public void setId(String orderNumber) {
    this.id = orderNumber;
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
  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }

  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  @Override
  public String toString() {
    // Return the order in a JSON format
    // Also add class name to the JSON object
    return "{"
      + "\"class\": \"" + this.getClass().getSimpleName() + "\","
      + "\"orderNumber\": \"" + this.id + "\","
      + "\"orderDate\": \"" + this.orderDate + "\","
      + "\"customerFirstName\": \"" + this.customerFirstName + "\","
      + "\"customerLastName\": \"" + this.customerLastName + "\","
      + "\"customerEmail\": \"" + this.customerEmail + "\","
      + "\"customerPhoneNumber\": \"" + this.customerPhoneNumber + "\","
      + "\"customerLocation\": \"" + this.customerLocation + "\","
      + "\"customerCity\": \"" + this.customerCity + "\","
      + "\"customerCountry\": \"" + this.customerCountry + "\","
      + "\"productName\": \"" + this.productName + "\","
      + "\"productProfile\": \"" + this.productProfile + "\","
      + "\"productColor\": \"" + this.productColor + "\","
      + "\"productTexture\": \"" + this.productTexture + "\","
      + "\"productGauge\": \"" + this.productGauge + "\","
      + "\"productQuantity\": \"" + this.productQuantity + "\","
      + "\"productPerMeter\": \"" + this.productPerMeter + "\","
      + "\"orderStatus\": \"" + this.orderStatus + "\""
      + "}";
  }

  @SuppressWarnings("deprecation")
  public static Order fromString(String data) {
    // Parse the JSON data to an Order object
    // Remove the class name from the JSON object
    data = data.replace("{", "").replace("}", "");
    String[] parts = data.split(",");
    Order order = new Order(
      parts[3].split(":")[1].replace("\"", "").trim(),
      parts[4].split(":")[1].replace("\"", "").trim(),
      parts[5].split(":")[1].replace("\"", "").trim(),
      parts[6].split(":")[1].replace("\"", "").trim(),
      parts[8].split(":")[1].replace("\"", "").trim(),
      parts[9].split(":")[1].replace("\"", "").trim(),
      parts[7].split(":")[1].replace("\"", "").trim(),
      parts[10].split(":")[1].replace("\"", "").trim(),
      parts[11].split(":")[1].replace("\"", "").trim(),
      parts[12].split(":")[1].replace("\"", "").trim(),
      parts[13].split(":")[1].replace("\"", "").trim(),
      Integer.parseInt(parts[14].split(":")[1].replace("\"", "").trim()),
      Integer.parseInt(parts[15].split(":")[1].replace("\"", "").trim()),
      Double.parseDouble(parts[16].split(":")[1].replace("\"", ""))
    );
    order.setId(parts[1].split(":")[1].replace("\"", "").trim());
    order.setOrderDate(new Date(parts[2].split(":")[1].replace("\"", "")));
    order.setOrderStatus(parts[17].split(":")[1].replace("\"", "").trim());
    return order;
  }
}
