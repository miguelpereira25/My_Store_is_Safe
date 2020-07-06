package com.example.mystoreissafe;

public class clienteHelpClass {
    String nameCust , contribuinte, contact, custAddress, custAge, temp;

    public clienteHelpClass() {
    }

    public clienteHelpClass(String nameCust, String contribuinte, String contact, String custAddress, String custAge, String temp) {

        this.nameCust = nameCust;
        this.contribuinte = contribuinte;
        this.contact = contact;
        this.custAddress = custAddress;
        this.custAge = custAge;
        this.temp = temp;
    }

    public String getNameCust() {
        return nameCust;
    }

    public void setNameCust(String nameCust) {
        this.nameCust = nameCust;
    }

    public String getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(String contribuinte) {
        this.contribuinte = contribuinte;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustAge() {
        return custAge;
    }

    public void setCustAge(String custAge) {
        this.custAge = custAge;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

}
