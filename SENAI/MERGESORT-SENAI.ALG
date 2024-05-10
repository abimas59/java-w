Algoritmo "MergeSortSenai"
//
// Professor   : Carlos Anderson,Anderson,Sabrina Bet
// Descrição   : Algoritmo de ordenação de dados MergeSort
// Autor(a)    : Abimael Brito Santos
// Data atual  : 03/05/2024
Var
   number,aux:vetor [0..9] de inteiro
   i:inteiro

procedimento mergeSort(start,end:inteiro)
var
   mid:inteiro
inicio
   se (start<end) entao
      mid<-(start+end)\2
      mergeSort(start,mid)
      mergeSort(mid+1,end)
      merge(start,mid,end)
   fimse
fimprocedimento

procedimento merge(start,mid,end:inteiro)
var
   left:inteiro
   right:inteiro
   count:inteiro
inicio
   left<-start
   right<-mid+1
   count<-start
   carregarVetor()
   enquanto ((left <= mid) e (right <= end)) faca

      se (aux[left] < aux[right]) entao
         number[count] <- aux[left]
         left<-left+1
      senao
         number[count]<-aux[right]
         right<-right+1
      fimse

      count<-count+1
   fimenquanto

   enquanto (left<=mid) faca
      number[count]<-aux[left]
      left<- left+1
      count<-count+1
   fimenquanto

   enquanto (right<=end) faca
      number[count]<-aux[right]
      right<-right+1
      count<-count+1
   fimenquanto
   carregarVetor()
fimprocedimento

procedimento carregarVetor()
inicio
   para i de 0 ate 9 faca
      aux[i] <- number[i]
   fimpara
fimprocedimento

procedimento mostrarVetor()
inicio
   para i de 0 ate 9 faca
      escreva(number[i]," ")
   fimpara
fimprocedimento

Inicio
   para i de 0 ate 9 faca
      leia(number[i])
   fimpara
   mostrarVetor()
   mergeSort(0,9)
   escreval("")
   escreval("~~~~ORDENADO~~~~~")
   mostrarVetor()

Fimalgoritmo