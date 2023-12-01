package com.futbollisti.mappers;


import com.futbollisti.dto.FutbollistiDto;
import com.futbollisti.model.Futbollisti;
import org.springframework.stereotype.Component;

@Component
public class FutbollistiMapper {
    public Futbollisti toEntity(FutbollistiDto dto) {
        var entity = new Futbollisti();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setLength(dto.getLength());
        entity.setPosition(dto.getPosition());
        return entity;
    }
    public FutbollistiDto toDto(Futbollisti entity) {
        var dto = new FutbollistiDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setPosition(entity.getPosition());
        dto.setAge(entity.getAge());
        dto.setLength(entity.getLength());

        return dto;
    }
}
