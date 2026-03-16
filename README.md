# 📦 OrderFlow API

OrderFlow API é uma **API REST desenvolvida em Java com Spring Boot** para gerenciamento de pedidos, usuários e produtos.  
O sistema permite realizar operações CRUD completas e organizar o fluxo de pedidos em uma aplicação de vendas ou gestão comercial.

O projeto foi desenvolvido seguindo uma **arquitetura em camadas**, facilitando manutenção, organização do código e escalabilidade da aplicação.

---

## 🚀 Funcionalidades

- 👤 Cadastro e gerenciamento de usuários
- 📦 Cadastro de produtos
- 🧾 Registro e consulta de pedidos
- 🔗 Relacionamento entre usuários e pedidos
- 🔍 Consulta de dados através de endpoints REST
- 🗄 Persistência de dados com JPA / Hibernate
- 🧪 Ambiente de testes com banco H2

---

## 🛠 Tecnologias utilizadas

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **H2 Database**
- **Maven**
- **Postman (para testes da API)**

---

## 🏗 Arquitetura do Projeto

O sistema segue uma estrutura organizada em camadas:
src
└── main
└── java
└── com.testepedidos.SistemaDePedidos
├── entities
├── repositories
├── services
└── resources


### 📌 Descrição das camadas

| Camada | Função |
|------|------|
| **Entities** | Representam as tabelas do banco de dados |
| **Repositories** | Responsáveis pelo acesso ao banco de dados |
| **Services** | Contêm as regras de negócio da aplicação |
| **Resources (Controllers)** | Exposição dos endpoints da API |

---

## 📡 Exemplos de Endpoints

### Usuários
GET /users
GET /users/{id}
POST /users
PUT /users/{id}
DELETE /users/{id}


### Pedidos
GET /orders
GET /orders/{id}


### Produtos
GET /products
POST /products


---

## 🧪 Banco de Dados

O projeto utiliza o **H2 Database em memória** para testes.

Console do banco:
http://localhost:8080/h2-console

---

## 📌 Objetivo do projeto

Este projeto foi desenvolvido com o objetivo de **praticar o desenvolvimento de APIs REST utilizando Spring Boot**, aplicando conceitos como:

- arquitetura em camadas
- JPA / ORM
- relacionamentos entre entidades
- criação de endpoints REST
- boas práticas de organização de código

---

## 👨‍💻 Autor

Desenvolvido por **Gabryel Duarte Pessanha**
Linkedin: www.linkedin.com/in/gabryel-duarte-847606199/?skipRedirect=true



---
<img width="1103" height="553" alt="image" src="https://github.com/user-attachments/assets/9cffb9c9-a522-4c2e-99e8-02b3b0377a7b" />

<img width="1148" height="689" alt="image" src="https://github.com/user-attachments/assets/5f2ca41d-8353-4d8d-a2ad-3d25d4319131" />

<img width="1107" height="658" alt="image" src="https://github.com/user-attachments/assets/2bbd8a5d-65c5-4735-b36c-6bd7cee79b56" />


