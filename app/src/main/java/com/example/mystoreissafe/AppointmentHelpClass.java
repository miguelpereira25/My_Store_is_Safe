package com.example.mystoreissafe;

public class AppointmentHelpClass {
    String nomeCliente, dataMarc, hourMarc, timeMarc;

    public AppointmentHelpClass(String nomeCliente, String dataMarc, String hourMarc, String timeMarc) {
        this.nomeCliente = nomeCliente;
        this.dataMarc = dataMarc;
        this.hourMarc = hourMarc;
        this.timeMarc = timeMarc;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDataMarc() {
        return dataMarc;
    }

    public void setDataMarc(String dataMarc) {
        this.dataMarc = dataMarc;
    }

    public String getHourMarc() {
        return hourMarc;
    }

    public void setHourMarc(String hourMarc) {
        this.hourMarc = hourMarc;
    }

    public String getTimeMarc() {
        return timeMarc;
    }

    public void setTimeMarc(String timeMarc) {
        this.timeMarc = timeMarc;
    }
}

