package com.mycompany.hibernate_inheritance_demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.InheritanceType;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorColumn(name="accountType")
@DiscriminatorValue(value="normal account")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class account {
	
	public account() {
		
	}
	public account( String name, String account_number) {
		
		this.name = name;
		this.account_number = account_number;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	
	private String name;
	private String account_number;

}
