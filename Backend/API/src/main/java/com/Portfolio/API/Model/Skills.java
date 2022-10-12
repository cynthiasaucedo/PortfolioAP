
package com.Portfolio.API.Model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name= "skills")
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;

    private String titleSkill;
    private String phSkill;
    private int percent;

    // Constructores
    public Skills() {
    }

    public Skills(Long idSkill, String titleSkill, String phSkill, int percent) {
        this.idSkill = idSkill;
        this.titleSkill = titleSkill;
        this.phSkill = phSkill;
        this.percent = percent;
    }
}
