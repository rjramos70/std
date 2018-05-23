package com.skipthedishes.api.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.skipthedishes.api.enums.StatusEnum;

@Entity
@Table( name = "order")
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Person owner;
	private StatusEnum status;
	private List<Product> products;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// Many Orders could belows to One Person
	@ManyToOne( fetch = FetchType.EAGER )
	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	@Enumerated(EnumType.STRING)
	@Column( name = "status", nullable = false )
	public StatusEnum getStatus() {
		return status;
	}
	
	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	
	// One Order could have many Products
	@OneToMany( mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", owner=" + owner + ", status=" + status + ", products=" + products + "]";
	}
	
	

	
}
