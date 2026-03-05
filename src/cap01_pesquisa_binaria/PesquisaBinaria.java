package cap01_pesquisa_binaria;

public class PesquisaBinaria {

    public static int pesquisaBinaria(int[] lista, int item){
        int baixo = 0;
        int alto = lista.length-1;

        while (baixo <= alto){

            int meio = (baixo+alto)/2;
            int chute = lista[meio];

            if(chute == item){
                return meio;
            }
            if (chute > item){
                alto = meio-1;
            }else{
                baixo = meio+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] minhaLista = {1,3,5,7,9,11,13,15,18};

        int numeroBuscado = 11;

        int resultado = pesquisaBinaria(minhaLista, numeroBuscado);

        System.out.printf("Índice do número %d: %d%n" , numeroBuscado,resultado);
    }
}
