package jaxbtest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author g_ric
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {

    @XmlAttribute
    private int id;
    private String name;
    private User createdBy;

    public Product() {
    }

    public Product(int id, String name, User createdBy) {
        this.id = id;
        this.name = name;
        this.createdBy = createdBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }
    
    

  
}
