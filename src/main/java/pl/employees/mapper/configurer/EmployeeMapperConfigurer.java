package pl.employees.mapper.configurer;

import ma.glasnost.orika.MapperFactory;
import org.springframework.stereotype.Component;
import pl.employees.mapper.MappingConfigurer;
import pl.employees.model.entity.EmployeeEntity;
import pl.employees.model.to.EmployeeTo;

@Component
public class EmployeeMapperConfigurer implements MappingConfigurer {

    @Override
    public void configure(MapperFactory mapperFactory) {
        mapperFactory.classMap(EmployeeEntity.class, EmployeeTo.class).byDefault().register();
    }
}
