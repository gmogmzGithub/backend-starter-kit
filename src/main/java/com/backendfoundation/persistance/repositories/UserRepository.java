package com.backendfoundation.persistance.repositories;

import com.backendfoundation.persistance.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
