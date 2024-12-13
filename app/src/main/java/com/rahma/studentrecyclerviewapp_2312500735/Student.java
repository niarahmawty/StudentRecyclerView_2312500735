package com.rahma.studentrecyclerviewapp_2312500735;

public class Student {
    private String nim;
    private String name;
    private String email;
    private String birthDate;

    public Student(String nim, String name, String email, String birthDate) {
        this.nim = nim;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
