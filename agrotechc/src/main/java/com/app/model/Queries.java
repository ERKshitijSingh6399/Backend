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
@Table(name="queries")
@NoArgsConstructor
@AllArgsConstructor
public class Queries {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int queryId;
@ManyToOne
@JoinColumn(name = "farmerId")
private Farmer farmerQuery;
private String dateQuery;
private String question;
private String answer;
private String status;
}
