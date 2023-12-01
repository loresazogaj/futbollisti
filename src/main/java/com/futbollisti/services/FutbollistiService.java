package com.futbollisti.services;

import com.futbollisti.dto.FutbollistiDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

public interface FutbollistiService {

    void add(FutbollistiDto futbollisti);

    void modify(long id, FutbollistiDto updatedFutbollisti);

    void removeById(long id);

    FutbollistiDto findById(long id);

    List<FutbollistiDto> findAll();
}
