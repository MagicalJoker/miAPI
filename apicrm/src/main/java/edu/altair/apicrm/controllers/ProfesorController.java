package edu.altair.apicrm.controllers;

import edu.altair.apicrm.dtos.ProfesorResponseDto;
import edu.altair.apicrm.services.ProfesorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")
public class ProfesorController {

    private final ProfesorService profesorService;

    public ProfesorController(ProfesorService profesorService) {
        this.profesorService = profesorService;
    }

    // GET /api/profesores/modulo/{nombreModulo}
    @GetMapping("/modulo/{nombreModulo}")
    public ResponseEntity<List<ProfesorResponseDto>> obtenerPorModulo(@PathVariable String nombreModulo) {
        // Llamamos directamente a tu método:
        List<ProfesorResponseDto> profesores = profesorService.getProfesoresByModulo(nombreModulo);
        return ResponseEntity.ok(profesores);
    }
}