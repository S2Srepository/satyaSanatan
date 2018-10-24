package com.app.S2S.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class SanatanDao {
	@Autowired
	private SessionFactory sessionFactory;
   
}
