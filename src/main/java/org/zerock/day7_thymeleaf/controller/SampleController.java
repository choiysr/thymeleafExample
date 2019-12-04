package org.zerock.day7_thymeleaf.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.day7_thymeleaf.domain.Board;

/**
 * SampleController
 */

 @Controller
 @RequestMapping("/sample")
public class SampleController {

    @GetMapping("/ex1")
    public void ex1(Model model) {
        model.addAttribute("msg", "hello ThymeLeaf!");
    }

    @GetMapping("/ex2")
    public void ex2(Model model) {
        // 들어오는 i값과 매핑을 시켜줌(mapToObject)
        List<Board> list = IntStream.range(1, 101).mapToObj(i -> 
        Board.builder()
        .bno(i)
        .title("Title"+i)
        .content("Content"+i)
        .build())
        .collect(Collectors.toList());

        model.addAttribute("list", list);
    }

    
}