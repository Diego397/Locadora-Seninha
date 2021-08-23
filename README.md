# Sistema de Locadora de Carros
Locadora Senninha

Diego Alejandro Balejo Cardozo Rey - 495908

Josué Marinho Hinrichs - 496655

Luiza Clara de Albuquerque Pacheco - 493478

Marcus Vinícius Paz Barros - 495682

Sérgio Garcia Barbosa Filho - 493746

CHECKPOINT #4 TRABALHO FINAL: SISTEMA DE LOCADORA DE CARROS

INSTRUÇÕES PARA EXECUTAR: 
Executar a run no arquivo Main do pacote model. (de preferência a partir de uma IDE como VSCode ou IntelliJ).

Este checkpoint tem como objetivo apresentar o sistema final da locadora,
que utiliza o MVC como padrão de projeto.

Inicialmente, mostraremos as funcionalidades do nosso sistema na
perspectiva dos seguintes tipos de usuários: Cliente, Funcionário e 
Administrador. Todos estes possuem seu próprio tipo de login, que libera
seu acesso às respectivas funcionalidades.

PARTE 1) View

OBS: Os botões RETORNAR e VOLTAR AO MENU não foram detalhados, mas eles sempre 
retornam à tela/menu anterior correspondente.

1) Cliente:
Para o cliente, atribuímos apenas o acesso à sua lista de reserva, para que
possa visualizar seus respectivos detalhes.

2) Funcionário:
Para o funcionário, atribuímos um maior leque de funcionalidades, sendo estas
o "Gerenciar Clientes" (2.1), "Gerenciar Reservas"(2.2) e "Gerenciar Frota" (2.3).

2.1 - Gerenciar Clientes:
Esta funcionalidade permite que o funcionário acesse uma lista de Clientes. 
Na tela correspondente, é exibida uma tabela com linhas clicáveis contendo o 
nome e o CPF do cliente, além de botões para carregar os dados da tabela e
cadastrar um novo cliente. Ao clicar em uma linha (cliente), o funcionário será
direcionado a uma tela de detalhes do cliente.

Na lista de clientes, ao clicar no botão "CADASTRAR CLIENTE", o funcionário
será direcionado à uma tela contendo campos de captura de dados (textFields)
que solicitam dados padrões de um cliente (nome, CPF, email...) e um botão
para concluir o cadastro. Após realizar o cadastro, o funcionário é direcionado
para a tela que lista os clientes.

2.2 - Gerenciar Reservas:
Inicialmente, há uma barra de pesquisa para que funcionário visualize dados 
específicos. Ela foi tratada para que letras maiúsculas e minúsculas sejam 
identificadas como iguais.

Esta funcionalidade permite que o funcionário acesse uma lista de reserva 
semelhante à lista de clientes. Os dados no interior da tabela são Veículo, 
Datas de retirada e devolução e o nome do cliente que reservou. A tabela também é 
clicável, em que direciona o funcionário para uma tela com os detalhes da 
reserva.

Na tela de detalhes da reserva, é exibido todos os dados da reserva, 
bem como botões para cancelar reserva, retirar e devolver carro. 
Ao clicar em alguma dessas opções, o sistema executa a função 
correspondente e retorna à lista de reservas.

Além disso, no botão "NOVA RESERVA", o funcionário é direcionado para uma tela que 
solicita a seleção de um cliente na lista de clientes, ao fazer esta seleção,
é direcionado para uma tela que solicita o intervalo da reserva. Inserido 
o intervalo, é direcionado para a tela de seleção de um veículo. Selecionado 
o veículo, será aberta a tela para confirmar a reserva, exibindo todos os detalhes 
do veículo e preços. Há, também, um check-box para confirmação do pedido de reserva. 
Confirmada a reserva, o sistema retorna à lista de reservas.

2.3) Gerenciar Frota:
Esta funcionalidade permite fazer o gerenciamento dos carros que a locadora possui.
Assim como nas funcionalidades de gerenciamento citadas anteriormente, ao clicar 
nesta opção, é exibido ao funcionário uma tela com uma lista (com linhas clicáveis) 
de carros e uma barra de pesquisa. Selecionando um carro, é exibido uma tela com os 
detalhes do veículo.

3) Administrador:
O administrador possui acesso a todas as funcionalidades do funcionário, com a adição da 
opção de "Gerenciar Funcionários", que funciona da mesma forma que a opção de "Gerenciar 
Clientes". Ao escolher um funcionário da lista, é exibida uma tela com os detalhes deste 
funcionário.

-> FIM da explicação da View.

PARTE 2) MODEL
A Model é dedicada às regras do nosso sistema. Para simplificar, resumimos os métodos de acordo
com as operações realizadas neles.

1) Cadastros:
Os métodos de cadastro vão receber como parâmetro os dados correspondentes aos atributos 
da classe que se deseja adicionar no banco de informações do sistema. Para que não ocorra 
cadastro de pessoas iguais, foi inserido uma função para verificar cpf (placa, para carro),
 uma vez que este é o atributo que diferencia uma pessoa de outra (um carro de outro). 
Após fazer a verificação, dependendo do resultado retornado, o sistema adiciona ou não a pessoa 
ou carro (após gerá-la pelo método construtor) ao banco de informações, que são as arraylists de 
cliente, funcionários e carros.

2) Login:
Cadastrados os clientes e funcionário, hora de permitir que estes acessem o sistema, o que é 
feito por intermédio do login. Este recebe as informações de login e senha e, se estiverem 
corretas, o acesso ao sistema é liberado, caso contrário, é necessário inserir novamente os 
dados até que estejam corretos. Este método vai captar os dados de login e percorrer os 
arraylist correspondentes (cliente ou funcionário) em busca dos dados recebidos. Sendo 
encontrado os dados e estando ambos corretos, o usuário será direcionado à tela com suas 
respectivas funcionalidades liberadas.

Obs: O admin possui seus dados de login dentro do código.

3) Reserva:

3.1) Fazer reserva: O método responsável por fazer a reserva funciona de forma semelhante aos métodos 
de cadastro. Ele vai receber os dados específicos da reserva (Que são os dados/atributos do carro, 
um cliente e um atendente). Após verificar se todos os dados estão de acordo, o sistema constrói 
uma reserva e adiciona à lista de reservas da locadora, do cliente e do carro.

3.2) Cancelar Reserva: O método de cancelar a reserva vai, além de modificar o status da reserva para "CANCELADA",
remover a reserva da lista de reservas do carro.

3.3) Calcular valores das reservas (com e sem atraso): Para calcular o valor das reservas, há três variáveis
envolvidas no processo: Valor total das diárias, Valor todal do atraso e valor total da reserva (esta é uma soma 
uma soma do valor das diárias com o atraso, se houver).

4) Métodos Auxiliares de Validação: São métodos que recebem um tipo de dado específico (ou conjunto de dados) e
faz uma análise para verificar se este atem aos requisitos de um método que o utiliza. Exemplos são: verificar cpf, 
verificar placa, analisar a disponibilidade do carro em um intervalo de datas.
