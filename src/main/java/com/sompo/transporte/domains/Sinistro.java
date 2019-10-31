package com.sompo.transporte.domains;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

// @Entity 
@Data
public class Sinistro implements Serializable {

  private static final long serialVersionUID = -6720740851009051983L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private BigInteger id;

  private BigInteger apolice;

  @ManyToOne
  @JoinColumn(name = "prestadorContato")
  private PrestadorContato prestadorContato;

  @OneToOne
  @JoinColumn(name = "registroContato")
  private RegistroContato registroContato;

  @OneToMany(mappedBy = "acionamento", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinColumn(name = "acionamento")
  private Acionamento acionamento;

  @OneToOne
  @JoinColumn(name = "segurado")
  private Segurado segurado;

  private String cpfCnpj;

  private String ramo;

  private LocalDateTime iniVigencia;

  private LocalDateTime fimVigencia;

  private String corretor;

  private String tipoApolice;

  private Boolean isEstipulacao;

  private BigInteger valor;
}
