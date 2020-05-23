![POD](https://img.shields.io/badge/version-v1.0.0-blue.svg) ![POD](https://img.shields.io/badge/language-Scala-black.svg) ![POD](https://img.shields.io/badge/platform-Spark-red.svg) ![POD](https://img.shields.io/badge/Amazon-EMR-orange.svg) ![POD](https://img.shields.io/badge/license-MIT-lightgrey.svg) ![SBT compatible](https://img.shields.io/badge/SBT-compatible-4BC51D.svg?style=flat)

# Descrição
Considere uma senha sendo válida quando a mesma possuir as seguintes definições:
- Nove ou mais caracteres
- Ao menos 1 dígito
- Ao menos 1 letra minúscula
- Ao menos 1 letra maiúscula
- Ao menos 1 caractere especial
- Não possuir caracteres repetidos

Exemplo:
```
IsValid("") -> false
IsValid("aa") -> false
IsValid("ab") -> false
IsValid("AAAbbbCc") -> false
IsValid("AbTp9!foo") -> false
IsValid("AbTp9!fok") -> true
```

## Problema
Construa uma aplicação que exponha uma api web que valide se uma senha é válida.

Input: Uma senha (string).
Output: Um boolean indicando se a senha é válida.

Embora nossas aplicações sejam escritas em Kotlin e C# (.net core), você não precisa escrever sua solução usando elas. Use a linguagem de programação que considera ter mais conhecimento.

# Pontos que daremos maior atenção
Queremos que você escreva essa solução pensando que ao nos enviar ela estará "pronta para produção". Alguns itens que serão avaliados são:

- Testes de unidade / integração
- Abstração, acoplamento, extensibilidade e coesão
- Design de API
- Clean Code
- SOLID

# Para nos enviar a solução
Nos envie o link de um repo público com a sua solução.

O repo deve possuir um README com instruções básicas de como executá-la.

Explique no README as decisões técnicas do design da aplicação.


## Requisitos mínimos

Tecnologia | Versão
------- | --------
Java | 8
Scala | 2.11.x
Spark | 2.4.4
SBT | 1.2.8
Docker   | corrente


# Instruções de como testar a solução via Docker

```
$ docker pull jeffersonmf/backend-challenge:latest

$ docker run -t -d -p 9000:9000 backend-challenge

$ teste no browser a seguinte url:   http://localhost:9000/monitoring
Deve aparecer a mensagem:  Backend Challenge is up!!! e então siga com os testes....

```

# Instruções de como testar

```
Abra seu navegador e digite:

http://localhost:9000/validate/:password

onde :password pode ser asdf@X23

então ficaria:

http://localhost:9000/validate/asdf@X23

bom teste ;)
```


