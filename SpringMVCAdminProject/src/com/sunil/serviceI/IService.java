package com.sunil.serviceI;



import java.util.List;

import com.sunil.model.Admin;
import com.sunil.model.Registration;

public interface IService {
	
	public List<Registration> insertRegister(Registration r);
	public Registration editRegister(int rollno);
	public List<Registration> updateRegister(Registration r);
	public List<Registration> deleteRegister(int rollno);
	public List<Registration> getData(Admin r);
	public List<Registration> getAllData();

}
