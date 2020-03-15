package org.employee;

import org.employee.bean.DateConverter;
import org.employee.bean.Department;
import org.employee.bean.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("app.properties")
public class JavaConfig
{
    @Bean
    public DateConverter dateConverter()
    {
        return new DateConverter();
    }
    @Bean
    public Department department()
    {
        return new Department();
    }
    @Bean
    public Employee employee()
    {
        return new Employee(department());
    }
}
