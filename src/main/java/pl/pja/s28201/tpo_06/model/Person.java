package pl.pja.s28201.tpo_06.model;

import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Language language;

    private String address;
    private String country;
    private String profession;
    private LanguageProficiency languageProficiency;
    private String hobby;

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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public LanguageProficiency getLanguageProficiency() {
        return languageProficiency;
    }

    public void setLanguageProficiency(LanguageProficiency languageProficiency) {
        this.languageProficiency = languageProficiency;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
