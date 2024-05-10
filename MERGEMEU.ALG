Algoritmo "MergeMeu"
//
// Professor   : Sabrina Bet
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/04/2024
Var
   // Seção de Declarações das variáveis
   numeros:vetor[0..9] de inteiro
   retorno,i,contador,inici:inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
procedimento mergeSort(inici, fim:inteiro)
var
   meio:inteiro
inicio

   se (inici < fim) entao
      meio <- (inici+fim)\2
      mergeSort(inici,meio)
      mergeSort(meio+1,fim)
      merge(inici,meio,fim)
   fimse

fimprocedimento

procedimento mostrar()
inicio
   para i de 0 ate 9 faca
      escreva(numeros[i],"|")
   fimpara
fimprocedimento

procedimento merge(top,mid,low:inteiro)
var
   aux:vetor[0..10] de inteiro
   h,i,j:inteiro
inicio
   h<-top
   i<-top
   j<-mid+1
   enquanto (h <= mid) e (j<=low) faca
      se numeros[h]<=numeros[j] entao
         aux[i]<-numeros[h]

         h<-h+1
      senao
         aux[i]<-numeros[j]
         j<-j+1
      fimse
      i<-i+1

   fimenquanto


   se h > mid entao
      para contador de j ate low faca
         aux[i]<- numeros[contador]
         i<-i+1
      fimpara
   senao
      para contador de h ate mid faca
         aux[i]<-numeros[contador]
         i<-i+1
      fimpara
   fimse
   para contador de top ate low faca
      numeros[contador]<-aux[contador]
   fimpara

fimprocedimento

para i de 0 ate 9 faca
   escreval("Digite o numero para o vetor")
   leia(numeros[i])
fimpara
mostrar()
mergeSort(0,9)
escreval("")
escreval("-------------------")
mostrar()





Fimalgoritmo