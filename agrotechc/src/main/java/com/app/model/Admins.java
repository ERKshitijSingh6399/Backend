package com.app.model;

import javax.persistence.Entity;
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
private String id ; //email fro farmer , alphanumeric id for admin
private String password;

public String getId() {
	return id;
}
public String getPassword() {
	return password;
}
}
