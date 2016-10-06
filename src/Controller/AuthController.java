package Controller;

import java.lang.Boolean;
import Model.ClientBanque;
/**
 * Created by pcthomas on 06/10/2016.
 */
public class AuthController {

    private Boolean estClient;
    private ClientBanque clientBanque;

    public AuthController(ClientBanque clientBanque){
        estClient = false;
        this.clientBanque = clientBanque;
    }

    public AuthController(){}

    // permet de se connecter à l'appplication
    public boolean Authentification(String prenom, String nom){
        // renvoi vers le model ClientBanque
        estClient = clientBanque.Connexion();



        return estClient;
    }


}
