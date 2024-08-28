package com.amsidh.mvc.graph.query;

import com.amsidh.mvc.entity.EmployeeEntity;
import com.amsidh.mvc.graph.schema.Employee;
import com.amsidh.mvc.repository.EmployeeRepository;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import lombok.RequiredArgsConstructor;
import org.dozer.DozerBeanMapper;

@RequiredArgsConstructor
@DgsComponent
public class GetEmployeeByIdDatafetcher {

    private final EmployeeRepository employeeRepository;

    @DgsData(
            parentType = "Query",
            field = "getEmployeeById"
    )
    public Employee getGetEmployeeById(DataFetchingEnvironment dataFetchingEnvironment) {
        final Integer employeeId = dataFetchingEnvironment.getArgument("employeeId");
        if (employeeId != null) {
            final EmployeeEntity employeeEntity = employeeRepository.findByEmployeeId(employeeId);
            return new DozerBeanMapper().map(employeeEntity, Employee.class);
        }
        return null;
    }
}
