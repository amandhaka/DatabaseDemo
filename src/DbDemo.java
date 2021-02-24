import java.sql.*;
import java.util.Scanner;

public class DbDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc=new Scanner(System.in);
        Class.forName("org.postgresql.Driver");
        Connection connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/training", "amandhaka","");
        Statement statement=connection.createStatement();
        String name=sc.nextLine();
        int teamId=sc.nextInt();
        int internId=sc.nextInt();
        String query="insert into interns(internId,internName,teamId) values(" + internId +",'"+name+"',"+teamId+");";
        int rowsImpacted=statement.executeUpdate(query);


        System.out.println("Rows Impacted : "+rowsImpacted);
    }
}
