package com.sompo.transporte.domains;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

// @Entity 
@JsonRootName(value = "prestadores")
@Data
public class Prestadores implements Serializable {

  private static final long serialVersionUID = 1013772429385656937L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @JsonProperty(value = "codigoParceiroPrestador")
  private String codigo;

  @JsonProperty(value = "nomePrestador")
  private String nome;

  @JsonProperty(value = "identificacaoPrestador")
  private String identificador;

  @JsonProperty(value = "tipoIdentificacaoPrestador")
  @OneToOne
  private TipoPrestador tipoPrestador;

  @JsonProperty(value = "logradouroPrestador")
  @OneToMany(mappedBy = "prestadores", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<PrestadorEndereco> prestadorEndereco;

  @JsonProperty(value = "contatoPrestador")
  @OneToMany(mappedBy = "prestadores", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<PrestadorContato> prestadorContato;
}
