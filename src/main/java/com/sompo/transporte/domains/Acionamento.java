package com.sompo.transporte.domains;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

// @Entity 
@Data
public class Acionamento implements Serializable {

  private static final long serialVersionUID = 8491632321963099472L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @OneToOne
  @JoinColumn(name = "prestador")
  private Prestadores prestador;

  private LocalDateTime dataAcionamento;

  private LocalDateTime hrAcionamento;

  private LocalDateTime dataPrevisaoChegada;

  private LocalDateTime horaPrevisaoChegada;

  private LocalDateTime dataChegadaPrestador;

  private LocalDateTime horaChegadaPrestador;

  private LocalDateTime dataTerminoAtendimentoLocal;

  @ManyToOne
  private Sinistro sinistro;

}
