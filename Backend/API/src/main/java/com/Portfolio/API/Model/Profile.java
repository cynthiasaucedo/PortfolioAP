
package com.Portfolio.API.Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name= "profile")
public class Profile implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String surname;
    private String aboutMe;
    private String title;
    private String phProfile;

    // Constructores
    public Profile() {
    }

    public Profile(Long id, String name, String surname, String aboutMe, String title, String phProfile) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.aboutMe = aboutMe;
        this.title = title;
        this.phProfile = phProfile;
    }



    //@OneToMany(fetch = FetchType.LAZY, mappedBy="idEdu")
 // private List<Education> educationList;
   // @OneToMany(fetch = FetchType.LAZY, mappedBy="idExp")
  //private List<Experience> experienceList;
    //@OneToMany(fetch = FetchType.LAZY, mappedBy="idSkill")
 // private List<Skills> SkillsList;
    //@OneToMany(fetch = FetchType.LAZY, mappedBy="idPro")
  //private List<Projects> ProjectsList;


}
