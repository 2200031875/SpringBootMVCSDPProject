package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.repository.AdminRepository;
import com.klef.jfsd.springboot.repository.CustomerRepository;
import com.klef.jfsd.springboot.repository.EmployeeRepository;

@Service
public class AdminServiceImpl implements AdminService
{
  @Autowired  //--communication b/w 2 managed beans or objects
  private EmployeeRepository employeeRepository;
  
  @Autowired
  private AdminRepository adminRepository;
  
  @Autowired
  private CustomerRepository customerRepository;

@Override
public List<Employee> ViewAllEmployees() 
{
	return employeeRepository.findAll();
}

@Override
public Admin checkadminlogin(String uname, String pwd) 
{
	return adminRepository.checkadminlogin(uname, pwd);
}

@Override
public String deleteemp(int eid) 
{
	 employeeRepository.deleteById(eid);
	 return "Employee Deleted Successfully";
}

@Override
public Employee displayempbyId(int eid)
{	
	return employeeRepository.findById(eid).get();
}

@Override
public long empcount() 
{
	return employeeRepository.count();
}

@Override
public String updateempstatus(String status, int eid) 
{
	employeeRepository.updateempstatus(status, eid);
	return "Employee Status Updated Successfully";
}

// CUSTOMER - 3
@Override
public String addcustomer(Customer c) 
{
	customerRepository.save(c);
	return "Customer Added Successfully ";
}
  

}