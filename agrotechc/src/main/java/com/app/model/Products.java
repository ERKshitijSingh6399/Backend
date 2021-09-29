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
@Table(name="products")
@NoArgsConstructor
@AllArgsConstructor
public class Products {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int productId;
private String productName;
private double productPrice;
private String quantity;
private String productCompanyName;
private String image;
@OneToMany(mappedBy = "productorder")
private List<Orders> orderList=new ArrayList<>();
@OneToMany(mappedBy = "productcart")
private List<Cart> cartList=new ArrayList<>();
}
