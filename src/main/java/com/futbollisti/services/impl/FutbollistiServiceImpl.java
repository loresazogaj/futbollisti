package com.futbollisti.services.impl;

import com.futbollisti.dto.FutbollistiDto;
import com.futbollisti.mappers.FutbollistiMapper;
import com.futbollisti.repositories.FutbollistiRepository;
import com.futbollisti.services.FutbollistiService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FutbollistiServiceImpl implements FutbollistiService {
    private final FutbollistiRepository futbollistiRepository;
    private final FutbollistiMapper futbollistiMapper;

    public FutbollistiServiceImpl(FutbollistiRepository futbollistiRepository, FutbollistiMapper futbollistiMapper) {
        this.futbollistiRepository = futbollistiRepository;
        this.futbollistiMapper = futbollistiMapper;
    }


    @Override
    public void add(FutbollistiDto futbollisti) {
        var entity = futbollistiMapper.toEntity(futbollisti);
        futbollistiRepository.save(entity);
    }

    @Override
    public void modify(long id, FutbollistiDto updatedFutbollisti) {
        var editEntity = futbollistiRepository.findById(id);
        if (editEntity.isEmpty())
            throw new RuntimeException("Footballer not found");

        var entity = editEntity.get();
        entity.setName(updatedFutbollisti.getName());
        entity.setAge(updatedFutbollisti.getAge());
        entity.setLength(updatedFutbollisti.getLength());
        entity.setPosition(updatedFutbollisti.getPosition());

        futbollistiRepository.save(entity);
    }

    @Override
    public void removeById(long id) {
        futbollistiRepository.deleteById(id);
    }

    @Override
    public FutbollistiDto findById(long id) {
        var entity = futbollistiRepository.findById(id);
        if (entity.isEmpty())
            throw new RuntimeException("Footballer not found");
        var dto = futbollistiMapper.toDto(entity.get());
        return dto;
    }

    @Override
    public List<FutbollistiDto> findAll() {
        return futbollistiRepository.findAll().stream().map(futbollistiMapper::toDto).toList();
    }
}
