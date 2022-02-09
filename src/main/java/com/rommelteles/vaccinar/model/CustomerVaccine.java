package com.rommelteles.vaccinar.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name= "customer_vaccine")
public class CustomerVaccine implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5373828588756474936L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "fk_customer", nullable = false)
	private Customer customer; 
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "fk_vaccine", nullable = false)
	private Vaccine vaccine; 
	
	
    @Column(name = "date")
    private LocalDateTime date;
	
	

}
