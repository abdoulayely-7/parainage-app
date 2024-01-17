package sn.dev.parainageapp.entities;

import sn.dev.parainageapp.DBConnection;

import java.sql.ResultSet;

public class UtilisateurImpl implements IUtilisateur{
    private DBConnection db = new DBConnection();

    @Override
    public Utilisateur SeConnecter(String login, String password) {
        Utilisateur u = null;
        String sql = "SELECT * FROM utilisateur WHERE login = ? AND password = ?";
        ResultSet rs = null ;
        try {
            db.initPrepar(sql);
            db.getPstm().setString(1,login);
            db.getPstm().setString(2,password);
            rs = db.executeSelect();
            if (rs.next())
            {
                 u = new Utilisateur();
                u.setIdU(rs.getInt("idU"));
                u.setNomUtilisateur(rs.getString("nomUtilisateur"));
                u.setPrenomUtilisateur(rs.getString("prenomUtilisateur"));
                u.setLogin(rs.getString("login"));
                u.setPassword(rs.getString("password"));
                u.setActived(rs.getInt("actived"));
                u.setProfil(rs.getInt("profil"));
            }
        }catch (Exception e ) {
        e.printStackTrace();
        }
        return u;
    }
}
