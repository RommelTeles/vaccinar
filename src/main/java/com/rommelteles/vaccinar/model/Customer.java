package com.rommelteles.vaccinar.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = false, of = {"id"})
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
	
	@NotNull
	@Column(name = "name")
	private String name; 
	
	@NotNull
	@Column(name = "address")
	private String address; 
	
	@NotNull
	@Column(name = "cpf")
	private String cpf;

	@Column(name = "email")
	private String email; 
	
	@NotNull
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
	@NotNull
	@Column(name = "birthDate")
	private LocalDate birthDate; 
	
	
}
