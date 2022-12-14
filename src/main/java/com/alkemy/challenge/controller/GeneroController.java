package com.alkemy.challenge.controller;

import com.alkemy.challenge.dto.GeneroDTO;
import com.alkemy.challenge.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("generos")
public class GeneroController {

    @Autowired
    GeneroService generoService;

    @PostMapping()
    public ResponseEntity<GeneroDTO> save(@RequestBody GeneroDTO dto){
        GeneroDTO saveDTO = generoService.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveDTO);

    }

}
