package org.zerock.day7_thymeleaf.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Board
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Board {


    private Integer bno;
    private String title;
    private String content;
    
}