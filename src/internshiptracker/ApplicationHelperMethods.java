package internshiptracker;

import Database.ConnectionProvider;
import Database.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

/**
 *
 * @author calvy
 */
public class ApplicationHelperMethods {

    boolean retrievedApplication = false;
    String appId;
//    Setting up values to be filled for update forms (see old data)
    String application;
    String status;
    String dateApplied;
    String duration;
    String company;
    String contactInfo;

    public void closeAllErrors(JLabel... labels) {
        for (JLabel label
                : labels) {
            label.setVisible(false);
        };
    }

    public void SearchApplications(String type, String inputText, JLabel error, JTable table) {
        try {
            closeAllErrors(error);

            Connection con = ConnectionProvider.loadConnection();

            PreparedStatement PS = con.prepareStatement("SELECT * FROM APPLICATION WHERE " + type + "=" + "'"
                    + inputText + "'", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = PS.executeQuery();
//             If the query returns no data
            table.setModel(DBUtils.resultSetToTableModel(rs));

//             Checks if empty
//            System.out.println(rs.toString());
//            System.out.println("SELECT * FROM APPLICATION WHERE " + type + "=" + "'"
//                    + inputText + "'");
//            System.out.println(rs.isBeforeFirst());
            closeAllErrors();
            if (!rs.first()) {
                error.setVisible(true);
            } else {
//                allows for more information to be added to the first entry found
                retrievedApplication = true;
                this.appId = rs.getString("appId");
                this.application = rs.getString("application");
                this.status = rs.getString("status");
                this.dateApplied = rs.getString("dateApplied");
                this.duration = rs.getString("duration");
                this.company = rs.getString("company");
                this.contactInfo = rs.getString("contactInfo");
            };
            do {
                String data = rs.getString("appId");
                System.out.println(data);
            } while (rs.next());

        } catch (Exception e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Sorry, the data was not fetched");

        };
    }

    public void populateFields(JTextField app, JTextField date, JTextField comp, JTextField cont, JComboBox stat, JComboBox dur) {
        System.out.println(this.company + " " + this.contactInfo);
        app.setText(this.application);
        date.setText(this.dateApplied);
        comp.setText(this.company);
        cont.setText(this.contactInfo);
        stat.setSelectedItem(this.status);
        dur.setSelectedItem(this.duration);

    }

    public void UpdateApplication(String app, String stat, String date, String dur, String company, String contact) {

        try {
            Connection con = ConnectionProvider.loadConnection();

            PreparedStatement PS = con.prepareStatement("UPDATE APPLICATION "
                    + "SET application=?,"
                    + "status=?,"
                    + "dateApplied=?,"
                    + "duration=?,"
                    + "company=?,"
                    + "contactInfo=?"
                    + "WHERE appId=?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            PS.setString(1, app);
            PS.setString(2, stat);
            PS.setString(3, date);
            PS.setString(4, dur);
            PS.setString(5, company);
            PS.setString(6, contact);
            PS.setString(7, this.appId);
            System.out.println(PS.toString());
            PS.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully updated application " + this.appId);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Updated failed!");

        }

    }

}
