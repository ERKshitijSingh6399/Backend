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
@GeneratedValue(strategy = GenerationType.AUTO)
private int productId;
private String productName;
private double productPrice;
private String productQuantity;
private String productCompanyName;
private String productImage;
@OneToMany(mappedBy = "productOrder")
private List<Orders> orderList=new ArrayList<>();
@OneToMany(mappedBy = "productCart")
private List<Cart> cartList=new ArrayList<>();
}
