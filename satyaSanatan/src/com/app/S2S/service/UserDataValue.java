package com.app.S2S.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.S2S.dao.SanatanDao;

@Service
@Transactional
public class UserDataValue {
@Autowired
SanatanDao dao;
}
