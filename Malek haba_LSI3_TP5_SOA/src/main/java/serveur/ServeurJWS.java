package serveur;
//Cette ligne importe la classe Endpoint du package jakarta.xml.ws. La classe Endpoint est utilisée pour publier (exposer) un service web sur un emplacement spécifié.
import jakarta.xml.ws.Endpoint;
//Cette ligne importe la classe CalculatriceWS du package "service".
// La classe BanqueService est le service web que nous souhaitons publier. Elle contient les méthodes exposées via le service web.
import service.BanqueService;

public class ServeurJWS {
    public static void main(String[] args){
        // Cette ligne publie le service web en utilisant la classe Endpoint.
        // Elle spécifie l'URL où le service sera accessible (http://localhost:8084/) et l'instance de la classe CalculatriceWS qui implémente le service.
        Endpoint.publish("http://localhost:8084/",new BanqueService());
        // Cette ligne affiche l'URL du service web sur la console.
        System.out.println("http://localhost:8084/");
    }
}
