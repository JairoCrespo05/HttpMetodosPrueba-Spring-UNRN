package testSpring.http.service;

import testSpring.http.model.Nota;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotaService {

    private List<Nota> notas = new ArrayList<>();
    private Long contador = 1L;

    public List<Nota> listar() {
        return notas;
    }

    public void guardar(Nota nota) {
        nota.setId(contador++);
        notas.add(nota);
    }

    public void eliminar(Long id) {
        notas.removeIf(n -> n.getId().equals(id));
    }

    public Nota buscarPorId(Long id) {
        for (Nota n : notas) {
            if (n.getId().equals(id)) {
                return n;
            }
        }
        return null;
    }

}
