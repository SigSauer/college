package oop.step2.lesson1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainWorker {
    public static void main(String[] args) {
        String query = "SELECT * FROM bgserver.workers";

        try{
            Statement st = new WorkerConnect().getConnection().createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next()) {
                Workers worker = new Workers();
                worker.setId(rs.getInt("id"));
                worker.setName(rs.getString("name"));
                worker.setSurname(rs.getString("surname"));

                System.out.println(worker);
            }


        }catch (SQLException ex) {
            System.err.println("Чоловіче, Шкіряний клуб двома поверхами нижче");

        }



    }
}
