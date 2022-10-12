package com.Portfolio.API.Service.Interfaces;

import com.Portfolio.API.Model.Education;

import java.util.List;

public interface EducationService {
    Education addEdu(Education education);

    List<Education> findEdu();

    Education editEdu(Education education);

    void deleteEdu (Long id);

}
