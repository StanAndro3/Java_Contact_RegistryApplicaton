package com.registry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registry.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
