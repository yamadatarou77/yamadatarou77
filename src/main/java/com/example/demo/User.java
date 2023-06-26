package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "userInfo")

public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String address;
	
	@Column
	private String tel;
}
