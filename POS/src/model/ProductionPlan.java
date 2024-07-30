package model;


public class ProductionPlan{
  private String orderNumber;
  private String productName;
  private String productDescription;
  private int productQuantity;
  private double productMeters;

  public ProductionPlan(
    String orderNumber, String productName, String productDescription,
    int productQuantity, double productMeters) {
    this.orderNumber = orderNumber;
    this.productName = productName;
    this.productDescription = productDescription;
    this.productQuantity = productQuantity;
    this.productMeters = productMeters;
  }

  public String getOrderNumber() {
    return orderNumber;
  }
  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public String getProductName() {
    return productName;
  }
  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getProductDescription() {
    return productDescription;
  }
  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public int getProductQuantity() {
    return productQuantity;
  }
  public void setProductQuantity(int productQuantity) {
    this.productQuantity = productQuantity;
  }

  public double getProductMeters() {
    return productMeters;
  }
  public void setProductMeters(double productMeters) {
    this.productMeters = productMeters;
  }

  public double getProductTotal() {
    return productQuantity * productMeters;
  }

  public String toString() {
    return "ProductionPlan{" +
      "orderNumber='" + orderNumber + '\'' +
      ", productName='" + productName + '\'' +
      ", productDescription='" + productDescription + '\'' +
      ", productQuantity=" + productQuantity +
      ", productMeters=" + productMeters +
      '}';
  }
}
