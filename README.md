# Agente Reativo Simples:

### - Sensores

#### Entrada do Usuário:

O agente utiliza um Scanner para receber e interpretar os comandos e preferências do usuário:
- Gênero do filme escolhido (1 a 8 ou 'quit' para sair)
- Escolha do filme específico após a recomendação (1 a 5 ou 0 para retornar ao menu de gêneros)

### - Atuadores

#### Apresentação de Gêneros e Filmes:

O agente exibe a lista de gêneros e depois uma lista filtrada de filmes para o usuário, simulando a ação de um atuador.

### - Relatório:

O Agente Reativo Simples é executado solicitando uma lista de generos de filmes, onde o usuário irá esclher entre 1 a 8 ou quit, caso ele escolha um numero, o Agente vai recomendar 5 filmes aleatórios (Podendo ser filmes repetidos e sem salvar um histórico de filmes recomendados), então sempre que o usuario solicitar a recomendação o agente apenas irá recomendar 5 filmes aleatórios, podendo ou não repetir esses filmes.

# Agente Baseado Em Modelo

### - Sensores:

#### Entrada do Usuário:

O agente utiliza um Scanner para receber e interpretar os comandos e preferências do usuário:
- Gênero do filme escolhido (1 a 8 ou 'quit' para sair)
- Escolha do filme específico após a recomendação (1 a 5 ou 0 para retornar ao menu de gêneros)

#### Histórico de Recomendação: 

Ele registra quais filmes foram exibidos ao usuário previamente, permitindo que o agente evite recomendações duplicadas até que todos os filmes de um gênero sejam recomendados.

### - Atuadores:

#### Apresentação de Gêneros e Filmes: 

O agente exibe a lista de gêneros e depois uma lista filtrada de filmes para o usuário, simulando a ação de um atuador.

#### Recomendações de Filmes:

O agente seleciona e exibe filmes não recomendados anteriormente, atuando na apresentação de novos conteúdos de acordo com a escolha do gênero do usuário.

#### Mensagens de Feedback:

Mensagens informando quando todos os filmes de um gênero foram recomendados e o ciclo de recomendações é reiniciado. Essas mensagens representam ações para manter o usuário informado sobre o status das recomendações.

### - Relatório:

O Agente Baseado Em Modelo é executado solicitando uma lista de generos de filmes, onde o usuário irá esclher entre 1 a 8 ou quit, caso ele escolha um numero, o Agente vai recomendar 5 filmes aleatórios (Mas nesse agente, irá recomendar filmes diferentes, e salvar um historico de filmes que ja foram recomendados, caso o usuario solicite outra recomendação, ele não repetira os filmes, após acabar os filmes, ele vai limpar o historico e começar a recomendação novamente), então sempre que o usuario solicitar a recomendação o agente irá recomendar 5 filmes aleatórios, salvando em um historico de filmes recomendados, e caso haja uma nova solicitação, ele irá recomendar filmes diferentes dos anteriores, apenas irá repetir caso todos os filmes ja forem recomendados.

# Agente Baseado em Objetivo

### - Sensores:

#### Entrada do Usuário:
O agente utiliza um Scanner para interpretar a escolha do usuário, onde o usuário seleciona um gênero de filme (1 a 8 ou 'quit' para sair). Após a recomendação de filmes, o usuário escolhe um filme específico (1 a 5 ou 0 para retornar ao menu de gêneros).

#### Histórico de Recomendação:

Ele registra quais filmes foram exibidos ao usuário previamente, permitindo que o agente evite recomendações duplicadas até que todos os filmes de um gênero sejam recomendados.

#### Filme Escolhido pelo Usuário:
O agente monitora a escolha final do usuário e, a partir dela, identifica o gênero e os atores principais do filme para recomendar filmes semelhantes.

### - Atuadores:

#### Apresentação de Gêneros e Filmes:

Inicialmente, o agente exibe uma lista de gêneros para o usuário escolher. Após a seleção do gênero, o agente mostra uma lista de cinco filmes aleatórios dentro desse gênero para estimular a escolha do usuário.

#### Recomendações de Filmes:

O agente seleciona e exibe filmes não recomendados anteriormente, atuando na apresentação de novos conteúdos de acordo com a escolha do gênero do usuário.

