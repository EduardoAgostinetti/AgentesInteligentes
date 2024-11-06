# Agente Reativo Simples:

### Sensores

#### Entrada do Usuário:

O agente utiliza um Scanner para receber e interpretar os comandos e preferências do usuário:
- Gênero do filme escolhido (1 a 8 ou 'quit' para sair)
- Escolha do filme específico após a recomendação (1 a 10 ou 0 para retornar ao menu de gêneros)

### Atuadores

#### Apresentação de Gêneros e Filmes:

O agente exibe a lista de gêneros e depois uma lista filtrada de filmes para o usuário, simulando a ação de um atuador.

# Agente Baseado Em Modelo

### Sensores:

#### Entrada do Usuário:

O agente utiliza um Scanner para receber e interpretar os comandos e preferências do usuário:
- Gênero do filme escolhido (1 a 8 ou 'quit' para sair)
- Escolha do filme específico após a recomendação (1 a 10 ou 0 para retornar ao menu de gêneros)

#### Histórico de Recomendação: 

Ele registra quais filmes foram exibidos ao usuário previamente, permitindo que o agente evite recomendações duplicadas até que todos os filmes de um gênero sejam recomendados.

### Atuadores:

#### Apresentação de Gêneros e Filmes: 

O agente exibe a lista de gêneros e depois uma lista filtrada de filmes para o usuário, simulando a ação de um atuador.

#### Recomendações de Filmes:

O agente seleciona e exibe filmes não recomendados anteriormente, atuando na apresentação de novos conteúdos de acordo com a escolha do gênero do usuário.

#### Mensagens de Feedback:

Mensagens informando quando todos os filmes de um gênero foram recomendados e o ciclo de recomendações é reiniciado. Essas mensagens representam ações para manter o usuário informado sobre o status das recomendações.
