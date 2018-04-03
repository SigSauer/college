package practice.lab7.var2;

import java.util.Objects;

public class Marriage {
    private int merriageId;
    private String fullnameOfMale;
    private String fullnameOfFemale;
    private int ageOfMale;
    private int ageOfFemale;
    private String dateOfMerriage;
    private String newSurnameByFemale;
    private String newSurnameByMale;

    public Marriage(int merriageId, String fullnameOfMale, String fullnameOfFemale, int ageOfMale, int ageOfFemale, String dateOfMerriage, String newSurnameByFemale, String newSurnameByMale) {
        this.merriageId = merriageId;
        this.fullnameOfMale = fullnameOfMale;
        this.fullnameOfFemale = fullnameOfFemale;
        this.ageOfMale = ageOfMale;
        this.ageOfFemale = ageOfFemale;
        this.dateOfMerriage = dateOfMerriage;
        this.newSurnameByFemale = newSurnameByFemale;
        this.newSurnameByMale = newSurnameByMale;
    }

    public Marriage() {
    }

    public int getMerriageId() {
        return merriageId;
    }

    public void setMerriageId(int merriageId) {
        this.merriageId = merriageId;
    }

    public String getFullnameOfMale() {
        return fullnameOfMale;
    }

    public void setFullnameOfMale(String fullnameOfMale) {
        this.fullnameOfMale = fullnameOfMale;
    }

    public String getFullnameOfFemale() {
        return fullnameOfFemale;
    }

    public void setFullnameOfFemale(String fullnameOfFemale) {
        this.fullnameOfFemale = fullnameOfFemale;
    }

    public int getAgeOfMale() {
        return ageOfMale;
    }

    public void setAgeOfMale(int ageOfMale) {
        this.ageOfMale = ageOfMale;
    }

    public int getAgeOfFemale() {
        return ageOfFemale;
    }

    public void setAgeOfFemale(int ageOfFemale) {
        this.ageOfFemale = ageOfFemale;
    }

    public String getDateOfMerriage() {
        return dateOfMerriage;
    }

    public void setDateOfMerriage(String dateOfMerriage) {
        this.dateOfMerriage = dateOfMerriage;
    }

    public String getNewSurnameByFemale() {
        return newSurnameByFemale;
    }

    public void setNewSurnameByFemale(String newSurnameByFemale) {
        this.newSurnameByFemale = newSurnameByFemale;
    }

    public String getNewSurnameByMale() {
        return newSurnameByMale;
    }

    public void setNewSurnameByMale(String newSurnameByMale) {
        this.newSurnameByMale = newSurnameByMale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marriage marriage = (Marriage) o;
        return merriageId == marriage.merriageId &&
                ageOfMale == marriage.ageOfMale &&
                ageOfFemale == marriage.ageOfFemale &&
                Objects.equals(fullnameOfMale, marriage.fullnameOfMale) &&
                Objects.equals(fullnameOfFemale, marriage.fullnameOfFemale) &&
                Objects.equals(dateOfMerriage, marriage.dateOfMerriage) &&
                Objects.equals(newSurnameByFemale, marriage.newSurnameByFemale) &&
                Objects.equals(newSurnameByMale, marriage.newSurnameByMale);
    }

    @Override
    public int hashCode() {

        return Objects.hash(merriageId, fullnameOfMale, fullnameOfFemale, ageOfMale, ageOfFemale, dateOfMerriage, newSurnameByFemale, newSurnameByMale);
    }

    @Override
    public String toString() {
        return "Marriage{" +
                "merriageId=" + merriageId +
                ", fullnameOfMale='" + fullnameOfMale + '\'' +
                ", fullnameOfFemale='" + fullnameOfFemale + '\'' +
                ", ageOfMale=" + ageOfMale +
                ", ageOfFemale=" + ageOfFemale +
                ", dateOfMerriage='" + dateOfMerriage + '\'' +
                ", newSurnameByFemale='" + newSurnameByFemale + '\'' +
                ", newSurnameByMale='" + newSurnameByMale + '\'' +
                '}';
    }

    public void showMerriage() {
        System.out.println( "Номер одруження: " + merriageId +
                            "\nПІБ чоловіка" + fullnameOfMale + " " + newSurnameByMale +
                            "\nПІБ дружини" + fullnameOfFemale + " " + newSurnameByFemale +
                            "\nВік чоловіка" + ageOfMale +
                            "\nВік дружини" + ageOfFemale +
                            "\nДата одруження: " + dateOfMerriage);
    }
}
