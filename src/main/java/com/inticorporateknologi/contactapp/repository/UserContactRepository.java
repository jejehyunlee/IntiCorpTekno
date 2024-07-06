package com.inticorporateknologi.contactapp.repository;

import com.inticorporateknologi.contactapp.entity.UserContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserContactRepository extends JpaRepository<UserContact, Long> {
}
