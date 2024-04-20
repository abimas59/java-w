Algoritmo "SomaABC"
//
// Professor   : Sabrina Bet; Carlos Anderson
// Descrição   : Soma e verifica se A+B é maior que C
// Autor(a)    : Abimael Brito Santos
// Data atual  : 20/04/2024
Var
   // Seção de Declarações das variáveis
   a,b,c, soma : inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   escreval("Digite um valor para A")
   leia(a)
   escreval("Digite um valor para B")
   leia(b)
   escreval("Digite um valor para C")
   leia(c)
   soma <- a+b
   se soma > c entao
      escreval("A + B  é maior que C")
   senao
        escreval("A+B é menor que C")
   fimse


Fimalgoritmo