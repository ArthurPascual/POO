import java.util.ArrayList;

public class Condominio {
    private ArrayList<Casa> casas = new ArrayList<Casa>(10);

    public Condominio() {
        casas = new ArrayList<Casa>(10);
    }

    public void cadastrarCasa(Casa casa) {
        casas.add(casa);
    }

    public Casa consultarCasaEndereco(String endereco){
        for(int i = 0; i < casas.size(); i++){
            Casa aux = casas.get(i);
            if(aux.getEndereco().equals(endereco)){
                return aux;
            }
        }
        return null;
    }
}
