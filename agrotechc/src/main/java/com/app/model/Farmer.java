package com.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name="farmer")//, indexes= {@Index(name="IDX_UNIQUE",columnList="landAddress", unique=true)})
@NoArgsConstructor
@AllArgsConstructor
public class Farmer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int farmerId;
private String password;
private String farmerName;
private long contactNumber;
private String address;
private int age;
private String landAddress;
private String email;
private String landSize;
private String gender;
@OneToMany(mappedBy = "farmerOrder")
private List<Orders> orderList=new ArrayList<>();
@OneToMany(mappedBy = "farmerCart")
private List<Cart> cartList=new ArrayList<>();
@OneToMany(mappedBy = "farmerQuery")
private List<Queries> queryList=new ArrayList<>();

public int getId() {
	return farmerId;
}
public String getEmail() {
	return email;
}
public String getPassword() {
	return password;
}
}
