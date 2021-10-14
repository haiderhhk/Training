package com.contact_micro.service;

import java.util.List;

import com.contact_micro.entity.Contact;

public interface ContactService {

    public List<Contact> getContactsOfUser(Long userId);

}