
package com.Portfolio.API.Controller;

import com.Portfolio.API.Model.Education;
import com.Portfolio.API.Service.Impl.EducationServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/education")
public class EducationController {
    @Autowired
    private final EducationServiceImpl educationServiceImpl;

    public EducationController(EducationServiceImpl educationServiceImpl) {
        this.educationServiceImpl = educationServiceImpl;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Education>> getAllEducation(){
        List<Education> educations= educationServiceImpl.findEdu();
        return new ResponseEntity<>(educations, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Education> addEducation(@RequestBody Education education){
        Education newEducation= educationServiceImpl.addEdu(education);
        return new ResponseEntity<>(newEducation,HttpStatus.CREATED);
    }
    @PutMapping("/edit")
    public ResponseEntity<Education> editEducation(@RequestBody Education education){
        Education updateEducation= educationServiceImpl.editEdu(education);
        return new ResponseEntity<>(updateEducation,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducation(@PathVariable Long id){
        educationServiceImpl.deleteEdu(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
