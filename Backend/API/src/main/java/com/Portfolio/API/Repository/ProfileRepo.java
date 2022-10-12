
package com.Portfolio.API.Repository;

import com.Portfolio.API.Model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepo extends JpaRepository<Profile,Long>{
    
}
