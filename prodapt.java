// 
// Decompiled by Procyon v0.5.36
// 

package finalminis;

import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.Connection;

public class prodapt
{
    private static String db_driver;
    private static String db_url;
    private static String db_username;
    private static String db_password;
    
    static {
        prodapt.db_driver = "com.mysql.jdbc.Driver";
        prodapt.db_url = "jdbc:mysql://localhost:3306/project";
        prodapt.db_username = "root";
        prodapt.db_password = "root";
    }
    
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(prodapt.db_driver);
            con = DriverManager.getConnection(prodapt.db_url, prodapt.db_username, prodapt.db_password);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    
    public static void main(final String[] args) {
        try {
            final Scanner sc = new Scanner(System.in);
            System.out.println("..Welcome to prodapt portal..");
            System.out.println("1 : Signup ");
            System.out.println("2 : Login ");
            final process tf = new process();
            final int bn = sc.nextInt();
            switch (bn) {
                case 1: {
                    System.out.println("Enter your employee id :");
                    final String userid = sc.next();
                    System.out.println("Enter username :");
                    final String username = sc.next();
                    System.out.println("Enter your role :");
                    final String role = sc.next();
                    System.out.println("Enter your date of birth ");
                    final String dob = sc.next();
                    tf.signup(userid, username, role, dob);
                    System.out.println("sign up successfully now you can access portal");
                    System.out.println("WELCOME TO PRODAPT FAMILY :)");
                    System.out.println("Enter your choice :");
                    System.out.println(" 1: leave apply portal :");
                    System.out.println(" 2: show user details :");
                    break;
                }
                case 2: {
                    System.out.println("Enter employee id :");
                    final String un = sc.next();
                    System.out.println("Enter date of birth :");
                    final String ps = sc.next();
                    tf.userlogin(un, ps);
                    if (un.equals(tf.un) && ps.equals(tf.ps)) {
                        System.out.println("Login successfully now you can access portal");
                        System.out.println("Enter your choice :");
                        System.out.println(" 1: leave apply portal :");
                        System.out.println(" 2: show user details :");
                        break;
                    }
                    System.out.println("Invalid id or dob");
                    break;
                }
            }
            final int i = sc.nextInt();
            switch (i) {
                case 1: {
                    tf.leaveapply();
                    break;
                }
                case 2: {
                    tf.userdetails();
                    break;
                }
                default: {
                    System.out.println("invalid entry");
                    break;
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
