package com.department.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DEPARTMENT")

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEPARTMENT_ID")
	private int departmentId;
	@Column(name = "DEPARTMENT_NAME")
	private String departmentName;
	@Column(name = "DEPARTMENT_TYPE")
	private String departmentType;
	@Column(name = "DEPARTMENT_ADDRESS")
	private String departmentAddress;
	@Column(name = "DEPARTMENT_CODE")
	private String departmentCode;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentType() {
		return departmentType;
	}

	public void setDepartmentType(String departmentType) {
		this.departmentType = departmentType;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentType="
				+ departmentType + ", departmentAddress=" + departmentAddress + ", departmentCode=" + departmentCode
				+ ", getDepartmentId()=" + getDepartmentId() + ", getDepartmentName()=" + getDepartmentName()
				+ ", getDepartmentType()=" + getDepartmentType() + ", getDepartmentAddress()=" + getDepartmentAddress()
				+ ", getDepartmentCode()=" + getDepartmentCode() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
