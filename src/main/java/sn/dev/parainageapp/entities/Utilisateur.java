package sn.dev.parainageapp.entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Utilisateur {
    private int idU;
    private String nomUtilisateur;
    private String prenomUtilisateur;
    private String login;
    private String password;
    private int actived;
    private int profil;
}
