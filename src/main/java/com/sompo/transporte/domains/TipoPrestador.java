package com.sompo.transporte.domains;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

// @Entity 
@JsonRootName(value = "TipoPrestador")
@Data
public class TipoPrestador implements Serializable {

  private static final long serialVersionUID = -7673694799877254430L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @JsonProperty(value = "funcaoPrestador")
  private String funcao;

  @JsonProperty(value = "perfilPrestador")
  private String perfil;

  @JsonProperty(value = "prestadores")
  @OneToMany(mappedBy = "tipoPrestador", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<Prestadores> prestadores;
}
