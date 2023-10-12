package org.example;

import java.util.List;

public interface Repository<T> {
    T buscarPorId(int id);
    List<T> listarTodos();
    boolean crear(T objeto);
    boolean actualizar(T objeto);
    boolean eliminar(int id);
}
