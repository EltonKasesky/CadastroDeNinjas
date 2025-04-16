package com.kasesky.cadastrodeninjas.missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissoesController {

    @GetMapping("/missao")
    public String missao(){
        return "Missao Teste";
    }
}
