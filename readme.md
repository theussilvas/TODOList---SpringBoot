
# TODO List

Api para gerenciar tarefas (CRUD) usando SpringBoot

## Pré-requisitos

Certifique-se de ter os seguintes itens instalados na sua máquina antes de iniciar:

- **Java JDK 17** ou superior ([Download do JDK](https://www.oracle.com/java/technologies/javase-downloads.html))
- **Maven 3.8+** ([Download do Maven](https://maven.apache.org/download.cgi))
- **MySQL** ou outro banco de dados compatível, se necessário ([Download do MySQL](https://www.mysql.com/))
- **Git** para clonar o repositório ([Download do Git](https://git-scm.com/))

## Como executar o projeto

### 1. Clone o repositório

`git clone` https://github.com/theussilvas/TODOList---SpringBoot.git

`cd` pasta onde foi clonado

### 2. Configure o banco de dados

 1. Crie um banco de dados chamado `todolist`
 2. Atualize as configurações no `application.properties`

```Properties
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

### 3. Compile o proejto

Abra um terminal no diretório e digite:

`mvn clean install`

### 4. Execute a aplicação

`mvn spring-boot:run`

## Testes

Abra um terminal no diretório(com a aplicação já compilada) e digite:

`mvn test`

## Documentação da API

Este projeto utiliza o SpringDoc OpenAPI para documentar a API.
Acesse a documentação no seguinte endereço (quando a aplicação estiver em execução):

http://localhost:8080/swagger-ui.html

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/)
- [MySQL](https://www.mysql.com/)
- [Spring WebFlux](https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html) (Testes)
- [Banco H2](https://www.h2database.com/html/main.html) (Testes)

## Práticas adotadas

- API REST
- Injeção de dependências
- Geração automática do Swagger
