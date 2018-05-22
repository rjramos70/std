package com.skipthedishes.api.entities;

import java.io.Serializable;
import java.util.Date;

@Entity

public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Date creationDate;
	private Date updateDate;
	
	
	

}
