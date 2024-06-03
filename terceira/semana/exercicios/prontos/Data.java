package terceira.semana.exercicios.prontos;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Objects;

public class Data {
    private LocalDate data;

    public Data(String data) {
          this.data = verificarData(data);
    }

    public LocalDate verificarData(String dataStr){
        try {
            //define o formato esperado
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            //tenta converter a string para um objeto LocalDate
            return LocalDate.parse(dataStr, formato);

        } catch (DateTimeParseException e){

            return LocalDate.of(2024,1,1);
        }

    }
    public  LocalDate getData(){
        return data;
    }
    public int getDia(){
        return data.getDayOfMonth();
    }
    public Month getMes(){
        return data.getMonth();

    }
    public int getAno(){
        return data.getYear();
    }
    public void clone(Data data){
     LocalDate clone = data.getData();
        System.out.println(clone);
        System.out.println(data.getData());
    }
    public boolean getIsBisext(){
        return this.data.isLeapYear();
    }
    public static int compareTo(LocalDate outraData, LocalDate data1) {
        if(data1.isBefore(outraData)){
            return -1;
        } else if(data1.isAfter(outraData)){
            return 1;
        }else{
            return  0;
        }

    }


    public static void main(String[] args) {
        Data datinha = new Data("20-03-2024");
        Data data2 = new Data("20-03-2024");
        System.out.println(datinha.getDia());
        System.out.println(datinha.getAno());
        System.out.println(datinha.getMes());
        System.out.println(datinha.getData());
        datinha.clone(datinha);
        System.out.println(datinha.getIsBisext());
        System.out.println(compareTo(data2.data,datinha.data));



    }
}
