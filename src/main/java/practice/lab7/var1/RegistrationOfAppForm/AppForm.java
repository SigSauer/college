package practice.lab7.var1.RegistrationOfAppForm;

import java.util.Objects;

public class AppForm {
    private int appFormId;
    private String name;
    private String surname;
    private String dayOfTheBirth;
    private String typeOfForm;
    private String dateOfForm;

    public AppForm(int appFormId, String name, String surname, String dayOfTheBirth, String typeOfForm, String dateOfForm) {
        this.appFormId = appFormId;
        this.name = name;
        this.surname = surname;
        this.dayOfTheBirth = dayOfTheBirth;
        this.typeOfForm = typeOfForm;
        this.dateOfForm = dateOfForm;
    }

    public AppForm() {
    }

    public int getAppFormId() {
        return appFormId;
    }

    public void setAppFormId(int appFormId) {
        this.appFormId = appFormId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDayOfTheBirth() {
        return dayOfTheBirth;
    }

    public void setDayOfTheBirth(String dayOfTheBirth) {
        this.dayOfTheBirth = dayOfTheBirth;
    }

    public String getTypeOfForm() {
        return typeOfForm;
    }

    public void setTypeOfForm(String typeOfForm) {
        this.typeOfForm = typeOfForm;
    }

    public String getDateOfForm() {
        return dateOfForm;
    }

    public void setDateOfForm(String dateOfForm) {
        this.dateOfForm = dateOfForm;
    }

    public void showGeneralForm() {
        System.out.println("Їм'я: " + name +
                            "\nПризвище: " + surname +
                            "\nДата нарождення: " + dayOfTheBirth +
                            "\nТип форми: " + typeOfForm +
                            "\nДата форми: " + dateOfForm);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppForm appForm = (AppForm) o;
        return Objects.equals(name, appForm.name) &&
                Objects.equals(surname, appForm.surname) &&
                Objects.equals(dayOfTheBirth, appForm.dayOfTheBirth) &&
                Objects.equals(typeOfForm, appForm.typeOfForm) &&
                Objects.equals(dateOfForm, appForm.dateOfForm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, dayOfTheBirth, typeOfForm, dateOfForm);
    }
}
