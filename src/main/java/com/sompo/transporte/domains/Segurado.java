package com.sompo.transporte.domains;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

// @Entity 
@Data
public class Segurado implements Serializable {

  private static final long serialVersionUID = -945733472582702360L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String cnpj;

  private String nome;
}
