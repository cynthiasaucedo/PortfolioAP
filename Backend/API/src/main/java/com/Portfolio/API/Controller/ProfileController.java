
package com.Portfolio.API.Controller;

import com.Portfolio.API.Model.Profile;
import com.Portfolio.API.Service.Impl.ProfileServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")

public class ProfileController {
    private final ProfileServiceImpl profileServiceImpl;
    
    public ProfileController(ProfileServiceImpl profileServiceImpl){
    this.profileServiceImpl = profileServiceImpl;
    }
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Profile> getProfile(@PathVariable Long id){
        Profile profile= profileServiceImpl.findById(id);
        return new ResponseEntity<>(profile, HttpStatus.OK);
    }
    
    @PutMapping("/edit")
    public ResponseEntity<Profile> editProfile(@RequestBody Profile profile){
        Profile editedProfile = profileServiceImpl.editProfile(profile);
        return new ResponseEntity<>(editedProfile, HttpStatus.OK);
    }
    
    
    
}
