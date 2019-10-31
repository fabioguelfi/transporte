package com.sompo.transporte.domains;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

// @Entity 
@JsonRootName(value = "logradouroPrestador")
@Data
public class PrestadorEndereco implements Serializable {

  private static final long serialVersionUID = -3026512817788209802L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @JsonProperty(value = "logradouro")
  private String logradouro;

  @JsonProperty(value = "numero")
  private String numero;

  @JsonProperty(value = "bairro")
  private String bairro;

  @JsonProperty(value = "cidade")
  private String cidade;

  @JsonProperty(value = "uf")
  private String uf;

  @JsonProperty(value = "cep")
  private String cep;

  @JsonProperty(value = "longitude")
  private String longitude;

  @JsonProperty(value = "latitude")
  private String latitude;

  @OneToOne
  private Prestadores prestadores;
}
