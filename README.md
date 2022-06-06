# Mobembo-App
App de viagem interprovincial., rápido e seguro.

Projeto desenvolvido pelo os alunos da turma LCC2M  como prova PP2 da disciplina de Programação 4 com o Docente Mbuku Ditutala.

O Projeto conta com a participação dos seguintes membro 
*Tambu Masengui Jenny -- Fullstak Developer
*Eliane Contreira -- Front-end Developer
*Erica Capolo -- Front-end Developer
*Manuel Luiz Machado -- Database administrator. 

--------------------------------------- Ambiente de trabalho -----------------------------------------------------
O projeto pode rodar em qualquer IDE que suporta a linguagem java e o framework Spring. De preferência a usar o IDE Visual Studio Code (VScode).

Primeiro passo para executar o projeto no visual studio code .
- Instalar o Visual Studio. link: https://code.visualstudio.com/download
- Instalar o Java Jdk. link : https://www.oracle.com/java/technologies/downloads/
- Instalar o PostMan ou o Insomnia para o testes das APIs. 
    - Postman link: https://www.postman.com/downloads/
    - Insomnia link: https://insomnia.rest/download

E dentro do vcode instala as seguintes dependência: 
    - Extension Pack for Java
    - Maven for Java
    - Debugger for Java 
    - Project Manager for Java
    - Test Runner for Java
    - Java Language Support
    - Java Run
    - Spring Initializr Java support
    - Spring Boot Tools
    - Spring Boot Dashboard
    - Spring Boot Extension Pack
    - Portuguese (Brazil) Language Pack for Visual Studio Code

NOTA: As instalações das dependência exige muito uso de saldo de dados, preferência usar uma rede WI-Fi para as intalações destas.

--------------------------------------- Base de dados -----------------------------------------------------

Para o que o aplicativo possa rodar é importante ter o WAMP server  instalado no computador utilisado e o SGBD MySQL Workbench(de preferência).

    - WAMP (Windows Apach Myql PHP ) link : https://www.wampserver.com/en/download-wampserver-64bits/
    - MySQL WorckBench link : https://downloads.mysql.com/archives/workbench/


NOTA: Ao inicializar o projeto, o programa criara o banco de dados Mobembo e os campos automaticamente 
NOTA: Por falta dos DLL no windows pode acontecer erros na inicialização do WAMP server ou MySQL Worckbench. 

--------------------------------------- Rodar o Projeto no VsCode -----------------------------------------------------

Para rodar o projeto no vscode é necessário estar num ficheiro de instênção .java e clicar no botão Executar e Depurar ou fazer a seguinte combinação
Ctel+Shift+D.

--------------------------------------- Organização do projeto e regras -----------------------------------------------------
Temos 3 entidades nesse projeto que são
    - Usuário (User)
    - Administrador (Admin)
    - Sitema (System)

*As entidades ficam na pasta Model
*As APIs ficam na pasta Controler
*AS interfaces ficam n pasta Interfaces
*Os Enums ficam na pasta Enum

As classes serão no idioma inglesa ex: Usuário (user) e começaram com a letra maiuscula.
Da mesma com os metodos que começaram com a letra maiuscula mas a idioma será o portugues.

Usaremos a nomeclatura CamelCase. Exemplo:
    Temos um metodo privado que retorna viagens de um usuário. E na nossa classe o nosso metodo será declarado assim:
        private List<Travel> BuscarViagensUsuário()
    Uma variavel que vai receber o retorno desse metodo será declarado da seguinte forma:
        List<Travel> receberViagensUsuário; 






