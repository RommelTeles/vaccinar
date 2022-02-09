package com.rommelteles.vaccinar.model;

import java.io.Serializable;
import java.math.BigDecimal;

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
@EqualsAndHashCode(callSuper = false, of = { "id" })
@Entity
@Table(name = "vaccine")
public class Vaccine implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3875479384769822351L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Column(name = "name")
	private String name;

	@NotNull
	@Column(name = "price")
	private BigDecimal price;
	
	@NotNull
	@Column(name = "quantity")
	private Integer quantity; 

	@ManyToOne()
	@JoinColumn(name = "fk_supplier", nullable = false)
	private Supplier supplier;

}
