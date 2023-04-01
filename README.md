# Atividade Final

Este é um projeto de exemplo em Java que mostra como ler e escrever arquivos de texto e manipular objetos em memória.

## Descrição do Projeto
### O projeto é composto por quatro classes principais:

Carro: representa um carro com seus atributos, como modelo, marca, ano, etc.
Fabricante: representa um fabricante de carros com seus atributos, como nome, país de origem, etc.
IPVA: representa o imposto sobre a propriedade de veículos automotores com seus atributos, como valor, data de vencimento, etc.
Multa: representa uma multa de trânsito com seus atributos, como valor, data de aplicação, etc.
As classes Carro e Fabricante são subclasses da classe abstrata Chassi, que representa o chassi de um carro, enquanto as classes IPVA e Multa são subclasses da classe abstrata Regular, que representa uma despesa regular com um carro.

### O projeto também inclui quatro arquivos de texto:

- entrada1.txt: contém valores de atributos para duas entidades da classe Carro e duas entidades da classe Fabricante.
- entrada2.txt: contém valores de atributos para duas entidades da classe IPVA e duas entidades da classe Multa.
- resultado1.txt: será criado pelo programa e conterá o resultado da manipulação dos objetos do primeiro arquivo.
- resultado2.txt: será criado pelo programa e conterá o resultado da manipulação dos objetos do segundo arquivo.

### Funcionamento do Programa
O programa começa lendo os dados do arquivo entrada1.txt e instanciando as quatro entidades presentes nele, usando polimorfismo para armazená-las em um único ArrayList. Em seguida, ele repete o mesmo processo para o arquivo entrada2.txt.

Em seguida, o programa realiza um algoritmo fundamental sobre os objetos do primeiro ArrayList (no caso, a média dos anos dos carros) e escreve o resultado no arquivo resultado1.txt. Depois, ele realiza um algoritmo fundamental sobre os objetos do segundo ArrayList (no caso, o somatório dos valores das multas) e escreve o resultado no arquivo resultado2.txt.