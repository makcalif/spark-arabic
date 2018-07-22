package com.spark.arabic.sparkarabic.dynamodb.repo;


import com.spark.arabic.db.UserProfile;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
public interface UserProfileRepository extends
        CrudRepository<UserProfile, String> {

        Optional<UserProfile> findById(String email);
}
