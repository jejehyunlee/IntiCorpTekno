package com.inticorporateknologi.contactapp.service;


import com.inticorporateknologi.contactapp.entity.UserContact;
import com.inticorporateknologi.contactapp.repository.UserContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserContactSevice {


    private final UserContactRepository userContactRepository;

    public List<UserContact> getAllUserContacts() {
        return userContactRepository.findAll();
    }

    public UserContact getUserContactById(Long id) {
        return userContactRepository.findById(id).orElse(null);
    }

    public UserContact saveUserContact(UserContact userContact) {
        return userContactRepository.save(userContact);
    }

    public void deleteUserContact(Long id) {
        userContactRepository.deleteById(id);
    }


}
