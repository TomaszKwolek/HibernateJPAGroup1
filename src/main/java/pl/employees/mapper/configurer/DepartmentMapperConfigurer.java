package pl.employees.mapper.configurer;

import ma.glasnost.orika.MapperFactory;
import org.springframework.stereotype.Component;
import pl.employees.mapper.MappingConfigurer;
import pl.employees.model.entity.ProjectsOfEmployeeEntity;
import pl.employees.model.to.ProjectsOfEmployeeTo;

@Component
public class DepartmentMapperConfigurer implements MappingConfigurer {

    @Override
    public void configure(MapperFactory mapperFactory) {
        mapperFactory.classMap(ProjectsOfEmployeeEntity.class, ProjectsOfEmployeeTo.class).byDefault().register();
    }
}
