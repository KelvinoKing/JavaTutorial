package model;

import java.util.Date;


public class Employee {
  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;
  private String address;
  private String city;
  private String country;
  private String employeeNumber;
  private String jobTitle;
  private double salary;
  private String department;
  private String manager;
  private Date hireDate;
  private Date terminationDate;

  public Employee(
    String firstName, String lastName, String email,
    String phoneNumber, String address, String city,
    String country, String employeeNumber, String jobTitle,
    double salary, String department, String manager,
    Date hireDate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.city = city;
    this.country = country;
    this.employeeNumber = employeeNumber;
    this.jobTitle = jobTitle;
    this.salary = salary;
    this.department = department;
    this.manager = manager;
    this.hireDate = hireDate;
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

  public String getEmployeeNumber() {
    return employeeNumber;
  }
  public void setEmployeeNumber(String employeeNumber) {
    this.employeeNumber = employeeNumber;
  }

  public String getJobTitle() {
    return jobTitle;
  }
  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public double getSalary() {
    return salary;
  }
  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getDepartment() {
    return department;
  }
  public void setDepartment(String department) {
    this.department = department;
  }

  public String getManager() {
    return manager;
  }
  public void setManager(String manager) {
    this.manager = manager;
  }

  public Date getHireDate() {
    return hireDate;
  }
  public void setHireDate(Date hireDate) {
    this.hireDate = hireDate;
  }

  public Date getTerminationDate() {
    return terminationDate;
  }
  public void setTerminationDate(Date terminationDate) {
    this.terminationDate = terminationDate;
  }

  public String toString() {
    return "Employee{" +
      "firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", email='" + email + '\'' +
      ", phoneNumber='" + phoneNumber + '\'' +
      ", address='" + address + '\'' +
      ", city='" + city + '\'' +
      ", country='" + country + '\'' +
      ", employeeNumber='" + employeeNumber + '\'' +
      ", jobTitle='" + jobTitle + '\'' +
      ", salary=" + salary +
      ", department='" + department + '\'' +
      ", manager='" + manager + '\'' +
      ", hireDate='" + hireDate + '\'' +
      ", terminationDate='" + terminationDate + '\'' +
      '}';
  }
}
