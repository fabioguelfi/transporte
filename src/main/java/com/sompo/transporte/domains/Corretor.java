package com.sompo.transporte.domains;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
public class Corretor implements Serializable {

  private int codigo;
  private String nomeCorretor;
  private List<Contato> contato;

}
