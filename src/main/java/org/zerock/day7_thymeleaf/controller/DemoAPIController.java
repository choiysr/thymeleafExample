package org.zerock.day7_thymeleaf.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.day7_thymeleaf.domain.Board;

/**
 * DemoAPIController
 */
@RestController
@CrossOrigin
@RequestMapping("/api")
public class DemoAPIController {

    @GetMapping("/{bno}") // pathvaliable
    public ResponseEntity<Board> get1(@PathVariable("bno") Integer bno) {
        Board board = Board.builder().bno(bno).title("AAA").content("AAAcontent").writer("AAAAWriter").build();
        System.out.println("BNO : " + bno);

        return new ResponseEntity<>(board,HttpStatus.OK);
    }

    
}