package com.app.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@GeneratedValue(strategy = GenerationType.AUTO)
private int companyId;
private String companyName;
private String companyImage;
private String cropName;
private double cropPrice;
private String contactNumber;
//@ManyToOne
//@JoinColumn(name = "cropId") //here creates a foreign key named cropid
//private Crops crop;
}
