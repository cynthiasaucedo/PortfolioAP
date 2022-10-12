
package com.Portfolio.API.Service.Impl;

import com.Portfolio.API.Service.Interfaces.EducationService;
import com.Portfolio.API.Model.Education;
import com.Portfolio.API.Repository.EducationRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducationServiceImpl implements EducationService {
    @Autowired
    private final EducationRepo educationRepo;

    @Autowired
     public EducationServiceImpl(EducationRepo educationRepo) {
        this.educationRepo = educationRepo;
    }
    
    public Education addEdu(Education education){
        return educationRepo.save(education);
    }
    
    public List<Education> findEdu(){
        return educationRepo.findAll();
    }
    
    public Education editEdu(Education education){
        return educationRepo.save(education);
    }
    
    public void deleteEdu (Long id){
        educationRepo.deleteById(id);
    }
}
