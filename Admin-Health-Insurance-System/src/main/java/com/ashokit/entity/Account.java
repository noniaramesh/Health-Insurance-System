package com.ashokit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name = "Case_Worker_Account")
public class Account {

	@Id
	@GeneratedValue
	@Column(name = "ACCOUNT_ID")
	private Integer accountId;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "EMAIL_ID")
	private String emailId;

	@Column(name = "GENDER")
	private Character gender;

	@Column(name = "ROLE_ID")
	private String role;

	@Column(name = "DELETE_SW")
	private Character deleteSwitch;

	@Column(name = "ACC_STATUS")
	private Boolean accountStatus;
	
	@Column(name="TEMP_PASSWORD")
	private String tempPassword;

	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_DATE", updatable = false)
	private Date createdDate;

	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_DATE", insertable = false)
	private Date updatedDate;

}
