// Definição da interface
package Lista_1;
interface Animal {
    void emitirSom();
    void mover();
}

// Implementação da interface para a classe Cachorro
class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro corre");
    }
}

// Implementação da interface para a classe Gato
class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato mia");
    }

    @Override
    public void mover() {
        System.out.println("O gato anda");
    }
}

public class Teste {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.emitirSom();
        cachorro.mover();

        gato.emitirSom();
        gato.mover();
    }
}