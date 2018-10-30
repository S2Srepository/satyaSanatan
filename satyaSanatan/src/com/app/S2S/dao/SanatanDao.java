package com.app.S2S.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.app.S2S.beans.LoginDetails;
import com.app.S2S.beans.ContactUs;
@Repository
public class SanatanDao implements SanatanDaoInteface {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveContact(ContactUs contact) {
		
sessionFactory.getCurrentSession().saveOrUpdate(contact);
		
	}
	@Override
	public int login(LoginDetails l) {

		int count = ((Long) sessionFactory.getCurrentSession()
				.createQuery("select count(*) from LoginDetails1 where password='" + l.getPassword()
						+ "' and username='" + l.getUsername() + "'  ")
				.uniqueResult()).intValue();
		return count;
	}
	@Override
	public List<LoginDetails> loginId(LoginDetails l) {
		Query query = sessionFactory.getCurrentSession()
				.createQuery("from LoginDetails where password=:pass and username=:user");
		query.setParameter("user", l.getUsername());
		query.setParameter("pass", l.getPassword());
		List<LoginDetails> list = ((org.hibernate.query.Query) query).list();
		return list;
	}

   
}
