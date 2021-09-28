package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="Users")
@NoArgsConstructor
@AllArgsConstructor
public class Admins {
@Id
@GeneratedValue
private int id;
private String adminId ; //email for farmer , alphanumeric id for admin
private String password;

public String getId() {
	return adminId;
}
public String getPassword() {
	return password;
}
}
