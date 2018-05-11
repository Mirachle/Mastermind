package adatbazis;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * A {@code Mastermind} osztály reprezentálja az entityt a JPA részére.
 */
@Entity
@Table(name = "mastermind")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mastermind.findAll", query = "SELECT m FROM Mastermind m")
    , @NamedQuery(name = "Mastermind.findById", query = "SELECT m FROM Mastermind m WHERE m.id = :id")
    , @NamedQuery(name = "Mastermind.findByV\u00e9geredm\u00e9ny", query = "SELECT m FROM Mastermind m WHERE m.v\u00e9geredm\u00e9ny = :v\u00e9geredm\u00e9ny")})

public class Mastermind implements Serializable {

    /**
     * Az id-t tartalmazó változó.
     */
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    
    /**
     * A végeredményt tartalmazó sztring.
     */
    @Basic(optional = false)
    @Column(name = "V\u00e9geredm\u00e9ny")
    private String végeredmény;

    /**
     * Visszaad egy {@code id} értéket.
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Beállítja az id-t.
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *  Visszaadja a végeredményt.
     * @return vegeredmeny
     */
    public String getVégeredmény() {
        return végeredmény;
    }

    /**
     * Beállítja a végeredményt.
     * @param végeredmény 
     */
    public void setVégeredmény(String végeredmény) {
        this.végeredmény = végeredmény;
    }
}
