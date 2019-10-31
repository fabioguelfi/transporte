package com.sompo.transporte.domains;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Apolice implements Serializable {

  private static final long serialVersionUID = -6888710611269451922L;

  private Long numero;
  private Corretor corretor;
  private Boolean cotacao;
  private Integer ramo;
  private LocalDate inicioVigencia;
  private LocalDate finalVigencia;
  private LocalDate dataEmissao;
  private TipoApolice tipo;
  private boolean estipulacao;
  private BigDecimal reservaTotal;
  private Segurado segurado;
}
