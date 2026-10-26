# <img align="center" alt="Java" height="40" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg"> Práticas de POO em Java (Curso em Vídeo & Desafios) 

Repositório dedicado aos meus estudos e evolução na **Programação Orientada a Objetos (POO)** utilizando **Java**. Aqui encontro a aplicação prática dos pilares da POO, desde o básico de classes e atributos até herança em cadeia e interfaces.

---

## 📂 Estrutura do Projeto

O projeto está dividido em pacotes que abordam diferentes conceitos arquiteturais e lógicos:

* **`Assinatura_Streaming/`**
    * *Conceito:* Agregação e Regras de Negócio.
    * *Descrição:* Sistema simulando assinaturas de streaming conectando entidades como `Usuario`, `Plano` e `Assinatura`.
* **`Exercício_CursoemVideo09/`**
    * *Conceito:* Relacionamento de Agregação e Interfaces (`implements`).
    * *Descrição:* O clássico projeto de Livros e Leitores, utilizando a interface `Publicacao` para definir contratos de comportamento (`folhear`, `abrir`, `fechar`, etc.).
* **`Exercício_CursoemVídeo10/`**
    * *Conceito:* Herança (`extends`) e Superclasses.
    * *Descrição:* Hierarquia de classes envolvendo `Pessoa` (superclasse) e suas subclasses `Aluno`, `Professor` e `Funcionario`.
* **`Exercício_Veículos/`**
  * *Conceito:* Herança (`extends`), Construtores com `Super` e Validação de Estado.
  * *Descrição:* Sistema de gestão de frota contendo a superclasse `Veiculo` e as subclasses `Carro` e `Moto`, aplicando regras de negócio condicionadas ao estado de funcionamento (ligado/desligado).
* **`Gestão_Frota/`**
    * *Conceito:* Dupla Agregação e Validação de Nulos (`null`).
    * *Descrição:* Sistema de viagens que associa dinamicamente um `Motorista` e um `Carro` a uma classe de serviço `Viagem`.
* **`Sistema_Banco/`**
    * *Conceito:* Herança em Cadeia (Superclasse $\rightarrow$ Subclasse $\rightarrow$ Netas).
    * *Descrição:* Sistema bancário simulando `Conta` genérica, `ContaCorrente` (com taxa de manutenção) e `ContaEspecial` (com limite de cheque especial).

---

## 🛠️ Tecnologias Utilizadas
* **Java** (JDK atualizado)
* **IntelliJ IDEA** (Ambiente de desenvolvimento)
* **Git & GitHub** (Controle de versão)

---
*Desenvolvido como parte da jornada de aprendizado na linguagem `Java` em Ciência da Computação.*