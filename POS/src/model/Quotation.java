package model;

public class Quotation {
  private String quotationNumber;
  private String customerName;
  private String customerEmail;
  private String customerPhoneNumber;
  private String customerAddress;
  private String customerCity;
  private String customerCountry;
  private String productName;
  private String productDescription;
  private double productPrice;
  private int productQuantity;
  private double productPerMeter;
  private double productTotal;
  private double productDiscount;
  private double productSubtotal;
  private double productTax;
  private double productShipping;
  private double productGrandTotal;

  public Quotation(
    String customerName, String customerEmail,
    String customerPhoneNumber, String customerAddress, String customerCity,
    String customerCountry, String productName, String productDescription,
    double productPrice, int productQuantity, double productPerMeter, double productDiscount,
    double productTax, double productShipping) {
    this.quotationNumber = java.util.UUID.randomUUID().toString();
    this.customerName = customerName;
    this.customerEmail = customerEmail;
    this.customerPhoneNumber = customerPhoneNumber;
    this.customerAddress = customerAddress;
    this.customerCity = customerCity;
    this.customerCountry = customerCountry;
    this.productName = productName;
    this.productDescription = productDescription;
    this.productPrice = productPrice;
    this.productQuantity = productQuantity;
    this.productPerMeter = productPerMeter;
    this.productDiscount = productDiscount;
    this.productTax = productTax;
    this.productShipping = productShipping;
    this.productTotal = productPrice * (productQuantity * productPerMeter);
    this.productSubtotal = this.productTotal - this.productDiscount;
    this.productGrandTotal = this.productSubtotal + this.productTax + this.productShipping;
  }

  public String getQuotationNumber() {
    return quotationNumber;
  }
  public void setQuotationNumber(String quotationNumber) {
    this.quotationNumber = quotationNumber;
  }

  public String getCustomerName() {
    return customerName;
  }
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
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

  public String getCustomerAddress() {
    return customerAddress;
  }
  public void setCustomerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
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

  public String getProductDescription() {
    return productDescription;
  }
  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public double getProductPrice() {
    return productPrice;
  }
  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
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

  public double getProductTotal() {
    return productTotal;
  }
  public void setProductTotal(double productTotal) {
    this.productTotal = productTotal;
  }

  public double getProductDiscount() {
    return productDiscount;
  }
  public void setProductDiscount(double productDiscount) {
    this.productDiscount = productDiscount;
  }

  public double getProductSubtotal() {
    return productSubtotal;
  }
  public void setProductSubtotal(double productSubtotal) {
    this.productSubtotal = productSubtotal;
  }

  public double getProductTax() {
    return productTax;
  }
  public void setProductTax(double productTax) {
    this.productTax = productTax;
  }

  public double getProductShipping() {
    return productShipping;
  }
  public void setProductShipping(double productShipping) {
    this.productShipping = productShipping;
  }

  public double getProductGrandTotal() {
    return productGrandTotal;
  }
  public void setProductGrandTotal(double productGrandTotal) {
    this.productGrandTotal = productGrandTotal;
  }

  public String toString() {
    return "Quotation Number: " + this.quotationNumber + "\n" +
      "Customer Name: " + this.customerName + "\n" +
      "Customer Email: " + this.customerEmail + "\n" +
      "Customer Phone Number: " + this.customerPhoneNumber + "\n" +
      "Customer Address: " + this.customerAddress + "\n" +
      "Customer City: " + this.customerCity + "\n" +
      "Customer Country: " + this.customerCountry + "\n" +
      "Product Name: " + this.productName + "\n" +
      "Product Description: " + this.productDescription + "\n" +
      "Product Price: " + this.productPrice + "\n" +
      "Product Quantity: " + this.productQuantity + "\n" +
      "Product Per Meter: " + this.productPerMeter + "\n" +
      "Product Total: " + this.productTotal + "\n" +
      "Product Discount: " + this.productDiscount + "\n" +
      "Product Subtotal: " + this.productSubtotal + "\n" +
      "Product Tax: " + this.productTax + "\n" +
      "Product Shipping: " + this.productShipping + "\n" +
      "Product Grand Total: " + this.productGrandTotal + "\n";
  }
}
