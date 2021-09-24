package com.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@GeneratedValue
private int cropId;
private String cropName;
@OneToMany(mappedBy = "crop")
private List<Companies> companyList=new ArrayList<>();
}
