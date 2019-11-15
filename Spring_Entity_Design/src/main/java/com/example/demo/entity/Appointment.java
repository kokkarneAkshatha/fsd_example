package com.example.demo.entity;

import java.sql.Blob;
import java.sql.Time;
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
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "date")
	private Date date;
	@Column(name = "slot")
	private Time slot;
	
	@Column(name = "isfeepaid")
	private boolean isfeepaid;
	
	
	
	@Column(name = "department")
	private String Department;
	
	@Column(name = "fee")
	private long fee;
	
	
	@Column(name = "photo")
	private Blob photo;
	

}