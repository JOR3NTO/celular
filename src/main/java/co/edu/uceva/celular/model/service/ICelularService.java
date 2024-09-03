package co.edu.uceva.celular.model.service;

import co.edu.uceva.celular.model.entities.Celular;

import java.util.List;

public interface ICelularService {
    List<Celular> listar();

    void delete(Celular celular);

    Celular save(Celular celular);

    Celular findById(long id);

    Celular update(Celular celular);
}
