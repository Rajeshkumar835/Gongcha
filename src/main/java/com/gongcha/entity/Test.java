package com.gongcha.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Test {

	@Id
	private Long id;

	private String name;

}
