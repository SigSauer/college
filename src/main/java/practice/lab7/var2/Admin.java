package practice.lab7.var2;

public class Admin {
    private int staffId;
    private String staffFullname;
    private int Control;

    public Admin(int staffId, String staffFullname, int control) {
        this.staffId = staffId;
        this.staffFullname = staffFullname;
        Control = control;
    }

    public Admin() {
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffFullname() {
        return staffFullname;
    }

    public void setStaffFullname(String staffFullname) {
        this.staffFullname = staffFullname;
    }

    public int getControl() {
        return Control;
    }

    public void setControl(int control) {
        Control = control;
    }

    public void showAdmin() {
        System.out.println( "Номер персональний: "+staffId+
                            "ПІБ: "+staffFullname+
                            "Місце роботи (1 - Прийом заяв, 2 - Одруження): "+Control);
    }

}
