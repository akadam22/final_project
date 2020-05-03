package springboot.courses;

import springboot.Topic.Subject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/*

    This is the entity class
    It tells the JPA to create table with the instance variables in the class


 */
@Entity
public class Module {

    //declaring instance variables
    @Id //this notifies the JPA the primary key for the database table
    private String id;
    private String subName;
    private String info;

    @ManyToOne
    private Subject subject;

    //no-arg constructor
    public Module() {
        //why ?
    }

    //constructor to initialize instance variable
    public Module(String id, String subName, String info,String subjectId) {
        this.id = id;
        this.subName = subName;
        this.info = info;
        this.subject = new Subject(subjectId , "",""); // just to make it easy while initialising
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

    public Subject getSub() {
        return subject;
    }

    public void setSub(Subject subject) {
        this.subject = subject;
    }
}
