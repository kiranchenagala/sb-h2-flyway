package com.kk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_TEST")
public class TestModel {

	@Id
	@Column(name = "TEST_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name = "TEST_NAME")
	private String testame;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTestame() {
		return testame;
	}

	public void setTestame(String testame) {
		this.testame = testame;
	}
	
	
}
