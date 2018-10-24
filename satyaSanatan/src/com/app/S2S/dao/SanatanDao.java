package com.app.S2S.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.S2S.beans.ContactUs;
@Repository
public class SanatanDao implements SanatanDaoInteface {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveContact(ContactUs contact) {
		
sessionFactory.getCurrentSession().saveOrUpdate(contact);
		
	}
   
}
