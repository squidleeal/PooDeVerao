package acompanhante;

import java.util.ArrayList;
import java.util.List;

public class AcompanhantesExistentes {
    public static void main(String[] args) {
        // Criando instâncias predefinidas de Acompanhante
        Acompanhante a1 = new Acompanhante("Maria Silva", "Feminino", "(11) 98765-4321");
        Acompanhante a2 = new Acompanhante("João Pereira", "Masculino", "(21) 99874-1234");
        Acompanhante a3 = new Acompanhante("Carla Mendes", "Feminino", "(31) 97654-6789");
        Acompanhante a4 = new Acompanhante("Emanuel Badaro", "Masculino", "(41) 91234-5678");
        Acompanhante a5 = new Acompanhante("Ana Oliveira", "Feminino", "(51) 93456-7890");

        // Armazenando as instâncias em uma lista
        List<Acompanhante> acompanhantes = new ArrayList<>();
        acompanhantes.add(a1);
        acompanhantes.add(a2);
        acompanhantes.add(a3);
        acompanhantes.add(a4);
        acompanhantes.add(a5);

        // Exibindo as instâncias no console
        for (Acompanhante acompanhante : acompanhantes) {
            System.out.println(acompanhante);
        }
    }
}
