package horadosistema;

import java.util.Locale;
import java.util.Date;

public class HoraDoSistema{
    public static void main(String[] args){
        Locale locale = Locale.getDefault();
        Date relogio = new Date(); //Biblioteca para tratamento de data (NEW: cria um novo objeto)
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString()); //converte o objeto "data" para uma string
        System.out.println("O idioma do Sistema é: ");
        System.out.println(locale.getDisplayLanguage());


    };
}