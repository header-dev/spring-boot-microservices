package com.idevalot.employee_service.service.impl;

import com.idevalot.employee_service.dto.EmployeeDto;
import com.idevalot.employee_service.entity.Employee;
import com.idevalot.employee_service.exception.ResourceNotFoundException;
import com.idevalot.employee_service.mapper.AutoEmployeeMapper;
import com.idevalot.employee_service.repository.EmployeeRepository;
import com.idevalot.employee_service.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = AutoEmployeeMapper.MAPPER.mapToEmployee(employeeDto);

        Employee savedEmployee = employeeRepository.save(employee);
        return AutoEmployeeMapper.MAPPER.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
        return AutoEmployeeMapper.MAPPER.mapToEmployeeDto(employee);
    }
}
