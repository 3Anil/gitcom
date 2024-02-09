package com.task.service;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.Dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements IEmployeeService{

	@Override
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao=new EmployeeDaoImpl();

		dao.insertEmployee(bean);
		
	}
	
	

	@Override
	public void updateEmployee(EmployeeBean b1) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDaoImpl d1=new EmployeeDaoImpl();
		d1.updateEmployee(b1);
		
	}
	
	@Override
	public void selectEmployee(EmployeeBean b2) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDaoImpl d2=new EmployeeDaoImpl();
		d2 .selectEmployee(b2);
		
	}
	
	@Override
	public void deleteEmployee(EmployeeBean b3) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDaoImpl d3=new EmployeeDaoImpl();
		d3.deleteEmployee(b3);
		
	}
}

