# Agente Reativo Simples:

### Sensores

#### Entrada do Usuário:

O agente utiliza um Scanner para receber e interpretar os comandos e preferências do usuário:
- Gênero do filme escolhido (1 a 8 ou 'quit' para sair)
- Escolha do filme específico após a recomendação (1 a 5 ou 0 para retornar ao menu de gêneros)

### Atuadores

#### Apresentação de Gêneros e Filmes:

O agente exibe a lista de gêneros e depois uma lista filtrada de filmes para o usuário, simulando a ação de um atuador.

### Relatório

O Agente Reativo Simples é executado solicitando uma lista de generos de filmes, onde o usuário irá esclher entre 1 a 8 ou quit, caso ele escolha um numero, o Agente vai recomendar 5 filmes aleatórios (Podendo ser filmes repetidos e sem salvar um histórico de filmes recomendados), então sempre que o usuario solicitar a recomendação o agente apenas irá recomendar 5 filmes aleatórios, podendo ou não repetir esses filmes.

# Agente Baseado Em Modelo

### Sensores:

#### Entrada do Usuário:

O agente utiliza um Scanner para receber e interpretar os comandos e preferências do usuário:
- Gênero do filme escolhido (1 a 8 ou 'quit' para sair)
- Escolha do filme específico após a recomendação (1 a 5 ou 0 para retornar ao menu de gêneros)

#### Histórico de Recomendação: 

Ele registra quais filmes foram exibidos ao usuário previamente, permitindo que o agente evite recomendações duplicadas até que todos os filmes de um gênero sejam recomendados.

### Atuadores:

#### Apresentação de Gêneros e Filmes: 

O agente exibe a lista de gêneros e depois uma lista filtrada de filmes para o usuário, simulando a ação de um atuador.

#### Recomendações de Filmes:

O agente seleciona e exibe filmes não recomendados anteriormente, atuando na apresentação de novos conteúdos de acordo com a escolha do gênero do usuário.

#### Mensagens de Feedback:

Mensagens informando quando todos os filmes de um gênero foram recomendados e o ciclo de recomendações é reiniciado. Essas mensagens representam ações para manter o usuário informado sobre o status das recomendações.

### Relatório

O Agente Baseado Em Modelo é executado solicitando uma lista de generos de filmes, onde o usuário irá esclher entre 1 a 8 ou quit, caso ele escolha um numero, o Agente vai recomendar 5 filmes aleatórios (Mas nesse agente, irá recomendar filmes diferentes, e salvar um historico de filmes que ja foram recomendados, caso o usuario solicite outra recomendação, ele não repetira os filmes, após acabar os filmes, ele vai limpar o historico e começar a recomendação novamente), então sempre que o usuario solicitar a recomendação o agente irá recomendar 5 filmes aleatórios, salvando em um historico de filmes recomendados, e caso haja uma nova solicitação, ele irá recomendar filmes diferentes dos anteriores, apenas irá repetir caso todos os filmes ja forem recomendados.
