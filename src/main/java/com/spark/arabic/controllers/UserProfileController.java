package com.spark.arabic.controllers;

import com.spark.arabic.db.UserProfile;
import com.spark.arabic.sparkarabic.dynamodb.repo.ProductInfoRepository;
import com.spark.arabic.sparkarabic.dynamodb.repo.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/userprofile/{userEmail}")
public class UserProfileController {

    @Autowired
    UserProfileRepository userProfileRepository;

    @GetMapping
    public UserProfile get(@PathVariable  String userEmail) {
        //UserProfile userProfile = new UserProfile();
        Optional<UserProfile> userProfile = userProfileRepository.findById(userEmail);
        if (userProfile.isPresent()){
            return userProfile.get();
        }
        else {
            // TODO fix me
            return null;
        }
    }

    @PostMapping
    public UserProfile  create(@PathVariable String userEmail, @RequestBody UserProfile userProfile) {
        UserProfile userProfileCreated = userProfileRepository.save(userProfile);
        //return ResponseEntity.created(userProfileCreated);
        return userProfileCreated;
    }
}
