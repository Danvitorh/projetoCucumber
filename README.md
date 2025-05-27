# Projeto de Automação Front-End com Selenium, Cucumber e JUnit

Este projeto é uma automação de testes front-end desenvolvida em Java, utilizando as ferramentas **Selenium WebDriver**, **Cucumber**, **JUnit** e com gerenciamento de dependências via **Maven (estrutura POM)**.

---

## 🧰 Tecnologias Utilizadas

- **Java 11+**
- **Maven (POM)**
- **Selenium WebDriver**
- **Cucumber**
- **JUnit 5**
- **WebDriverManager**
- **IDE recomendada: IntelliJ IDEA / Eclipse**

---

## 📁 Estrutura do Projeto

```

📦src
┣ 📂main
┃ ┗ 📂java
┃   ┗ 📂support         # Classes de suporte (WebDriverFactory, Config, etc.)
┣ 📂test
┃ ┣ 📂java
┃ ┃ ┣ 📂steps          # Definição dos passos do Cucumber
┃ ┃ ┣ 📂runners        # Classes Runner (JUnit + Cucumber)
┃ ┃ ┗ 📂pages          # Page Objects (mapeamento de elementos)
┃ ┗ 📂resources
┃   ┗ 📂features       # Arquivos .feature do Cucumber

````

---

⚙️ Como Executar o Projeto

### Pré-requisitos

- Java 11 ou superior instalado
- Maven instalado
- Git (opcional)
- Navegador Google Chrome ou Firefox instalado

### Passos para execução:

1. **Clone o repositório:**
```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
cd nome-do-repositorio
````

2. **Execute os testes com Maven:**

```bash
mvn clean test
```

> Isso irá iniciar os testes definidos nos arquivos `.feature`, utilizando os steps definidos em Java e o Selenium para controlar o navegador.

---

## 🧪 Cucumber + JUnit

Os testes são escritos em **Gherkin** (linguagem natural), e executados via JUnit. Exemplo de feature:

```gherkin
Funcionalidade: Login do usuário

  Cenário: Login com credenciais válidas
    Dado que o usuário esteja na página de login
    Quando o usuário preenche o login com "usuario_teste" e senha com "senha123"
    Então o sistema deve redirecionar para a tela inicial
```

---

## 📌 Boas Práticas Adotadas

* Padrão de projeto Page Object Model (POM)
* Separação clara entre camadas (steps, pages, runners)
* Testes legíveis usando Gherkin
* Reutilização de código
* Gerenciamento de dependências via Maven

---

