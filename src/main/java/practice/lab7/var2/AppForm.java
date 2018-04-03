package practice.lab7.var2;

import java.util.Objects;

public class AppForm {
    private int appFormId;

    private String fullname;
    private String dateOfTheBirth;
    private int typeOfForm;
    private String dateOfForm;

    private String nameOfChild;
    private String surnameOfChild;
    private String sexOfChild;
    private String nameOfDad;
    private String nameOfMom;
    private String dayOfBirth;

    private String fullnameOfDeath;
    private String sexOfDeath;
    private String ageOfDeath;
    private String dateOfDeath;
    private String causeOfDeath;

    private String fullnameOfMale;
    private String fullnameOfFemale;
    private String dateOfMerriage;
    private String newSurnameByFemale;
    private String newSurnameByMale;

    public AppForm() {
    }

    public void setAppFormId(int appFormId) {
        this.appFormId = appFormId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setDateOfTheBirth(String dateOfTheBirth) {
        this.dateOfTheBirth = dateOfTheBirth;
    }

    public int getTypeOfForm() {
        return typeOfForm;
    }

    public void setTypeOfForm(int typeOfForm) {
        this.typeOfForm = typeOfForm;
    }

    public String getDateOfForm() {
        return dateOfForm;
    }

    public void setDateOfForm(String dateOfForm) {
        this.dateOfForm = dateOfForm;
    }

    public String getNameOfChild() {
        return nameOfChild;
    }

    public void setNameOfChild(String nameOfChild) {
        this.nameOfChild = nameOfChild;
    }

    public String getSurnameOfChild() {
        return surnameOfChild;
    }

    public void setSurnameOfChild(String surnameOfChild) {
        this.surnameOfChild = surnameOfChild;
    }

    public String getNameOfDad() {
        return nameOfDad;
    }

    public void setNameOfDad(String nameOfDad) {
        this.nameOfDad = nameOfDad;
    }

    public String getNameOfMom() {
        return nameOfMom;
    }

    public void setNameOfMom(String nameOfMom) {
        this.nameOfMom = nameOfMom;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getFullnameOfDeath() {
        return fullnameOfDeath;
    }

    public void setFullnameOfDeath(String fullnameOfDeath) {
        this.fullnameOfDeath = fullnameOfDeath;
    }

    public void setSexOfDeath(String sexOfDeath) {
        this.sexOfDeath = sexOfDeath;
    }

    public void setAgeOfDeath(String ageOfDeath) {
        this.ageOfDeath = ageOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public void setCauseOfDeath(String causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
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

    public void setDateOfMerriage(String dateOfMerriage) {
        this.dateOfMerriage = dateOfMerriage;
    }

    public void setNewSurnameByFemale(String newSurnameByFemale) {
        this.newSurnameByFemale=newSurnameByFemale;
    }


    public void setNewSurnameByMale(String newSurMameByMale) {
        this.newSurnameByMale = newSurMameByMale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppForm appForm = (AppForm) o;
        return appFormId == appForm.appFormId &&
                typeOfForm == appForm.typeOfForm &&
                Objects.equals(fullname, appForm.fullname) &&
                Objects.equals(dateOfTheBirth, appForm.dateOfTheBirth) &&
                Objects.equals(dateOfForm, appForm.dateOfForm) &&
                Objects.equals(nameOfChild, appForm.nameOfChild) &&
                Objects.equals(surnameOfChild, appForm.surnameOfChild) &&
                Objects.equals(sexOfChild, appForm.sexOfChild) &&
                Objects.equals(nameOfDad, appForm.nameOfDad) &&
                Objects.equals(nameOfMom, appForm.nameOfMom) &&
                Objects.equals(dayOfBirth, appForm.dayOfBirth) &&
                Objects.equals(fullnameOfDeath, appForm.fullnameOfDeath) &&
                Objects.equals(sexOfDeath, appForm.sexOfDeath) &&
                Objects.equals(ageOfDeath, appForm.ageOfDeath) &&
                Objects.equals(dateOfDeath, appForm.dateOfDeath) &&
                Objects.equals(causeOfDeath, appForm.causeOfDeath) &&
                Objects.equals(fullnameOfMale, appForm.fullnameOfMale) &&
                Objects.equals(fullnameOfFemale, appForm.fullnameOfFemale) &&
                Objects.equals(dateOfMerriage, appForm.dateOfMerriage) &&
                Objects.equals(newSurnameByFemale, appForm.newSurnameByFemale) &&
                Objects.equals(newSurnameByMale, appForm.newSurnameByMale);
    }

    @Override
    public int hashCode() {

        return Objects.hash(appFormId, fullname, dateOfTheBirth, typeOfForm, dateOfForm, nameOfChild, surnameOfChild, sexOfChild, nameOfDad, nameOfMom, dayOfBirth, fullnameOfDeath, sexOfDeath, ageOfDeath, dateOfDeath, causeOfDeath, fullnameOfMale, fullnameOfFemale, dateOfMerriage, newSurnameByFemale, newSurnameByMale);
    }

    public void showAppForm() {
        System.out.println( "    Номер заяви: "+ appFormId);
        System.out.println( "ПІБ заявника: " + fullname +
                "\nДата народження заявника: " + dateOfTheBirth +
                "\nТип заяви* : " + typeOfForm +
                "\nДата заяви: " + dateOfForm+"\n");
        switch (typeOfForm) {
            case 1:
                System.out.println( "Ім'я дитини: " + nameOfChild +
                                    "\nПризвище дитини: " + surnameOfChild +
                                    "\nСтать дитини: " + sexOfChild +
                                    "\nПІБ батька: " + nameOfDad + " " + surnameOfChild +
                                    "\nПІБ матері: " + nameOfMom + " " + surnameOfChild +
                                    "\nДата народження: "+ dayOfBirth);
                break;
            case 2:
                System.out.println( "ПІБ людини: " + fullnameOfDeath +
                        "\nСтать: " + sexOfDeath +
                        "\nВік: " + ageOfDeath +
                        "\nДата смерті: " + dateOfDeath +
                        "\nПричина: "+ causeOfDeath);

                break;
            case 3:
                System.out.println( "ПІБ чоловіка: " + fullnameOfMale +
                        "\nПІБ дружини: " + fullnameOfFemale +
                        "\nДата укладання шлюбу: " + dateOfMerriage +
                        "\nЗмінене призвище дружини: " + newSurnameByFemale +
                        "\nЗмінене призвище чоловіка: "+ newSurnameByMale);
                break;
        }
        System.out.println( "\n*: 1 - Заява на реєістрацію народження" +
                            "\n   2 - Заява на реєістрацію смерті" +
                            "\n   3 - Заява на укладання шлюбу\n");

    }

}
