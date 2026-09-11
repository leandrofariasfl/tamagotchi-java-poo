# 🐾 Tamagotchi - Projeto Acadêmico de POO

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Licença MIT](https://img.shields.io/badge/Licen%C3%A7a-MIT-green?style=for-the-badge)

## Sobre o Projeto

Este repositório contém a implementação de um simulador simples de **Tamagotchi (Bichinho Eletrônico)**, desenvolvido como atividade acadêmica para praticar e demonstrar os pilares da Orientação a Objetos (POO) em Java, como **Encapsulamento**, **Coesão** e **Responsabilidade Única**.

O sistema modela o estado do pet virtual (Nome, Fome, Saúde e Idade) e protege essas informações através de regras de negócio internas, impedindo estados inválidos (como fome negativa).

---

## Arquitetura e Modelagem

O projeto foi estruturado separando claramente o domínio da aplicação (regras do Tamagotchi) da camada de visualização/interação (classe Main).

```mermaid
classDiagram
    direction TB
    
    class Aplicacao {
        +main(String[] args)$
    }
    
    class Tamagotchi {
        - String nome
        - int fome
        - int saude
        - int idade
        + setNome(String nome) void
        + setFome(int fome) void
        + setSaude(int saude) void
        + setIdade(int idade) void
        + getNome() String
        + getFome() int
        + getSaude() int
        + getIdade() int
        + imprimir() void
    }
    
    Aplicacao ..> Tamagotchi : "Instancia e interage"