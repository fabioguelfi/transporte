package com.sompo.transporte.domains;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
// @Entity
@NoArgsConstructor
public class RegistroContato implements Serializable {

  private static final long serialVersionUID = 4185837884932320803L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @Cascade({ CascadeType.ALL })
  @JoinColumn(name = "contato")
  private Contato contato;

  private LocalDateTime dataRegistro;

  @ManyToOne
  @Cascade({ CascadeType.SAVE_UPDATE })
  @JoinColumn(name = "tipoContato")
  private TipoContato tipoContato;

  public RegistroContato(Contato contato, String dataRegistro, Long codigoTipoContato) {

    this.contato = contato;
    this.dataRegistro = LocalDateTime.parse(dataRegistro, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    this.tipoContato = new TipoContato(codigoTipoContato);

  }
}
