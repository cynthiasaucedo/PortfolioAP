
package com.Portfolio.API.Model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name= "education")
public class Education implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;

    private String descEdu;
    private String titleEdu;
    private String startDateEdu;
    private String endDateEdu;
    private String phEdu;


    // Constructores

    public Education() {
    }

    public Education(Long idEdu, String descEdu, String titleEdu, String startDateEdu, String endDateEdu, String phEdu) {
        this.idEdu = idEdu;
        this.descEdu = descEdu;
        this.titleEdu = titleEdu;
        this.startDateEdu = startDateEdu;
        this.endDateEdu = endDateEdu;
        this.phEdu = phEdu;
    }
}





