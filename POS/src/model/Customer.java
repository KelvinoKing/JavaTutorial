package model;

import java.util.Date;

public class Customer {
  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;
  private String address;
  private String city;
  private String country;
  private String quotationNumber;
  private String orderNumber;
  private String paymentMethod;
  private Date orderDate;
  private Date deliveryDate;
  private Date paymentDate;

  public Customer(
    String firstName, String lastName, String email,
    String phoneNumber, String address, String city,
    String country, String quotationNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.city = city;
    this.country = country;
    this.quotationNumber = quotationNumber;
  }

  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  public String getQuotationNumber() {
    return quotationNumber;
  }
  public void setQuotationNumber(String quotationNumber) {
    this.quotationNumber = quotationNumber;
  }

  public String getOrderNumber() {
    return orderNumber;
  }
  public Date getOrderDate() {
    return orderDate;
  }
  public Date getDeliveryDate() {
    return deliveryDate;
  }
  public Date getPaymentDate() {
    return paymentDate;
  }
  public String getPaymentMethod() {
    return paymentMethod;
  }
  public void setOrderNumber(
    String orderNumber, Date orderDate, Date deliveryDate, Date paymentDate, String paymentMethod) {
    this.orderNumber = orderNumber;
    this.orderDate = orderDate;
    this.deliveryDate = deliveryDate;
    this.paymentDate = paymentDate;
    this.paymentMethod = paymentMethod;
  }

  @Override
  public String toString() {
    return "Customer{" +
      "firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", email='" + email + '\'' +
      ", phoneNumber='" + phoneNumber + '\'' +
      ", address='" + address + '\'' +
      ", city='" + city + '\'' +
      ", country='" + country + '\'' +
      ", quotationNumber='" + quotationNumber + '\'' +
      ", orderNumber='" + orderNumber + '\'' +
      ", paymentMethod='" + paymentMethod + '\'' +
      ", orderDate=" + orderDate +
      ", deliveryDate=" + deliveryDate +
      ", paymentDate=" + paymentDate +
      '}';
  }
}
