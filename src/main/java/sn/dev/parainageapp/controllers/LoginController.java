package sn.dev.parainageapp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sn.dev.parainageapp.DBConnection;
import sn.dev.parainageapp.entities.IUtilisateur;
import sn.dev.parainageapp.entities.Utilisateur;
import sn.dev.parainageapp.entities.UtilisateurImpl;

public class LoginController {
    private DBConnection db = new DBConnection();

    @FXML
    private Button btnConnexion;

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField txtMotDePasse;

    @FXML
    void onClickConnexion(ActionEvent event) {
        IUtilisateur iUtilisateur= new UtilisateurImpl();
        if (txtLogin.getText().trim().equals("") || txtMotDePasse.getText().trim().equals(""))
        {
            System.out.println("Tous les champs sont obligatoires");
        }
        else
        {
            try
            {
                Utilisateur u = iUtilisateur.SeConnecter(txtLogin.getText().trim(),txtMotDePasse.getText().trim());
                if (u != null)
                {
                    System.out.println("connexion en cours");
                }
                else
                {
                    System.out.println("Email et/ ou mot de passe incorrect");
                }
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

}
