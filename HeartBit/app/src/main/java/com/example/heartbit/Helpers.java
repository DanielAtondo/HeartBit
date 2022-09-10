package com.example.heartbit;

public class Helpers {
    private String ssn;
    private String nombres;
    private String aoellidos;

    public Helpers() {
    }

    public Helpers(String ssn, String nombres, String aoellidos) {
        this.ssn = ssn;
        this.nombres = nombres;
        this.aoellidos = aoellidos;
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

    public String getAoellidos() {
        return aoellidos;
    }

    public void setAoellidos(String aoellidos) {
        this.aoellidos = aoellidos;
    }
}
