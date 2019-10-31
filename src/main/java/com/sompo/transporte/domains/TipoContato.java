package com.sompo.transporte.domains;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
// @Entity
@NoArgsConstructor
public class TipoContato {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String descricao;

  public TipoContato(Long codigoContato) {
    this.id = codigoContato;
  }

}
