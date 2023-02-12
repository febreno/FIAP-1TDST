public class TestePilha {

    public static void main(String[] args){

        Pilha<String> p = new Pilha<>(10);
        String frase = "Hoje fez calor mas amanha vai fazer frio";

        String[] palavras = frase.split(" ");
        int i = 0;
        while (i < palavras.length && !p.isFull()) {
            p.put(palavras[i]);
            i = i + 1;
        }

        while (!p.isEmpty()) {
            System.out.println(p.pop());
        }
    }
}