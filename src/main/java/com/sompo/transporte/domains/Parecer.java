package com.sompo.transporte.domains;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.Data;

// @Entity 
@Data
public class Parecer implements Serializable {

  private static final long serialVersionUID = 1871542411408217993L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String descricao;

  private Boolean isVisaoCorretor;

  private LocalDateTime dtParecer;

  private LocalDateTime hrParecer;

  private String usuarioParecer;

  @JoinColumn(name = "classificacaoInformacao")
  private ClassificacaoInformacao classificacaoInformacao;
}
