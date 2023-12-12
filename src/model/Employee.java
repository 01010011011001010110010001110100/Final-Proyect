package model;


public class Employee {
    
    private int idEmp;
    private String NIPEmp;
    private String nameEmp;
    private String addressEmp;
    private String phoneNumberEmp;
    private String birthdateEmp;
    private int idSex;
    private int idWorkPosition;
    private double salaryEmp;
    private String integrationDate;
    private int idState;

    public Employee(){
    }

    public Employee(int idEmp, String NIPEmp, String nameEmp, String addressEmp, String phoneNumberEmp, String birthdateEmp, int idSex, int idWorkPosition, double salaryEmp, String integrationDate, int idState) {
        this.idEmp = idEmp;
        this.NIPEmp = NIPEmp;
        this.nameEmp = nameEmp;
        this.addressEmp = addressEmp;
        this.phoneNumberEmp = phoneNumberEmp;
        this.birthdateEmp = birthdateEmp;
        this.idSex = idSex;
        this.idWorkPosition = idWorkPosition;
        this.salaryEmp = salaryEmp;
        this.integrationDate = integrationDate;
        this.idState = idState;
    }

    public int getIdEmp() {
        return idEmp;
    }

    public String getNIPEmp() {
        return NIPEmp;
    }

    public String getNameEmp() {
        return nameEmp;
    }

    public String getAddressEmp() {
        return addressEmp;
    }

    public String getPhoneNumberEmp() {
        return phoneNumberEmp;
    }

    public String getBirthdateEmp() {
        return birthdateEmp;
    }

    public int getIdSex() {
        return idSex;
    }

    public int getIdWorkPosition() {
        return idWorkPosition;
    }

    public double getSalaryEmp() {
        return salaryEmp;
    }

    public String getIntegrationDate() {
        return integrationDate;
    }

    public int getIdState() {
        return idState;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    public void setNIPEmp(String NIPEmp) {
        this.NIPEmp = NIPEmp;
    }

    public void setNameEmp(String nameEmp) {
        this.nameEmp = nameEmp;
    }

    public void setAddressEmp(String addressEmp) {
        this.addressEmp = addressEmp;
    }

    public void setPhoneNumberEmp(String phoneNumberEmp) {
        this.phoneNumberEmp = phoneNumberEmp;
    }

    public void setBirthdateEmp(String birthdateEmp) {
        this.birthdateEmp = birthdateEmp;
    }

    public void setIdSex(int idSex) {
        this.idSex = idSex;
    }

    public void setIdWorkPosition(int idWorkPosition) {
        this.idWorkPosition = idWorkPosition;
    }

    public void setSalaryEmp(double salaryEmp) {
        this.salaryEmp = salaryEmp;
    }

    public void setIntegrationDate(String integrationDate) {
        this.integrationDate = integrationDate;
    }

    public void setIdState(int idState) {
        this.idState = idState;
    }

    
    
}