# hexagonal-architecture-studying

Explicação sobre arquitetura hexagonal

O core da aplicação é dividido em portas

Portas de entrada (input) : para acessar as regras de negocio do core da aplicação externa precisa implementar essas portas de entrada

Core da aplicação (regras de negocio)

Portas de saída (output) : Para consumir qualquer serviço é preciso fazer um adaptador nessas portas de saída , seja requisição pra api externa , pra um serviço de mensageria
