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
@Table(name="companies")
@NoArgsConstructor
@AllArgsConstructor
public class Companies {
@Id
@GeneratedValue
private int companyId;
private String companyName;
private String quantity;
@ManyToOne
@JoinColumn(name = "cropId") //here creates a foreign key named cropid
private Crops crop;
private double price;
}
