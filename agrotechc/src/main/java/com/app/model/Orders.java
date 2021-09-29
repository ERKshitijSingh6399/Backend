package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="orders")
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int ordersId;
private String ordersStatus;
@ManyToOne
@JoinColumn(name = "farmerId")
private Farmer farmerOrder;
@ManyToOne
@JoinColumn(name = "productId")
private Products productOrder;
}
