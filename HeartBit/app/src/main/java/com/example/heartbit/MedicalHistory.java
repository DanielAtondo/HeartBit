package com.example.heartbit;

public class MedicalHistory {
    private String domicilio;
    private String sexo;
    private String fechaNacimiento;
    private String padecimiento;
    private String alergias;
    private String highRiskIllness;

    public MedicalHistory() {
    }

    public MedicalHistory(String domicilio, String sexo, String fechaNacimiento, String padecimiento, String alergias, String highRiskIllness) {
        this.domicilio = domicilio;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.padecimiento = padecimiento;
        this.alergias = alergias;
        this.highRiskIllness = highRiskIllness;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public void setPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getHighRiskIllness() {
        return highRiskIllness;
    }

    public void setHighRiskIllness(String highRiskIllness) {
        this.highRiskIllness = highRiskIllness;
    }
}
