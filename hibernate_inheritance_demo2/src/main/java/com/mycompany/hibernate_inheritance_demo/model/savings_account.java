package com.mycompany.hibernate_inheritance_demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "saving_account")
@PrimaryKeyJoinColumn(name = "ID")
public class savings_account extends account {
	
	

	@Column(name = "MIN_BALANCE")
	private int min_balance;
	
	

}
