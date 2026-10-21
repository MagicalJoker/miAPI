package edu.altair.apicrm.services;

import edu.altair.apicrm.dtos.ProfesorResponseDto;

import java.util.List;

public interface ProfesorService {

    // Método para filtrar la lista de profesores por el nombre del módulo
    List<ProfesorResponseDto> getProfesoresByModulo(String modulo);

    // Método para obtener el listado completo de profesores
    List<ProfesorResponseDto> obtenerTodos();
}