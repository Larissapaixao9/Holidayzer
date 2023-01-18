import java.util.HashMap;
import java.util.Map;
public class Holyday {

    //No map, a chave é uma string e o valor também (<String, String>)
    Map<String, String> Holyday = new HashMap<>();

    public void getHolyday(String date){
        montaFeriado();

        String gettingHolyday = Holyday.get(date);

        if(gettingHolyday==null){
            System.out.println("feriado não consta no sistema");
        }
        else{
            System.out.println("A data "+ date + " se refere ao feriado "+gettingHolyday);
        }
    }



    public void montaFeriado(){
        //para adicionar feriados na Hashmao "Holyday",
        //utilizamos a função "put" para adicionar chave
        //e valor

        Holyday.put("01/01/2023","Confraternização mundial");
        Holyday.put("21/02/2023","Páscoa");
        Holyday.put("21/04/2023","Tiradentes");
        Holyday.put("01/05/2023","Dia do trabalho");
        Holyday.put("08/06/2023","Corpus Christi");
        Holyday.put("07/09/2023","Independência do Brasil");
        Holyday.put("12/10/2023","Independência do Brasil");
        Holyday.put("02/11/2023","Finados");
        Holyday.put("15/11/2023","Proclamação da República");
        Holyday.put("25/12/2023","Natal");
     
    }
}
