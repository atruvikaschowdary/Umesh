package com.department.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.entity.Department;
import com.department.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	Logger log=LoggerFactory.getLogger(DepartmentService.class);
	
	public Department saveDepartment(Department department) {
		try {
		departmentRepository.save(department);
		}catch(Exception e) {
			log.error("", e);
			e.printStackTrace();
		}
		return department;
	}

	public Department findDepartmentById(int departmentId) {
		// TODO Auto-generated method stub
		Department department=null;
		try {
			
			department=departmentRepository.findByDepartmentId(departmentId);
		}catch(Exception e) {
			log.error("", e);
			e.printStackTrace();
		}
		return department;
	}
}
