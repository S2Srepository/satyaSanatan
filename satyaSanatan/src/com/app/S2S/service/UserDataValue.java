package com.app.S2S.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.S2S.beans.ContactUs;
import com.app.S2S.dao.SanatanDao;

@Service
@Transactional
public class UserDataValue implements UserData {
@Autowired
SanatanDao dao;

@Override
public void saveContact(ContactUs contact){
	
	dao.saveContact(contact);
	
	
}
}
