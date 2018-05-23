package com.skipthedishes.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table( name = "product" )
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Date creationDate;
	private Date updateDate;
	private BigDecimal realPrice;
	private BigDecimal percentageDiscount;
	private BigDecimal finalPrice;
	
	private static final BigDecimal ONE_HUNDRED = new BigDecimal(100);
	
	public Product() {
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

	@Column( name = "name", nullable = false )
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column( name = "creation_data", nullable = false )
	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Column( name = "update_date", nullable = false )
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	@Column( name = "real_price", nullable = true)
	public BigDecimal getRealPrice() {
		return realPrice;
	}

	public void setRealPrice(BigDecimal realPrice) {
		this.realPrice = realPrice;
	}

	@Column( name = "percentage_discount", nullable = true )
	public BigDecimal getPercentageDiscount() {
		return percentageDiscount;
	}

	public void setPercentageDiscount(BigDecimal percentageDiscount) {
		this.percentageDiscount = percentageDiscount;
	}

	@Transient
	public BigDecimal getFinalPrice() {
		return this.realPrice.multiply(percentageDiscount).divide(ONE_HUNDRED);
	}


	@PreUpdate
	public void preUpdate() {
		this.creationDate = new Date();
	}
	
	@PrePersist
	public void prePersist() {
		final Date current = new Date();
		this.creationDate = current;
		this.creationDate = current;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", creationDate=" + creationDate + ", updateDate=" + updateDate
				+ "]";
	}

	
	
}
