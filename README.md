# Agente Reativo Simples:

### Sensores

Input do Usuário:

O agente utiliza um Scanner para receber e interpretar os comandos e preferências do usuário:
- Gênero do filme escolhido (1 a 8 ou 'quit' para sair)
- Escolha do filme específico após a recomendação (1 a 10 ou 0 para retornar ao menu de gêneros)

### Atuadores

Saída no Console: 

Através de System.out.println, o agente comunica-se com o usuário, exibindo:

- O menu de gêneros
- Lista de recomendações de filmes com base no gênero escolhido
- Confirmação da escolha do filme
- Mensagens de erro e feedback quando o input é inválido ou quando não há filmes no gênero solicitado.