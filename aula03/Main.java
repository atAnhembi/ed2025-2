public class Main {
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha(5);

        System.out.println("Pilha vazia? "  + minhaPilha.estaVazia());
        System.out.println("Pilha cheia? "  + minhaPilha.estaCheia());
        System.out.println("Capacidade: " + minhaPilha.capacidade());

        System.out.println(minhaPilha.exibirPilha());
        minhaPilha.empilhar(2);
        minhaPilha.empilhar(3);
        minhaPilha.empilhar(5);
        System.out.println(minhaPilha.exibirPilha());
        System.out.println("Removeu: " + minhaPilha.desempilhar());
        System.out.println(minhaPilha.exibirPilha());
        System.out.println("Qtde elementos na pilha: " + minhaPilha.numElementos());

        PilhaGenerica<Integer> p = new PilhaGenerica<>(Integer.class, 10);

        // p.empilhar(10);
        System.out.println(p.capacidade());
        System.out.println(p.exibirPilha());
        
        try {
            System.out.println("Removeu: " + p.desempilhar());
        } catch (Exception e) {
           e.printStackTrace();
           System.out.println("Erro: " + e.getMessage());
        }


        PilhaGenerica<String> p2 = new PilhaGenerica<>(String.class, 10);
        p2.empilhar("Emerson");
        p2.empilhar(null);

    }
}
