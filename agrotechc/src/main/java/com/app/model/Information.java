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
@Table(name="information")
@NoArgsConstructor
@AllArgsConstructor
public class Information {
private String links;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String cropName;
private String cropContent;
private String cropImage;
private String link;
//private String summary;
//private String imageLink;
//private String videoLink;
//private String references;
}
