package practice.lab7.var1.RegistrationOfAppForm;

import java.util.Objects;

public class DeathForm extends AppForm {
    private int DeathFormId;
    private String nameOfDeath;
    private String surnameOfDeath;
    private String ageOfDeath;
    private String dateOfDeath;
    private String causeOfDeath;

    public DeathForm(int appFormId, String name, String surname, String dayOfTheBirth, String typeOfForm, String dateOfForm,
                     int deathFormId, String nameOfDeath, String surnameOfDeath, String ageOfDeath, String dateOfDeath, String causeOfDeath) {
        super(appFormId, name, surname, dayOfTheBirth, typeOfForm, dateOfForm);
        DeathFormId = deathFormId;
        this.nameOfDeath = nameOfDeath;
        this.surnameOfDeath = surnameOfDeath;
        this.ageOfDeath = ageOfDeath;
        this.dateOfDeath = dateOfDeath;
        this.causeOfDeath = causeOfDeath;
    }

    public DeathForm() {
        super();
    }


    public int getDeathFormId() {
        return DeathFormId;
    }

    public void setDeathFormId(int deathFormId) {
        DeathFormId = deathFormId;
    }

    public String getNameOfDeath() {
        return nameOfDeath;
    }

    public void setNameOfDeath(String nameOfDeath) {
        this.nameOfDeath = nameOfDeath;
    }

    public String getSurnameOfDeath() {
        return surnameOfDeath;
    }

    public void setSurnameOfDeath(String surnameOfDeath) {
        this.surnameOfDeath = surnameOfDeath;
    }

    public String getAgeOfDeath() {
        return ageOfDeath;
    }

    public void setAgeOfDeath(String ageOfDeath) {
        this.ageOfDeath = ageOfDeath;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    public void setCauseOfDeath(String causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DeathForm deathForm = (DeathForm) o;
        return DeathFormId == deathForm.DeathFormId &&
                Objects.equals(nameOfDeath, deathForm.nameOfDeath) &&
                Objects.equals(surnameOfDeath, deathForm.surnameOfDeath) &&
                Objects.equals(ageOfDeath, deathForm.ageOfDeath) &&
                Objects.equals(dateOfDeath, deathForm.dateOfDeath) &&
                Objects.equals(causeOfDeath, deathForm.causeOfDeath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), DeathFormId, nameOfDeath, surnameOfDeath, ageOfDeath, dateOfDeath, causeOfDeath);
    }

    public void showDeathForm() {
        showGeneralForm();
        System.out.println( "Ім'я загиблого: " + nameOfDeath +
                            "\nПризвіще загиблого: " + surnameOfDeath +
                            "\nВік загиблого: " + ageOfDeath +
                            "\nДата смерті: " + dateOfDeath +
                            "\nПричина: " + causeOfDeath + "\n" );
    }

}
