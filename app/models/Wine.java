package models;

import play.db.jpa.Model;

import javax.persistence.Entity;


@Entity
public class Wine extends Model {

  public String name;

  public String grapes;

  public String country;

  public String region;
    
  public String year;
    
  public String picture;

  public String description;

}
