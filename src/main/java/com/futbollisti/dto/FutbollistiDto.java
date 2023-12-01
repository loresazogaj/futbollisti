package com.futbollisti.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FutbollistiDto {
    private Long id;
    private String name;
    private int age;
    private double length;
    private String position;
}
