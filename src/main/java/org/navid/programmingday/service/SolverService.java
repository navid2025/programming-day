package org.navid.programmingday.service;

public class SolverService {

    public String getAnswer(String input) {
        Long longInput = Long.valueOf(input);
        return longInput.toString();


    }
}
