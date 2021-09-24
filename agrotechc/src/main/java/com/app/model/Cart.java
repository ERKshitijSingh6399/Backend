package com.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="cart")
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
@Id
@GeneratedValue
private int cartId;
@ManyToOne
@JoinColumn(name = "farmerId") //a foreign key by name farmerId
private Farmer farmercart;

@ManyToOne
@JoinColumn(name = "productId")
private Products productcart;
}
