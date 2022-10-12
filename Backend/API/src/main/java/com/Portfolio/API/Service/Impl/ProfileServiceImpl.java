
package com.Portfolio.API.Service.Impl;

import com.Portfolio.API.Exception.ProfileNotFoundException;
import com.Portfolio.API.Model.Profile;
import java.util.List;

import com.Portfolio.API.Service.Interfaces.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Portfolio.API.Repository.ProfileRepo;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProfileServiceImpl implements ProfileService {

   private final ProfileRepo profileRepo;

   @Autowired 
    public ProfileServiceImpl(ProfileRepo profileRepo) {
        this.profileRepo = profileRepo;
    }

     public Profile addProfile(Profile profile){
        return profileRepo.save(profile);
    }
    
    public List<Profile> findProfile(){
        return profileRepo.findAll();
    }
    
    public Profile findById(Long id){
        return profileRepo.findById(id).orElseThrow(()-> new ProfileNotFoundException("profile not found"));
    }
    
    public Profile editProfile(Profile profile){
        return profileRepo.save(profile);
    }
    
    public void deleteProfile (Long id){
        profileRepo.deleteById(id);
    }
    
}
   

           
           
    