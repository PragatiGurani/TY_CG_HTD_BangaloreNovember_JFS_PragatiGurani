package com.capgemini.jpawithhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_info")

public class Product
{
	@Id
	@Column
	private int pid;
	@Column
	private String name;
	public final int getPid() {
		return pid;
	}
	public final void setPid(int pid) {
		this.pid = pid;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
}
