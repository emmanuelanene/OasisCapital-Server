package com.emmanuelanene.OasisCapital.repositories;

import com.emmanuelanene.OasisCapital.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
