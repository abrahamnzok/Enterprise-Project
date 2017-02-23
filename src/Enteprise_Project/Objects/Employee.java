package Enteprise_Project.Objects;

import javafx.beans.property.SimpleStringProperty;

public class Employee {
    private SimpleStringProperty employeeID;
    private SimpleStringProperty employeeFstName;
    private SimpleStringProperty employeeLstName;
    private SimpleStringProperty employeeMail;
    private SimpleStringProperty employeeBirthDay;
    private SimpleStringProperty employeePhoneNumber;
    private SimpleStringProperty employeeBirthCity;
    private SimpleStringProperty employeeBirthCountry;
    private SimpleStringProperty employeeMarritalStatus;
    private SimpleStringProperty employeeReligion;
    private SimpleStringProperty employeeDepartement;

    /*
     * Constructor by Default
    */

    public Employee (){
        this(null, null, null, null, null, null, null, null,null, null, null);
    }

    /*
     * The Employee Constructor
    */
    public Employee(String employeeID, String employeeFstName, String employeeLstName, String employeeDepartement,
                    String employeeBirthDay, String employeeBirthCity, String employeeBirthCountry,
                    String employeeMarritalStatus, String employeeReligion, String employeePhoneNumber, String employeeMail) {

        this.employeeID = new SimpleStringProperty(employeeID);
        this.employeeFstName = new SimpleStringProperty(employeeFstName);
        this.employeeLstName = new SimpleStringProperty(employeeLstName);
        this.employeeDepartement = new SimpleStringProperty(employeeDepartement);
        this.employeeBirthDay = new SimpleStringProperty(employeeBirthDay);
        this.employeeBirthCity = new SimpleStringProperty(employeeBirthCity);
        this.employeeBirthCountry = new SimpleStringProperty(employeeBirthCountry);
        this.employeePhoneNumber = new SimpleStringProperty(employeePhoneNumber);
        this.employeeMarritalStatus = new SimpleStringProperty(employeeMarritalStatus);
        this.employeeReligion = new SimpleStringProperty(employeeReligion);
        this.employeeMail = new SimpleStringProperty(employeeMail);
    }

    /*
     * Creating getters and Setters
    */

    public String getEmployeeID() {
        return employeeID.get();
    }

    public SimpleStringProperty employeeIDProperty() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID.set(employeeID);
    }

    public String getEmployeeFstName() {
        return employeeFstName.get();
    }

    public SimpleStringProperty employeeFstNameProperty() {
        return employeeFstName;
    }

    public void setEmployeeFstName(String employeeFstName) {
        this.employeeFstName.set(employeeFstName);
    }

    public String getEmployeeLstName() {
        return employeeLstName.get();
    }

    public SimpleStringProperty employeeLstNameProperty() {
        return employeeLstName;
    }

    public void setEmployeeLstName(String employeeLstName) {
        this.employeeLstName.set(employeeLstName);
    }

    public String getEmployeeMail() {
        return employeeMail.get();
    }

    public SimpleStringProperty employeeMailProperty() {
        return employeeMail;
    }

    public void setEmployeeMail(String employeeMail) {
        this.employeeMail.set(employeeMail);
    }

    public String getEmployeeDepartement() {
        return employeeDepartement.get();
    }

    public SimpleStringProperty employeeDepartementProperty() {
        return employeeDepartement;
    }

    public void setEmployeeDepartement(String employeeDepartement) {
        this.employeeDepartement.set(employeeDepartement);
    }

    public String getEmployeeBirthDay() {
        return employeeBirthDay.get();
    }

    public SimpleStringProperty employeeBirthDayProperty() {
        return employeeBirthDay;
    }

    public void setEmployeeBirthDay(String employeeBirthDay) {
        this.employeeBirthDay.set(employeeBirthDay);
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber.get();
    }

    public SimpleStringProperty employeePhoneNumberProperty() {
        return employeePhoneNumber;
    }

    public void setEmployeePhoneNumber(String employeePhoneNumber) {
        this.employeePhoneNumber.set(employeePhoneNumber);
    }

    public String getEmployeeBirthCity() {
        return employeeBirthCity.get();
    }

    public SimpleStringProperty employeeBirthCityProperty() {
        return employeeBirthCity;
    }

    public void setEmployeeBirthCity(String employeeBirthCity) {
        this.employeeBirthCity.set(employeeBirthCity);
    }

    public String getEmployeeBirthCountry() {
        return employeeBirthCountry.get();
    }

    public SimpleStringProperty employeeBirthCountryProperty() {
        return employeeBirthCountry;
    }

    public void setEmployeeBirthCountry(String employeeBirthCountry) {
        this.employeeBirthCountry.set(employeeBirthCountry);
    }

    public String getEmployeeMarritalStatus() {
        return employeeMarritalStatus.get();
    }

    public SimpleStringProperty employeeMarritalStatusProperty() {
        return employeeMarritalStatus;
    }

    public void setEmployeeMarritalStatus(String employeeMarritalStatus) {
        this.employeeMarritalStatus.set(employeeMarritalStatus);
    }

    public String getEmployeeReligion() {
        return employeeReligion.get();
    }

    public SimpleStringProperty employeeReligionProperty() {
        return employeeReligion;
    }

    public void setEmployeeReligion(String employeeReligion) {
        this.employeeReligion.set(employeeReligion);
    }
}
