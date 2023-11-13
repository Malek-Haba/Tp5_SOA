package metier;
import java.util.Date;
import jakarta.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private float solde;
    @XmlTransient
    private Date dateCreation;
    public Compte(){

    }
    public Compte(int code, float solde, Date dateCreation){
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }
    public int getCode(){
        return this.code;
    }
    public void setCode(int code){
        this.code = code;
    }
    public float getSolde(){
        return  this.solde;
    }
    public void setSolde(float solde){
        this.solde = solde;
    }
    public Date getDateCreation(){
        return  this.dateCreation;
    }
    public void setDateCreation(Date dateCreation){
        this.dateCreation = dateCreation;
    }
}
