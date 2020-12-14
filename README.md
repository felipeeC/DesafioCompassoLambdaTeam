# DesafioCompassoLambdaTeam
Trabalhando com Java e Java avançado
desenvolvendo desafio compasso

Especificações
Requisitos principais:
1. Permitir incluir, visualizar, alterar e excluir itens (CRUD).

2. Cada item deve ter no mínimo três informações. Exemplo: descrição, fornecedor,
comentários, etc.

3. Cada item deve pertencer a alguma categoria. Exemplo: Jogos de RPG, Corrida,
Simulador. Filmes de Ação, Comédia, Romance.

4. Não permitir cadastrar itens duplicados. Considerar o nome como case insensitive.

5. Permitir visualizar o tempo total gasto em jogos ou assistindo filmes. Também permitir
visualizar por algum item específico ou categoria.

6. Salvar os itens em um banco de dados.
Desafios extras:

7. Trabalhar com a API de datas do Java, adicionando, por exemplo, uma agenda para jogos
ou filmes que deseja ver no futuro.

8. Consumir uma API externa. Por exemplo: API da Steam para consultar as avaliações de
um jogo ou a API do Twitter para verificar comentários sobre um filme.


============================================================================================
Marcos
O desenvolvimento será baseado no modelo de MVPs e seguirá o cronograma abaixo.

I. Modelar as classes que irão compor o projeto. Pensar nas classes envolvidas e seus
relacionamentos. Entrega prevista para 18/12/2020 (1 mês de desenvolvimento). O
principal objetivo é criar a estrutura inicial para o projeto. É possível desenvolver utilizando 
objetos somente em memória e imprimir a lista de itens direto no console. Observar a
aplicação dos conteúdos relacionados a orientação a objetos, herança, polimorfismo, etc.


II. Modelar e criar uma API REST com as operações que poderemos fazer em nosso sistema
e iniciar a adição dos testes unitários. Entrega prevista para 15/01/2021 (1 mês de
desenvolvimento). O principal objetivo é permitir que a aplicação seja utilizável por nosso
usuário (pode ser uma aplicação frontend, por exemplo.) É possível desenvolver utilizando
objetos somente em memória e imprimir a lista de itens no retorno das chamadas REST.
Observar a correta utilização do modelo REST. Aplicar na prática os conteúdos vistos
relacionados a Spring. Verificar o tratamento de exceções. Adição de testes unitários.


III. Adicionar a camada de persistência. Pensar em como modelo o meu banco de dados e.
como ele se relaciona com as minhas classes (ORM – Classes vs Tabelas). Entrega prevista
para 10/02/2021 (1 sprint de desenvolvimento). O principal objetivo é permitir que as
informações sejam mantidas mesmo depois de desligar o computador. Aplicar na prática
os conteúdos relacionados a banco de dados e JPA. Pensar na consistência dos dados e
quais dados são relevantes.


IV. Atividades extras para integração com API externa e trabalhar com a API de datas do Java.
Pensar em como consumir uma API externa e como trabalhar com datas dentro do projeto.
O principal objetivo é vivenciar na prática as dificuldades encontradas em projetos reais,
como trabalhar com datas em UTC tendo que persistir no banco de dados e também como
integrar meu serviço com serviços externos que não possuo controle. Vivenciar na prática
as dificuldades para integrar com outros serviços, tendo que realizar a atividade de
pesquisa, leitura de documentação, tratamento de erros que podem acontecer nesse
serviço. Sentir na prática como tarefas simples, podem ser difíceis, como por exemplo,
salvar datas no banco ou consumir outras API.
