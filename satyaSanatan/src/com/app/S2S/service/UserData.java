package com.app.S2S.service;

import java.util.List;

import com.app.S2S.beans.AddUserDocument;
import com.app.S2S.beans.ContactUs;
import com.app.S2S.beans.LoginDetails; 

public interface UserData {
	
	public void saveContact(ContactUs contact);
	public int login(LoginDetails l);
	public List<LoginDetails> loginId(LoginDetails l);
	public void saveDocument(AddUserDocument addDoc);

}
