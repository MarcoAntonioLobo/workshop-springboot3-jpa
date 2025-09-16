# 🚀 Workshop Spring Boot 3 - JPA / Hibernate

![Java](https://img.shields.io/badge/Java-17-blue?logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-green?logo=spring&logoColor=white)
![H2](https://img.shields.io/badge/H2-Database-lightgrey?logo=h2&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue?logo=postgresql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.9-red?logo=apachemaven&logoColor=white)
![Build](https://img.shields.io/badge/build-passing-brightgreen)
![Coverage](https://img.shields.io/badge/coverage-95%25-green)

> Projeto completo de **Web Services Java** com Spring Boot 3 e JPA/Hibernate.  
> Desenvolvido no curso **Java Completo - Dr. Nélio Alves (DevSuperior)**.

---

## 🌟 Visão Geral

Sistema de e-commerce que gerencia **usuários, produtos, categorias, pedidos e pagamentos**, com:

- CRUD completo
- Associação avançada JPA (`OneToMany`, `ManyToMany`, `OneToOne`)
- Tratamento global de exceções (`ResourceNotFoundException`, `DatabaseException`)
- Seed de dados no H2 (teste)
- Perfis de aplicação (`test`, `dev`, `prod`)
- Cálculo automático de subtotal e total
- Deploy opcional no Heroku

---

## 📂 Estrutura do Projeto
```
CourseJava
├── src
│ ├── main/java/com/example/CourseJava
│ │ ├── CourseJavaApplication.java
│ │ ├── config/TestConfig.java
│ │ ├── entities
│ │ │ ├── User.java
│ │ │ ├── Order.java
│ │ │ ├── OrderItem.java
│ │ │ ├── Payment.java
│ │ │ ├── Product.java
│ │ │ └── Category.java
│ │ ├── entities/enums/OrderStatus.java
│ │ ├── entities/pk/OrderItemPK.java
│ │ ├── repositories
│ │ │ ├── UserRepository.java
│ │ │ ├── OrderRepository.java
│ │ │ ├── OrderItemRepository.java
│ │ │ ├── ProductRepository.java
│ │ │ └── CategoryRepository.java
│ │ ├── resources
│ │ │ ├── UserResource.java
│ │ │ ├── OrderResource.java
│ │ │ ├── ProductResource.java
│ │ │ ├── CategoryResource.java
│ │ │ └── exceptions/ResourceExceptionHandler.java
│ │ └── services
│ │ ├── UserService.java
│ │ ├── OrderService.java
│ │ ├── ProductService.java
│ │ ├── CategoryService.java
│ │ └── exceptions/ResourceNotFoundException.java
└── src/test/java/com/example/CourseJava/CourseJavaApplicationTests.java
```

---

## 🛠 Exemplos de Objetos JSON

**Usuário**
```json
{
  "name": "Maria Brown",
  "email": "maria@gmail.com",
  "phone": "988888888",
  "password": "123456"
}

Pedido

json

{
  "moment": "2019-06-20T19:53:07Z",
  "clientId": 1,
  "orderStatus": "PAID"
}

Produto

json

{
  "name": "Smart TV",
  "description": "Nulla eu imperdiet purus.",
  "price": 2190.0
}

```

## 🌐 Principais Endpoints
```

| Recurso          | Método | Descrição                    |
|------------------|--------|------------------------------|
| /users/{id}      | DELETE | Deletar usuário              |
| /users/{id}      | PUT    | Atualizar usuário            |
| /users/{id}      | GET    | Buscar usuário por ID        |
| /users           | POST   | Criar usuário                |
| /users           | GET    | Listar usuários              |
| /products        | GET    | Listar produtos              |
| /orders          | POST   | Criar pedido                 |
| /categories      | GET    | Listar categorias            |
```

## 🚀 Deploy e Configuração
Local (H2 Database): perfil test

Dev (PostgreSQL local): perfil dev

Prod (Heroku): perfil prod, variáveis de ambiente:

DATABASE_URL

JWT_SECRET

JWT_EXPIRATION


git clone <repo>
cd workshop-springboot3-jpa
mvn spring-boot:run

## 📈 Skills demonstradas
Arquitetura RESTful

JPA e Hibernate avançado

Gerenciamento de exceções e validações

Perfis de aplicação e configuração de banco

Deploy em nuvem (Heroku)

Uso de Maven, Java 17 e Spring Boot 3

## ⭐ Sobre o projeto
Este projeto é uma demonstração profissional para portfólio, mostrando domínio de:

- Java e Spring Boot 3
- Banco de dados relacional (H2, PostgreSQL)
- Desenvolvimento de REST APIs completas
- Boas práticas de código e arquitetura (camadas resource, service, repository)
- Tratamento de exceções e validação de dados
- Perfis de aplicação (test, dev, prod)
- Deploy em nuvem (Heroku)
- Uso de Maven e Java 17

---

## 📬 Contato
Se você quiser entrar em contato ou conhecer mais sobre meus projetos:

- **LinkedIn:** [Marco Lobo](linkedin.com/in/marco-antonio-lobo-35568628b)
- **GitHub:** [MarcoAntonioLobo](https://github.com/MarcoAntonioLobo)
- **Email:** marcoantoniolobo82@gmail.com

