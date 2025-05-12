package com.registry.service;

import java.util.List;

import com.registry.model.Contact;

public interface ContactService {
    Contact saveContact(Contact contact);
    List<Contact> getRecentContacts(int limit);
    List<Contact> getAllContacts();
    Contact getContactById(Long id);
    Contact updateContact(Long id, Contact contact);
    void deleteContact(Long id);
}
