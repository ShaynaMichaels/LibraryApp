package edu.yu.oop;

import java.sql.*;

class Customer {
    public Customer() {}

    public void loadCustomer(int id) {
        try {

            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/josh/MVCDemo/CustomerDatabase");
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT First, Last, SSN, ID, SSN From Customers Where ID =" + id);

            if (rs.next()) { // there was a result
                first = rs.getString("First");
                last = rs.getString("Last");
                SSN = rs.getString("SSN");
                ID = id;

            }
        }
        catch (SQLException a) {
            System.out.println(a);
        }
    }


    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String ssn) {
        this.SSN = ssn;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    int ID;
    String first, last, SSN;
}
