package com.sompo.transporte.domains;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
// @Entity
public class Evento implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;

  private LocalDate dataOcorrencia;

  private LocalTime horaOcorrencia;

  @OneToOne
  @JoinColumn(name = "tipoEvento")
  private TipoEvento tipoEvento;

  @OneToOne
  @JoinColumn(name = "eventoSinistro")
  private EventoSinistro eventoSinistro;

}
