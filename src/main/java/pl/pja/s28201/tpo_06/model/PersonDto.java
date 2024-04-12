package pl.pja.s28201.tpo_06.model;

public class PersonDto {

    private int personCount;
    private String language;
    private boolean hasAddress;
    private boolean hasCountry;
    private boolean hasProfession;
    private boolean hasLanguageProficiency;
    private boolean hasHobby;

    public PersonDto() {
        personCount = 1;
    }

    public int getPersonCount() {
        return personCount;
    }

    public void setPersonCount(int personCount) {
        this.personCount = personCount;
    }

    public void setHasAddress(boolean hasAddress) {
        this.hasAddress = hasAddress;
    }

    public void setHasCountry(boolean hasCountry) {
        this.hasCountry = hasCountry;
    }

    public void setHasProfession(boolean hasProfession) {
        this.hasProfession = hasProfession;
    }

    public void setHasLanguageProficiency(boolean hasLanguageProficiency) {
        this.hasLanguageProficiency = hasLanguageProficiency;
    }

    public void setHasHobby(boolean hasHobby) {
        this.hasHobby = hasHobby;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "personCount=" + personCount +
                ", language='" + language + '\'' +
                ", hasAddress=" + hasAddress +
                ", hasCountry=" + hasCountry +
                ", hasProfession=" + hasProfession +
                ", hasLanguageProficiency=" + hasLanguageProficiency +
                ", hasHobby=" + hasHobby +
                '}';
    }

    public boolean isHasAddress() {
        return hasAddress;
    }

    public boolean isHasCountry() {
        return hasCountry;
    }

    public boolean isHasProfession() {
        return hasProfession;
    }

    public boolean isHasLanguageProficiency() {
        return hasLanguageProficiency;
    }

    public boolean isHasHobby() {
        return hasHobby;
    }
}
