
package com.Portfolio.API.Repository;

import com.Portfolio.API.Model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepo extends JpaRepository<Experience,Long>{
    
}
