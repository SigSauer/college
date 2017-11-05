package study.ArrayList;

public class Service {
    private String surname;
    private String name;
    private int age;

    public Service(String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public Service() {

    }

    @Override
    public String toString() {
        return "Service:" +
                "Surname: " + surname + "\n " +
                "Name: " + name + "\n" +
                "Age: " + age + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Service service = (Service) o;

        if (age != service.age) return false;
        if (!surname.equals(service.surname)) return false;
        return name.equals(service.name);
    }

    @Override
    public int hashCode() {
        int result = surname.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



