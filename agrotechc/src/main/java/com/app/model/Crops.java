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
@Table(name="crops")
@NoArgsConstructor
@AllArgsConstructor
public class Crops {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int cropId;
private String cropName;
//@OneToMany(mappedBy = "crop")
//private List<Companies> companyList=new ArrayList<>();
}
