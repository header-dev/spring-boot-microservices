package com.idevalot.department_service.service.impl;

import com.idevalot.department_service.dto.DepartmentDto;
import com.idevalot.department_service.entity.Department;
import com.idevalot.department_service.mapper.AutoDepartmentMapper;
import com.idevalot.department_service.repository.DepartmentRepository;
import com.idevalot.department_service.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        Department department = AutoDepartmentMapper.MAPPER.mapToDepartment(departmentDto);

        Department savedDepartment = departmentRepository.save(department);
        return AutoDepartmentMapper.MAPPER.mapToDepartmentDto(savedDepartment);
    }

    @Override
    public DepartmentDto getDepartmentByCode(String code) {
        Department department = departmentRepository.findByDepartmentCode(code);
        return AutoDepartmentMapper.MAPPER.mapToDepartmentDto(department);
    }
}
