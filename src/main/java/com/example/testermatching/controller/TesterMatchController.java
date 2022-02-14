package com.example.testermatching.controller;

import com.example.testermatching.model.TesterMatchResponse;
import com.example.testermatching.model.TesterMatchVo;
import com.example.testermatching.service.TesterMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TesterMatchController {

    @Autowired
    TesterMatchService testerMatchService;
    @GetMapping("/look-up")
    public TesterMatchVo getLookup() {
        return testerMatchService.getLookUpValues();
    }

    @PostMapping("/tester-match")
    public List<TesterMatchResponse> getTesterMatch(@RequestBody TesterMatchVo testerMatchVo) {
        return testerMatchService.getTesterMatch(testerMatchVo);
    }

}
