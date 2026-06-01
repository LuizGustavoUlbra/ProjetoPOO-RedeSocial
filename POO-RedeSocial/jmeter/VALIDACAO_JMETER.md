# Validacao do JMeter

Arquivo do plano:

```bat
C:\Users\Luiz Gustavo\Downloads\ProjetoPOO-RedeSocial-main\POO-RedeSocial\jmeter\teste-postagem-jmeter.jmx
```

## Como abrir o .jmx

1. Abra o Apache JMeter.
2. Clique em File > Open.
3. Selecione o arquivo `teste-postagem-jmeter.jmx` dentro da pasta `jmeter` do projeto.

## Como executar

Com o plano aberto, clique no botao Start na barra superior do JMeter.

O plano executa:

```bat
cmd.exe /c call "C:\Users\Luiz Gustavo\Downloads\apache-maven-3.9.16-bin\apache-maven-3.9.16\bin\mvn.cmd" -Dtest=PostagemTest test
```

No `OS Process Sampler`, o comando esta configurado como `cmd.exe`.

Os argumentos foram deixados assim para o Windows interpretar corretamente o arquivo `.cmd` e o caminho com espaco no nome do usuario:

```text
/c
call
"C:\Users\Luiz Gustavo\Downloads\apache-maven-3.9.16-bin\apache-maven-3.9.16\bin\mvn.cmd"
-Dtest=PostagemTest
test
```

O diretorio de trabalho configurado e:

```bat
C:\Users\Luiz Gustavo\Downloads\ProjetoPOO-RedeSocial-main\POO-RedeSocial
```

## O que deve aparecer quando funcionar

No resultado da execucao, o Maven deve mostrar algo semelhante a:

```text
Tests run: 2
Failures: 0
Errors: 0
BUILD SUCCESS
```

## Onde visualizar BUILD SUCCESS

1. Clique em `View Results Tree`.
2. Selecione a amostra `OS Process Sampler`.
3. Abra a aba de resposta.
4. Procure por:

```text
BUILD SUCCESS
```

## Observacao sobre arquivos externos

Este plano nao grava resultados em arquivo externo.

O `View Results Tree` nao possui propriedade `filename` no arquivo `.jmx`, e os campos de saida do `OS Process Sampler` tambem nao possuem propriedades de arquivo. Isso evita que o JMeter interprete um campo vazio como a pasta base `bin`.

Validacao feita no arquivo `.jmx`:

```text
ResultCollectors=1
FilenameProps=0
SampleSaveConfigurationNodes=0
stdinNodes=0
stdoutNodes=0
stderrNodes=0
```

Se o erro `Could not delete existing file ...\apache-jmeter...\bin` continuar mesmo com esse arquivo, feche totalmente o JMeter e abra novamente o `.jmx`. Esse erro pode ficar associado a configuracoes antigas carregadas na interface. Tambem confira se nenhum campo `Filename` foi preenchido manualmente no `View Results Tree`.

O log `java.lang.NoClassDefFoundError: java/applet/Applet` indica outro problema: o JMeter esta sendo aberto com uma versao de Java incompatível com a biblioteca visual Darklaf. Para evitar esse erro de interface, abra o JMeter com Java 17 ou Java 11, em vez de uma versao mais nova que nao tenha `java.applet.Applet`.
