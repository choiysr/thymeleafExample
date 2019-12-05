package org.zerock.day7_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ChatController
 */
@Controller
@RequestMapping("/chat/*")
public class ChatController {
    
    @GetMapping("/main")
    public void chatPage() {

    }

    
}