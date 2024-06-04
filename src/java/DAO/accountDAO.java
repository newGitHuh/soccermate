/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.accountDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class accountDAO {

    private static String accountCheck = "select * from account where username = ? and password = ?";
    private static String addUser = "insert into account values (?,?,?,?,?,?,?)";
    private static String getUserByEmail = "select * from account where email = ?";
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public accountDTO account(String user, String pass) {
        accountDTO account = null;
        try {
            Connection conn = DBContext.DBUtils.getConnection();
            ps = conn.prepareStatement(accountCheck);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                account = new accountDTO();
                account.setFullname(rs.getString("fullName"));
                account.setUsername(rs.getString("username"));
                account.setPassword(rs.getString("password"));
                account.setEmail(rs.getString("email"));
                account.setPhone(rs.getString("phone"));
                account.setRoleID(rs.getInt("roleID"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("" + e.getMessage());
        }

        return account;
    }

    public void addAccount(String fullname, String username, String password, String email, String phone, int roleID) {
        try {
            Connection conn = DBContext.DBUtils.getConnection();
            ps = conn.prepareStatement(addUser);
            ps.setString(1, null);
            ps.setString(2, fullname);
            ps.setString(3, username);
            ps.setString(4, password);
            ps.setString(5, email);
            ps.setString(6, phone);
            ps.setInt(7, roleID);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("" + e.getMessage());
        }
    }

    public accountDTO accountByEmail(String email) {
        accountDTO account = null;
        try {
            Connection conn = DBContext.DBUtils.getConnection();
            ps = conn.prepareStatement(getUserByEmail);
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                account = new accountDTO();
                account.setFullname(rs.getString("fullName"));
                account.setUsername(rs.getString("username"));
                account.setPassword(rs.getString("password"));
                account.setEmail(rs.getString("email"));
                account.setPhone(rs.getString("phone"));
                account.setRoleID(rs.getInt("roleID"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("" + e.getMessage());
        }

        return account;
    }

    public static void main(String[] args) {
        accountDAO dao = new accountDAO();
        accountDTO account = new accountDTO();
        account = dao.account("1", "2");
        System.out.println(account);
    }
}
