package com.vaibhav.basiclogin.repository;

import com.vaibhav.basiclogin.Models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by kaushv5 on 6/27/2018.
 */
public interface UserRepository extends JpaRepository<AppUser,Long> {

    Optional<AppUser> findByuserName(String userName);
}
