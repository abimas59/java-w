Algoritmo "SweetFlight"
//Discente:Abimael BRito Santos ~ 11/05/2024 ~SENAI
//Docentes: Anderson, Carlos Anderson, Sabrina Bet
tipo
   reserva = registro
      nr_aviao: inteiro
      passageiro: caractere
   fimregistro

   //OPCAO 1
procedimento registrar_aviao()
inicio
   para i de 0 ate 3 faca
      escreval("Digite o n�mero do ",i+1," avi�o")
      leia(aviao[i])
   fimpara
fimprocedimento

//OPCAO 2
procedimento registrar_assentos()
inicio
   para i de 0 ate 3 faca
      escreval("Digite a quantidade de assentos do avi�o ",aviao[i])
      leia(sit[i])
   fimpara
fimprocedimento

//OPCAO 3
procedimento fazer_reserva()
var
   nVoo,qtdLugar:inteiro


inicio
   limpatela

   escreval("Informe o numero do aviao")
   leia(nVoo)

   se (nVoo = aviao[0]) e (a <=sit[0]) entao
      escreval("Informe o nome do passageiro")
      leia(checkin[a].passageiro)
      checkin[a].nr_aviao <-nVoo
      sit[0]<-sit[0]-1
      a<-a+1
   senao
      se (nVoo = aviao[1]) e (b <=sit[1]+5) entao
         escreval("Informe o nome do passageiro")
         leia(checkin[b].passageiro)
         checkin[b].nr_aviao <-nVoo
         sit[1]<-sit[1]-1
         b<-b+1
      senao
         se (nVoo = aviao[2])e (c <=sit[2]+10) entao
            escreval("Informe o nome do passageiro")
            leia(checkin[c].passageiro)
            checkin[c].nr_aviao <-nVoo
            sit[2]<-sit[2]-1
            c<-c+1
         senao
            se (nVoo = aviao[3])e(d <=sit[3]+15) entao
               escreval("Informe o nome do passageiro")
               leia(checkin[d].passageiro)
               checkin[d].nr_aviao <-nVoo
               sit[3]<-sit[3]-1
               d<-d+1
            senao
               escreval("Este avi�o n�o existe! Ou est� Lotado!")
            fimse
         fimse
      fimse
   fimse
fimprocedimento

//OPCAO 4
procedimento consulta_aviao()
var
   nAviao:inteiro
inicio
   escreval("Informe o n�mero do avi�o")
   leia(nAviao)
   escreval("RESERVAS")
   se (nAviao = aviao[0]) entao
      se  (checkin[0].passageiro = "") e (checkin[4].passageiro = "") entao
         escreval("N�o h� reservas realizadas para este avi�o!")
      fimse
      para i de 0 ate 4 faca
         se (checkin[i].passageiro = "") entao
            escreva("")
         senao
            escreval("Nome:",checkin[i].passageiro)
         fimse
      fimpara
   senao
      se (nAviao =aviao[1]) entao
         se  (checkin[5].passageiro = "") e (checkin[9].passageiro = "") entao
            escreval("N�o h� reservas realizadas para este avi�o!")
         fimse
         para i de 5 ate 9 faca
            se (checkin[i].passageiro = "") entao
               escreva("")
            senao
               escreval("Nome:",checkin[i].passageiro)
            fimse
         fimpara
      senao
         se (nAviao =aviao[2]) entao
            se  (checkin[10].passageiro = "") e (checkin[14].passageiro = "") entao
               escreval("N�o h� reservas realizadas para este avi�o!")
            fimse
            para i de 10 ate 14 faca
               se (checkin[i].passageiro = "") entao
                  escreva("")
               senao
                  escreval("Nome:",checkin[i].passageiro)
               fimse
            fimpara
         senao
            se (nAviao =aviao[3]) entao
               se  (checkin[15].passageiro = "") e (checkin[19].passageiro = "") entao
                  escreval("N�o h� reservas realizadas para este avi�o!")
               fimse
               para i de 15 ate 19 faca
                  se (checkin[i].passageiro = "") entao
                     escreva("")
                  senao
                     escreval("Nome:",checkin[i].passageiro)
                  fimse
               fimpara
            senao
               escreval("Este avi�o n�o existe!")
            fimse
         fimse
      fimse
   fimse
fimprocedimento

//OPCAO 5
procedimento consulta_passageiro()
var
   nome:caractere
inicio
   escreval("Informe o nome do passageiro")
   leia(nome)
   escreval("~~�~~�~~�~~�~~�~~")
   escreval("Reservas Cliente")
   escreval("~~�~~�~~�~~�~~�~~")
   escreval(" ")
   para i de 0 ate 19 faca
      se (checkin[i].passageiro ="") entao
         escreva("")
      senao
         se(nome = checkin[i].passageiro) entao
            escreval("Nome: ",checkin[i].passageiro,"| Aviao: ",checkin[i].nr_aviao)
         senao
            escreval("N�o h� reservas realizadas para este passageiro!")
         fimse
      fimse
   fimpara


fimprocedimento

procedimento assentosDisponiveis()
var
   soma:inteiro
inicio
   soma<-sit[0]+sit[1]+sit[2]+sit[3]
   se (soma = 0) entao
      escreva("")
   senao
      escreval(soma," Lugares dispon�veis")
      escreval("Voo",aviao[0],": ",sit[0],"|Voo",aviao[1],": ",sit[1],"|Voo",aviao[2],": ",sit[2],"|Voo",aviao[3],": ",sit[3])
   fimse

fimprocedimento

Var
   aviao: vetor[0..3] de inteiro
   sit: vetor[0..3] de inteiro
   checkin: vetor[0..19] de reserva
   opcao,i,c,a,b,d,cc: inteiro

Inicio
   a<-0
   b<-5
   c<-10
   d<-15
   repita
      escreval("MENU:")
      assentosDisponiveis()
      escreval("1: Registrar o n�mero de cada avi�o.")
      escreval("2: Registrar o quantitativo de assentos dispon�veis em cada avi�o.")
      escreval("3: Reservar passagem a�rea.")
      escreval("4: Realizar consulta por avi�o.")
      escreval("5: Realizar consulta por passageiro.")
      escreval("6: Encerrar.")
      leia(opcao)

      escolha opcao
      caso 1
         limpatela
         registrar_aviao()
      caso 2
         limpatela
         registrar_assentos()
      caso 3
         limpatela
         fazer_reserva()
      caso 4
         limpatela
         consulta_aviao()
      caso 5
         limpatela
         consulta_passageiro()
      fimescolha

   ate opcao = 6

Fimalgoritmo
