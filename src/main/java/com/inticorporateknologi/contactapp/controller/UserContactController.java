package com.inticorporateknologi.contactapp.controller;

import com.inticorporateknologi.contactapp.entity.UserContact;
import com.inticorporateknologi.contactapp.service.UserContactSevice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/userContacts")
public class UserContactController {

    private final UserContactSevice userContactService;

    @GetMapping
    public List<UserContact> getAllUserContacts() {
        return userContactService.getAllUserContacts();
    }

    @GetMapping("/{id}")
    public UserContact getUserContactById(@PathVariable Long id) {
        return userContactService.getUserContactById(id);
    }


    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )

    public UserContact createUserContact(@RequestBody UserContact userContact) {
        return userContactService.saveUserContact(userContact);
    }

    @PutMapping("/{id}")
    public UserContact updateUserContact(@PathVariable Long id, @RequestBody UserContact userContact) {
        userContact.setId(id);
        return userContactService.saveUserContact(userContact);
    }

    @DeleteMapping("/{id}")
    public void deleteUserContact(@PathVariable Long id) {
        userContactService.deleteUserContact(id);
    }


}
