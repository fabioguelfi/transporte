package com.sompo.transporte.domains;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

// @Entity 
@Data
public class PrestadorContato implements Serializable {

  private static final long serialVersionUID = -5000458883570792708L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String telefone;

  private String celular;

  private String email;

  @OneToOne
  private Prestadores prestadores;

}
