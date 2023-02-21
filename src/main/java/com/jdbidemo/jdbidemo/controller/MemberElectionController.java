package com.jdbidemo.jdbidemo.controller;


import com.jdbidemo.jdbidemo.model.MemberElection;
import com.jdbidemo.jdbidemo.service.MemberElectionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/memberelection")
public class MemberElectionController {

    private final MemberElectionService memberElectionService;

    public MemberElectionController(MemberElectionService memberElectionService) {
        this.memberElectionService = memberElectionService;
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<MemberElection> getOneBook(@PathVariable("id") Long id) {
        MemberElection e = memberElectionService.findById(id);
        System.out.println("___________________" + e.getCreatedAt());
        return new ResponseEntity<>(e, HttpStatus.OK);
    }

    @GetMapping(value = "/health")
    public ResponseEntity<MemberElection> health() {
        System.out.println("UP!");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