#### Recomendações Baseadas no Filme Escolhido:

Após o usuário escolher um filme específico, o agente busca e exibe filmes adicionais do mesmo gênero e com o mesmo ator. Essa recomendação é mais refinada, tentando aumentar a chance de o usuário gostar dos próximos filmes recomendados, pois são de um gênero e ator já preferidos.

#### Mensagens de Feedback:
O agente fornece feedback ao usuário, como: "Baseado em sua escolha, recomendamos outros filmes com o mesmo ator no gênero que você selecionou."

### - Relatório:

O Agente Baseado em Objetivo guia o usuário a escolher um filme, e após essa escolha, o agente passa a recomendar outros filmes com as mesmas características (gênero e ator principal). Quando o usuário solicita recomendações, o agente sugere cinco filmes com o ator e o gênero do filme escolhido anteriormente, até que o usuário esteja satisfeito com as sugestões. Caso o agente esgote as recomendações com essas características, ele pode recomeçar o ciclo de recomendações ou pedir ao usuário para selecionar um novo gênero.

# Agente Baseado em Utilidade
### - Sensores:

#### Entrada do Usuário:
O agente utiliza um Scanner para interpretar a escolha do usuário, onde o usuário seleciona um gênero de filme (1 a 8 ou 'quit' para sair). Após a recomendação de filmes, o usuário escolhe um filme específico (1 a 5 ou 0 para retornar ao menu de gêneros).

#### Histórico de Recomendação:

Ele registra quais filmes foram exibidos ao usuário previamente, permitindo que o agente evite recomendações duplicadas até que todos os filmes de um gênero sejam recomendados.

#### Filme Escolhido pelo Usuário:
O agente monitora a escolha final do usuário e, a partir dela, identifica o gênero e os atores principais do filme para recomendar filmes semelhantes.

#### Preferências de Utilidade: 

Esse agente busca maximizar a satisfação do usuário por meio de um sistema de pontuação, considerando fatores como gêneros favoritos, filmes escolhidos e atores principais.

### - Atuadores:

#### Apresentação de Gêneros e Filmes:

Inicialmente, o agente exibe uma lista de gêneros para o usuário escolher. Após a seleção do gênero, o agente mostra uma lista de cinco filmes aleatórios dentro desse gênero para estimular a escolha do usuário.

#### Recomendações de Filmes:

O agente seleciona e exibe filmes não recomendados anteriormente, atuando na apresentação de novos conteúdos de acordo com a escolha do gênero do usuário.

#### Recomendações de Filmes Baseadas na popularidade:

O agente calcula a pontuação dos filmes com base em fatores como popularidade no gênero, histórico de visualizações e preferência do usuário. Filmes com pontuações mais altas são priorizados nas recomendações.

### - Relatório:

O Agente Baseado em Utilidade funciona solicitando o gênero preferido
do usuário e recomendando 5 filmes. Ele considera o histórico de filmes
assistidos e o perfil de preferências do usuário. Caso todos os filmes sejam recomendados,
o agente reinicia o histórico e recalcula a utilidade para futuras recomendações.
Em cada iteração, o objetivo é sempre selecionar as recomendações que potencialmente
trarão maior satisfação ao usuário com base em suas preferências
(Nesse caso, as preferencias seriam generos escolhidos, filmes escolhidos
e atores dos filmes escolhidos).

#### Características:

- Registra histórico e evita recomendações repetidas.

- Usa um sistema de pontuação para priorizar recomendações, considerando popularidade, histórico de visualizações e preferências (gênero, filmes e atores escolhidos).

- Recalcula a utilidade com base no feedback indireto do usuário, permitindo que as recomendações se tornem mais afinadas e potencialmente mais satisfatórias.

#### Limitações:

- Exige mais dados para personalização eficaz: A precisão e eficácia dependem de um histórico considerável para aprender preferências do usuário com clareza.

- Sistemas de pontuação podem ser subjetivos: Definir a utilidade de filmes com base em popularidade e preferências pode ser desafiador, e algumas recomendações podem não ser ideais se a pontuação não refletir exatamente o gosto do usuário.

- Mais intensivo em processamento: Comparado aos outros agentes, requer mais lógica e cálculos, o que aumenta a complexidade de implementação e recursos necessários para execução.
