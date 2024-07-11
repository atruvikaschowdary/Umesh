package com.department.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.department.entity.Department;
import com.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
//@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	Logger log = LoggerFactory.getLogger(DepartmentController.class);

	@PostMapping("/departments/save")
	public Department saveDepartment(@RequestBody Department department) {
		try {
			departmentService.saveDepartment(department);
			log.info("save Department");
		} catch (Exception e) {
			log.error("", e);
			e.printStackTrace();
		}
		return department;
	}

	@GetMapping("/departments/{id}")
	public Department findDepartmentById(@PathVariable("id") int departmentId) {
		Department department = null;
		try {
			log.info("find Department By Id");
			department = departmentService.findDepartmentById(departmentId);
		} catch (Exception e) {
			log.error("", e);
			e.printStackTrace();
		}
		return department;
	}
}
