# hexagonal-architecture-studying

Este projeto estuda a arquitetura hexagonal e mostra como organizar as camadas e portas em uma aplicação Java.

## Visão geral

A arquitetura hexagonal separa o core da aplicação (regras de negócio) de suas dependências externas usando portas e adaptadores.

- **Core da aplicação**: contém as regras de negócio e o domínio.
- **Portas de entrada (Input Ports)**: definem como o mundo externo pode acionar o core.
- **Portas de saída (Output Ports)**: definem como o core consome serviços externos.
- **Adaptadores**: implementam as portas para conectar o core a APIs, bancos de dados, filas etc.

## Estrutura do projeto

### Application

Contém o core da aplicação.

- `core-domain`: classes de domínio.
- `core-usecase`: regras de negócio.

### Ports

Contém as interfaces das portas.

- `in`: interfaces das portas de entrada para o core.
- `out`: interfaces das portas de saída para outras aplicações.

### Adapters

Implementações das interfaces das portas.

- `in-consumer`: consumidor de fila.
- `in-controller`: controlador HTTP / entrada de requisições.
- `out-client`: cliente para consumir outra API.
- `out-repository`: acesso à base de dados.

## Como funciona

1. O mundo externo usa uma porta de entrada (`Input Port`) para enviar dados ao core.
2. O core executa sua lógica de negócio.
3. Quando precisa de recursos externos, o core usa uma porta de saída (`Output Port`).
4. O adaptador correspondente implementa essa porta e realiza a operação externa.

## Benefícios

- Isolamento do domínio.
- Facilidade para testar o core sem dependências externas.
- Flexibilidade para trocar implementações externas sem alterar a lógica de negócio.
