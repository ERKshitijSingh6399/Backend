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
@Table(name="queries")
@NoArgsConstructor
@AllArgsConstructor
public class Queries {
@Id
@GeneratedValue
private int queryId;
@ManyToOne
@JoinColumn(name = "farmerId")
private Farmer farmerquery;
private String dateQuery;
private String question;
private String answers;
}
