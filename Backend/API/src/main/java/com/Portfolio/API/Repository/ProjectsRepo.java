
package com.Portfolio.API.Repository;

import com.Portfolio.API.Model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProjectsRepo extends JpaRepository<Projects,Long>{
    
}
