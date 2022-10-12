
package com.Portfolio.API.Model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name= "experience")
public class Experience implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;

    private String descExp;
    private String titleExp;
    private String startDateExp;
    private String endDateExp;
    private String phExp;

    // Constructores
    public Experience() {
    }

    public Experience(Long idExp, String descExp, String titleExp, String startDateExp, String endDateExp, String phExp) {
        this.idExp = idExp;
        this.descExp = descExp;
        this.titleExp = titleExp;
        this.startDateExp = startDateExp;
        this.endDateExp = endDateExp;
        this.phExp = phExp;
    }
}
