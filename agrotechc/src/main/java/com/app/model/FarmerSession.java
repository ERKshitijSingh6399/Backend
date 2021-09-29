package com.app.model;

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
@Table(name="Farmersession")
@NoArgsConstructor
@AllArgsConstructor
public class FarmerSession {
@ManyToOne
@JoinColumn(name = "farmerId")
private Farmer farmersession;
private String lastLogout;
}
