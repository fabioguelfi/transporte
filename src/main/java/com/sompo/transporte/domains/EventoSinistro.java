package com.sompo.transporte.domains;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "eventos")
// @Entity
public class EventoSinistro implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;

  private String codigo;

  private String descricao;

  @OneToMany(mappedBy = "causas", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinColumn(name = "causas")
  private List<Causa> causas;

}
