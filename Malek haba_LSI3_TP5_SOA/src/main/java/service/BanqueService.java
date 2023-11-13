package service;
import jakarta.jws.WebParam;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {
    List<Compte> comptes = new ArrayList<Compte>();
    @WebMethod
    public double conversion(@WebParam double mt){
        return  mt*3.3;
    }
    @WebMethod
    public Compte getCompte(@WebParam int code){
        return  new Compte(code, 0, new Date());
    }
    @WebMethod
    public List<Compte> getComptes(){
        Compte c1 = new Compte(0,500,new Date());
        Compte c2 = new Compte(1,500,new Date());
        comptes.add(c1);
        comptes.add(c2);
        return  comptes;
    }

}
