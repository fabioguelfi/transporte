package com.sompo.transporte.domains;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.io.Serializable;

@Data
// @Entity
@NoArgsConstructor
public class Contato implements Serializable {

  private static final long serialVersionUID = 2016659355207046233L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  private String cpfCnpj;

  private String telefone;

  private String celular;

  private String email;

  @ManyToOne
  @Cascade({ CascadeType.SAVE_UPDATE })
  @JoinColumn(name = "tipoComunicante")
  private TipoComunicante tipoComunicante;

  public Contato(String nome, String cpfCnpj, String telefone, String celular, String email, Long codigoComunicante) {
    this.nome = nome;
    this.cpfCnpj = cpfCnpj;
    this.telefone = telefone;
    this.celular = celular;
    this.email = email;
    this.tipoComunicante = new TipoComunicante(codigoComunicante);
  }

}
