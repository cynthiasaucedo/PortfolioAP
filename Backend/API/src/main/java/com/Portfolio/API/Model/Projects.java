
package com.Portfolio.API.Model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name= "projects")
public class Projects implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPro;

    private String descPro;
    private String titlePro;
    private String startDatePro;
    private String endDatePro;
    private String phPro;

    // Constructores
    public Projects() {
    }

    public Projects(Long idPro, String descPro, String titlePro, String startDatePro, String endDatePro, String phPro) {
        this.idPro = idPro;
        this.descPro = descPro;
        this.titlePro = titlePro;
        this.startDatePro = startDatePro;
        this.endDatePro = endDatePro;
        this.phPro = phPro;
    }
}
