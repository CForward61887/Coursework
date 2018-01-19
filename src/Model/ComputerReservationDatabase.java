package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ComputerReservationDatabase {

    public static void selectAll (List<Usernames> targetList, DatabaseConncection database){
        PreparedStatement = database.newStatement("SELECT Login_ID, Password FROM Usernames ORDER BY Login_ID");
        try {
            if (statement != null){
                ResultSet results = database.excuteQuery(statement);

                if(results!=null){
                    while(results.next()){
                        targetList.add(new Usernames(
                                results.getInt("Login_ID"),
                                results.getString("Password")
                        ));
                    }
                }
            }
        } catch (SQLException resultsException){
            System.out.println("Database select all error: "+ resultsException.getMessage());
        }



    }





}
