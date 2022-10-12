package com.Portfolio.API.Service.Interfaces;

import com.Portfolio.API.Exception.ProfileNotFoundException;
import com.Portfolio.API.Model.Profile;
import com.Portfolio.API.Repository.ProfileRepo;

import java.util.List;

public interface ProfileService {

    Profile addProfile(Profile profile);

    List<Profile> findProfile();

    Profile findById(Long id);

    Profile editProfile(Profile profile);

    void deleteProfile (Long id);
}
