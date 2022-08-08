// 
// Decompiled by Procyon v0.5.36
// 

package finalminis;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.Scanner;

public class process
{
    String un;
    String ps;
    Scanner sc;
    
    public process() {
        this.un = "";
        this.ps = "";
        this.sc = new Scanner(System.in);
    }
    
    public void signup(final String userid, final String username, final String role, final String dob) throws SQLException {
        final Connection con = prodapt.getConnection();
        final String a1 = "insert into prodapt(emp_id,emp_name,position,dob) values(?,?,?,?)";
        final PreparedStatement z1 = con.prepareStatement(a1);
        z1.setString(1, userid);
        z1.setString(2, username);
        z1.setString(3, role);
        z1.setString(4, dob);
        final int r1 = z1.executeUpdate();
        System.out.println("YOU HAVE SUCCESSFULLY SIGNUP");
    }
    
    public void userlogin(final String username, final String dob) throws SQLException {
        final Connection con = prodapt.getConnection();
        final String se = "select emp_id,dob from prodapt where emp_id='" + username + "'and dob='" + dob + "';";
        final Statement pc = con.createStatement();
        final ResultSet rs = pc.executeQuery(se);
        final String un = "";
        final String ps = "";
        while (rs.next()) {
            this.un = rs.getString(1);
            this.ps = rs.getString(2);
        }
    }
    
    public void leaveapply() {
        try {
            final Connection con = prodapt.getConnection();
            final String s1 = "insert into levapp values(?,?,?)";
            final PreparedStatement smt = con.prepareStatement(s1);
            System.out.println("Enter Start date :");
            final String ss = this.sc.next();
            System.out.println("Enter end date:");
            final String st = this.sc.next();
            System.out.println("Enter reason:");
            final String sx = this.sc.next();
            smt.setString(1, ss);
            smt.setString(2, st);
            smt.setString(3, sx);
            final int xc = smt.executeUpdate();
            System.out.println("Thank you :)");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void userdetails() {
        try {
            final Connection con = prodapt.getConnection();
            System.out.println("Enter id :");
            final String a = this.sc.next();
            System.out.println("Enter dob :");
            final String b = this.sc.next();
            final Statement st = con.createStatement();
            final ResultSet rs = st.executeQuery("select * from prodapt");
            while (rs.next()) {
                if (rs.getString(1).equals(a)) {
                    System.out.println("ID:" + rs.getString(1));
                    System.out.println("USERNAME :" + rs.getString(2));
                    System.out.println("ROLE:" + rs.getString(3));
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
