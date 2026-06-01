# README JMeter

Este arquivo explica como executar o `PostagemTest` pelo Apache JMeter usando o arquivo:

```bat
jmeter\teste-postagem-jmeter.jmx
```

## 1. Como abrir o JMeter

Abra a pasta onde o Apache JMeter foi instalado e execute:

```bat
bin\jmeter.bat
```

Se preferir, abra pelo Prompt de Comando ou PowerShell entrando na pasta do JMeter e executando:

```bat
.\bin\jmeter.bat
```

## 2. Como abrir o arquivo teste-postagem-jmeter.jmx

Com o JMeter aberto:

1. Clique em File.
2. Clique em Open.
3. Selecione o arquivo:

```bat
C:\Users\Luiz Gustavo\Downloads\ProjetoPOO-RedeSocial-main\POO-RedeSocial\jmeter\teste-postagem-jmeter.jmx
```

## 3. Como executar o teste

Depois de abrir o arquivo `.jmx`, clique no botao Start, que fica na barra superior do JMeter.

O JMeter vai executar o `OS Process Sampler`, que chama o Maven neste caminho:

```bat
C:\Users\Luiz Gustavo\Downloads\apache-maven-3.9.16-bin\apache-maven-3.9.16\bin\mvn.cmd
```

O comando executado equivale a:

```bat
mvn -Dtest=PostagemTest test
```

## 4. Onde verificar o resultado

No JMeter, clique em:

```text
View Results Tree
```

Depois selecione a execucao do `OS Process Sampler`.

Na aba de resposta, verifique se aparece:

```text
BUILD SUCCESS
```

## 5. O que significa BUILD SUCCESS

`BUILD SUCCESS` significa que o Maven executou o ciclo de testes com sucesso.

Neste caso, significa que o `PostagemTest` foi executado sem falhas.

## 6. Fala curta para apresentar ao professor

“Para atender ao requisito da apresentação, utilizamos o JMeter com OS Process Sampler para executar uma classe de teste JUnit do projeto. O teste escolhido foi o PostagemTest, executado pelo Maven. O resultado BUILD SUCCESS confirma que o teste foi executado sem falhas.”
