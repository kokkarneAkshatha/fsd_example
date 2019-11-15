package com.example.demo.entity;

import java.sql.Blob;
import java.util.Date;

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

@Data
@Entity
@Table(name = "doctorregistration")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DoctorRegistration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctor_id;
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	
	
	@Column(name = "department")
	private String Department;
	
	@Column(name = "fee")
	private long fee;
	
	
	@Column(name = "photo")
	private Blob photo;
	

}