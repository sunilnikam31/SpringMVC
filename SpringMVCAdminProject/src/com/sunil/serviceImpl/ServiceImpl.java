package com.sunil.serviceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunil.daoImpl.DaoImpl;
import com.sunil.model.Admin;
import com.sunil.model.Registration;
import com.sunil.serviceI.IService;

@Service
public class ServiceImpl implements IService{

	@Autowired
	DaoImpl dao;

	@Override
	public List<Registration> insertRegister(Registration r) {
		return dao.insertRegister(r);
	}

	@Override
	public Registration editRegister(int  rollno) {
		return dao.editRegister(rollno);
	}

	@Override
	public List<Registration> updateRegister(Registration r) {
		return dao.updateRegister(r);
	}

	@Override
	public List<Registration> deleteRegister(int rollno) {
		return dao.deleteRegister(rollno);
	}

	@Override
	public List<Registration> getData(Admin r) {
		return dao.getData(r);
	}

	@Override
	public List<Registration> getAllData() {
		return dao.getAllData();
	}
}
