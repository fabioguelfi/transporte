package com.sompo.transporte.domains;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

// @Entity 
@Data
public class ClassificacaoInformacao implements Serializable {

  private static final long serialVersionUID = 2216730666688194778L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String descricao;

  @OneToOne
  @JoinColumn(name = "parecer")
  private Parecer parecer;

}
