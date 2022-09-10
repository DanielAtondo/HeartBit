package com.example.heartbit;

public class Patients {
    private String ssn;
    private String nombres;
    private String apellidos;
    private MedicalHistory historial;

    public Patients() {
    }

    public Patients(String ssn, String nombres, String apellidos, MedicalHistory historial) {
        this.ssn = ssn;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.historial = historial;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public MedicalHistory getHistorial() {
        return historial;
    }

    public void setHistorial(MedicalHistory historial) {
        this.historial = historial;
    }
}
