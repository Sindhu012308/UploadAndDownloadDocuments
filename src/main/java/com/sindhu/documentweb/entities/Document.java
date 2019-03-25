package com.sindhu.documentweb.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Document {
	
	@Id
	private Long id;
	private String name;
	@Lob
	//@Lob is used to map the data data field as LARGE-OBJECT
	private byte[] data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

}
