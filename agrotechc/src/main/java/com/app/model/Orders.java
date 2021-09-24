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
@Table(name="orders")
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
@Id
@GeneratedValue
private int ordersId;
private String ordersStatus;
@ManyToOne
@JoinColumn(name = "farmerId")
private Farmer farmerorder;
@ManyToOne
@JoinColumn(name = "productId")
private Products productorder;
}
