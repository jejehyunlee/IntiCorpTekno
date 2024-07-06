package com.inticorporateknologi.contactapp.repository;

import com.inticorporateknologi.contactapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
