package org.navid.programmingday.controller;

import org.navid.programmingday.dto.Input;
import org.navid.programmingday.dto.Output;
import org.navid.programmingday.service.SolverService;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {


    @PostMapping(value = "/test", produces = "application/json")
    public Output postTest(@RequestBody Input input){

        Output output = new Output();
        SolverService solverService = new SolverService();
        output.stringOutput = solverService.getAnswer(input.number);
        return output;
    }
}
