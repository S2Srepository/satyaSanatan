package com.app.S2S.dao;

import java.util.List;

import com.app.S2S.beans.ContactUs;
import com.app.S2S.beans.LoginDetails;

public interface SanatanDaoInteface {
	
	public void saveContact(ContactUs contact);
	public int login(LoginDetails l);
	public List<LoginDetails> loginId(LoginDetails l);
}
