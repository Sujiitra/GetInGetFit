package ui;

import java.util.ArrayList;
import model.UserPanel;
import java.sql.*;

public class DBConnector {

    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin";

    DBConnector() {
    }

    public static void addChallenger(UserPanel c) {
        String query = "INSERT INTO Challengers(FIRST,LAST,EMAILID,COUNTRY) VALUES(?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, c.getFirstName());
            stmt.setString(2, c.getLastName());
            stmt.setString(3, c.getEmail());
            stmt.setString(4, c.getCountry());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<UserPanel> getAllChallengers() {

        ArrayList<UserPanel> c = new ArrayList<>();
        String query = "SELECT CID,FIRST,LAST,EMAILID,COUNTRY FROM Challengers";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                UserPanel p = new UserPanel();
                p.setPid(rs.getInt("CID"));
                p.setFirstName(rs.getString("FIRST"));
                p.setLastName(rs.getString("LAST"));
                p.setEmail(rs.getString("EMAILID"));
                p.setCountry(rs.getString("COUNTRY"));
                c.add(p);
            }
            rs.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    public static void deleteChallenger(UserPanel c) {
        String query = "DELETE from CHALLENGERS where CID = ?";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, c.getPid());
            stmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void editChallenger(UserPanel c) {
        String query = "UPDATE CHALLENGERS SET FIRST=?, LAST=?, EMAILID=?, COUNTRY=? WHERE CID=?";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, c.getFirstName());
            stmt.setString(2, c.getLastName());
            stmt.setString(3, c.getEmail());
            stmt.setString(4, c.getCountry());
            stmt.setInt(5, c.getPid());
            stmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<UserPanel> viewFoodLog() {
        ArrayList<UserPanel> l = new ArrayList<>();
        String query = "SELECT CHALLENGERID,INTAKEDATE,BRKFST,BQTY,LUNCH,LQTY,DINNER,DQTY,NOONSNACK,EVNGSNACK,COMMENTS FROM FOODLOG";
        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@0.0.0.0:1521:xe", "admin", "admin")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                UserPanel p = new UserPanel();
                p.setPid(rs.getInt("CHALLENGERID"));
                p.setFLD(rs.getString("INTAKEDATE"));
                p.setBrk(rs.getString("BRKFST"));
                p.setBq(rs.getString("BQTY"));
                p.setLun(rs.getString("LUNCH"));
                p.setLq(rs.getString("LQTY"));
                p.setDin(rs.getString("DINNER"));
                p.setDq(rs.getString("DQTY"));
                p.setNs(rs.getString("NOONSNACK"));
                p.setEs(rs.getString("EVNGSNACK"));
                p.setFC(rs.getString("COMMENTS"));
                l.add(p);
            }
            rs.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return l;
    }

    public static ArrayList<UserPanel> viewActivityLog() {
        ArrayList<UserPanel> l = new ArrayList<>();
        String query = "SELECT CID,ACTIVITYDATE,STEPS,ACTIVITY,ATIME,ATTENDEDSESSION,STIME,CALORIES,FEELING,COMMENTS FROM ACTIVITYLOG";
        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@0.0.0.0:1521:xe", "admin", "admin")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                UserPanel p = new UserPanel();
                p.setPid(rs.getInt("CID"));
                p.setALD(rs.getString("ACTIVITYDATE"));
                p.setStep(rs.getString("STEPS"));
                p.setA(rs.getString("ACTIVITY"));
                p.setAT(rs.getString("ATIME"));
                p.setS(rs.getString("ATTENDEDSESSION"));
                p.setST(rs.getString("STIME"));
                p.setCal(rs.getString("CALORIES"));
                p.setFeel(rs.getString("FEELING"));
                p.setAC(rs.getString("COMMENTS"));
                l.add(p);
            }
            rs.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return l;
    }

    public static ArrayList<UserPanel> viewUpdPDF() {
        ArrayList<UserPanel> l = new ArrayList<>();
        String query = "SELECT UPDATEDDATE,DESCRIPTION,DOCUMENT FROM UPLOADEDPDF where ROLE='Dietician'";
        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@0.0.0.0:1521:xe", "admin", "admin")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                UserPanel p = new UserPanel();
                p.setUpddt(rs.getString("UPDATEDDATE"));
                p.setDesc(rs.getString("DESCRIPTION"));
                p.setDoc(rs.getString("DOCUMENT"));
                l.add(p);
            }
            rs.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return l;
    }

    public static String getDocvalue(String sDesc) {
        String sDoc = "";
        String query = "SELECT DOCUMENT FROM UPLOADEDPDF WHERE DESCRIPTION=?";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, sDesc);
            UserPanel p = new UserPanel();
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p.setDoc(rs.getString("DOCUMENT"));
            }
            rs.close();
            conn.close();
            sDoc = p.getDoc();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sDoc;
    }

    public static ArrayList<UserPanel> viewwrkoutPDf() {
        ArrayList<UserPanel> l = new ArrayList<>();
        String query = "SELECT UPDATEDDATE,DESCRIPTION,DOCUMENT FROM UPLOADEDPDF WHERE ROLE='Trainer'";
        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@0.0.0.0:1521:xe", "admin", "admin")) {
            Statement stmt = conn.createStatement();
            //stmt.setString(1, "");
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                UserPanel p = new UserPanel();
                //p.setRole(rs.getString("ROLE"));
                p.setUpddt(rs.getString("UPDATEDDATE"));
                p.setDesc(rs.getString("DESCRIPTION"));
                p.setDoc(rs.getString("DOCUMENT"));
                l.add(p);
            }
            rs.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return l;
    }

    public static ArrayList<UserPanel> viewUpdVideo() {
        ArrayList<UserPanel> l = new ArrayList<>();
        String query = "SELECT DESCRIPTION,VIDEOPATH FROM UPLOADEDVIDEO";
        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@0.0.0.0:1521:xe", "admin", "admin")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                UserPanel p = new UserPanel();
                p.setDesc(rs.getString("DESCRIPTION"));
                p.setVideoPath(rs.getString("VIDEOPATH"));
                l.add(p);
            }
            rs.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return l;
    }

    public static String getVidURL(String sDesc) {
        String sUrl = "";
        String query = "SELECT VIDEOPATH FROM UPLOADEDVIDEO WHERE DESCRIPTION=?";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, sDesc);
            UserPanel p = new UserPanel();
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                p.setVideoPath(rs.getString("VIDEOPATH"));
            }
            rs.close();
            conn.close();
            sUrl = p.getVideoPath();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sUrl;
    }

}
