package com.projeto.estoque.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //Cria todos os getters
@Setter //Cria todos os Setters
@AllArgsConstructor //Construtor com todos argumentos
@NoArgsConstructor //Gera construtor sem argumentos
@Entity //Define que a Classe é uma entidade/tabela
@Table(name = "products") //Define o nome da tabela criada.
public class Product {
    @Id//Indica que o atributo abaixo é um ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera valores automaticos para o ID.
    private long id;
    private String name;
    private String description;
    private double price;
    private int quantity;

}
