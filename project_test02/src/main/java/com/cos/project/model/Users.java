package com.cos.project.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SequenceGenerator(
		name="USER_SEQ_GENERATOR"
		, sequenceName= "USER_SEQ"
		, initialValue= 1
		, allocationSize= 1
		)

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_SEQ_GENERATOR")
	private int num;
	
	@Column(nullable=false, length=30)
	private String userid;
	
	@Column(nullable=false, length=30)
	private String username;
	
	@Column(nullable=false, length=100)
	private String password;
	
	@Column(nullable=false, length=50)
	private String email;
	
	@Column(nullable=false, length=100)
	private String address;
	
	@Column(nullable=false, length=100)
	private String postnum;
	
	@Column(length=100)
	private String subaddress;
	
	@ColumnDefault("'user'")
	@Enumerated(EnumType.STRING)
	private RoleType roles;
	
	@CreationTimestamp
	private Timestamp createDate;

}

