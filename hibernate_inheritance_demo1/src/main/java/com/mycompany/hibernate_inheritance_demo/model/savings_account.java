package com.mycompany.hibernate_inheritance_demo.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue(value="savings account")
public class savings_account extends account {
	
	
	public savings_account( String name, String account_number,int min_balance) {
		super(name,account_number);
		this.min_balance = min_balance;
	}

	private int min_balance;
	
	

}
