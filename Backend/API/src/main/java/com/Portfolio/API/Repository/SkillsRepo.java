
package com.Portfolio.API.Repository;

import com.Portfolio.API.Model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SkillsRepo extends JpaRepository<Skills,Long>{
    
}
