package springboot.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;

/*

    This is the entity class
    It tells the JPA to create table with the instance variables in the class


 */
@Entity
public class Subject {

    //declaring instance variables
    @Id //this notifies the JPA the primary key for the database table
    private String id;
    private String subName;
    private String info;


    //no-arg constructor
    public Subject() {

    }

    //constructor to initialize instance variable
    public Subject(String id, String subName, String info) {
        this.id = id;
        this.subName = subName;
        this.info = info;
    }

    //getter and setters for subject class
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


}
