package com.rommelteles.vaccinar.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3342193965703778372L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column(name = "name")
	private String name; 
	
	@Column(name = "address")
	private String address; 
	
	@Column(name = "cpf")
	private String cpf;
	
	
	

	public Customer() {
	
	}
	

	public Customer(String name, String address, String cpf) {
		super();
		this.name = name;
		this.address = address;
		this.cpf = cpf;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	} 
	
	
	
	
	

}
