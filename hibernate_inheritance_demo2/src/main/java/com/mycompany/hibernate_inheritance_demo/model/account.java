package com.mycompany.hibernate_inheritance_demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "account")
@Inheritance(strategy = InheritanceType.JOINED)
public class account {
	
	public account() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int ID;	
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "ACCOUNT_NO")
	private String account_number;

}
