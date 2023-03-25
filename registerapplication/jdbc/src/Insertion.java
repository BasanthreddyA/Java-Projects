import java.sql.*;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmrcet", "root", "1234");
            PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?)");
            Scanner sc = new Scanner(System.in);
            int x = 0;
            do {
                System.out.println("Enter the number:");
                int no = sc.nextInt();
                System.out.println("Enter the name:");
                String name = sc.next();
                System.out.println("Enter the marks:");
                int marks = sc.nextInt();

                pst.setInt(1,no);
                pst.setString(2, name);
                pst.setInt(3,marks);

                pst.executeUpdate();

                System.out.println("Do you want to continues then enter 1 or 0:");
                x = sc.nextInt();
            }
            while (x==1);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}