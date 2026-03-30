package metodos.dominio;

public class Treinador {
    public int pokebolas = 3;

    public boolean temPokebola(){
        if (pokebolas > 0) {

            return true;
        } else {
            return false;
        }
    }
    public boolean calculadorSucesso(int taxaDeFuga){
        if (taxaDeFuga < 50) {
            return true;
        } else {
            return false;
        }
    }
    public String tentarCapturar(String nomeMonstro, int taxaDeFuga){
        if (temPokebola() == false) {
            return "Você não tem mais Pokébolas!";
        }
            pokebolas -= 1;
            
         if(calculadorSucesso(taxaDeFuga) == true){
            return "Gotcha! " + nomeMonstro + " capturado! Pokébolas: " + pokebolas;
        } else{
            return "Ah não! O " + nomeMonstro + " escapou! Pokébolas: " + pokebolas;
        }

    }
    
}
