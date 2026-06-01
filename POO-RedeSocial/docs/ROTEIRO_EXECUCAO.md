# Roteiro de Execucao

Projeto: POO-RedeSocial

Diretorio do projeto:

```bat
C:\Users\Luiz Gustavo\Downloads\ProjetoPOO-RedeSocial-main\POO-RedeSocial
```

## Executar o sistema pelo VS Code

1. Abra o VS Code.
2. Clique em File > Open Folder.
3. Selecione a pasta:

```bat
C:\Users\Luiz Gustavo\Downloads\ProjetoPOO-RedeSocial-main\POO-RedeSocial
```

4. Abra o arquivo:

```bat
src\main\java\br\com\redesocial\view\Main.java
```

5. Clique em Run Java ou execute o metodo `main`.

Classe principal:

```text
br.com.redesocial.view.Main
```

## Executar o sistema pelo Maven

No terminal, entre na pasta do projeto:

```bat
cd "C:\Users\Luiz Gustavo\Downloads\ProjetoPOO-RedeSocial-main\POO-RedeSocial"
```

Execute:

```bat
mvn exec:java
```

Esse comando usa o `exec-maven-plugin` configurado no `pom.xml` para executar a classe `br.com.redesocial.view.Main`.

## Executar todos os testes

No terminal, dentro da pasta do projeto:

```bat
mvn test
```

## Executar apenas o PostagemTest

No terminal, dentro da pasta do projeto:

```bat
mvn -Dtest=PostagemTest test
```

Esse e o teste recomendado para demonstrar no JMeter, pois executa uma classe de teste especifica do JUnit 5.

## Configurar o JMeter para executar o PostagemTest

Estrutura no JMeter:

```text
Test Plan
└── Thread Group
    ├── OS Process Sampler
    └── View Results Tree
```

No `OS Process Sampler`, configure:

Command:

```bat
mvn.cmd
```

Working Directory:

```bat
C:\Users\Luiz Gustavo\Downloads\ProjetoPOO-RedeSocial-main\POO-RedeSocial
```

Arguments:

```text
-Dtest=PostagemTest
test
```

Depois execute o plano no JMeter e confira o resultado em `View Results Tree`.

## Alternativa se mvn.cmd nao funcionar

Se o JMeter mostrar erro informando que `mvn.cmd` nao foi encontrado, o Maven provavelmente nao esta no PATH do Windows.

Alternativas:

1. Instale/configure o Apache Maven no PATH do Windows e teste no Prompt de Comando:

```bat
mvn -version
```

2. Se o VS Code tiver Maven embutido por extensao, procure o caminho completo do `mvn.cmd` usado por ele e coloque esse caminho no campo `Command` do OS Process Sampler.

Exemplo de formato:

```bat
C:\caminho\para\apache-maven\bin\mvn.cmd
```

Nesse caso, mantenha o mesmo `Working Directory` e os mesmos `Arguments`.
