package talabat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class User {

    String Username;
    String Password;
    Connection con;
    Statement stat;
    ResultSet rs;
    Connection con1;
    Statement stat1;
    ResultSet rs1;
    Scanner console = new Scanner(System.in);

    public User(String username, String password) {
        this.Username = username;
        this.Password = password;
    }

    public abstract void Register();

    public abstract void Show();

    public void connect() {
        try {
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/talabat", "root", "");
            stat1 = con1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stat = con1.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void connect1() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/talabat", "root", "");
            stat = con.createStatement();
        } catch (Exception ex) {
            System.out.print("something wrong");
        }
    }

    public static boolean ValidPassword(String password) {
        String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher m = p.matcher(password);
        return m.matches();
    }

    public static boolean confirmPassword(String password, String confirm) {
        return password.equals(confirm);
    }
}
