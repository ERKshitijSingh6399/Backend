package com.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
@GeneratedValue
private int id;
private String link;
//private String summary;
//private String imageLink;
//private String videoLink;
//private String references;
}
