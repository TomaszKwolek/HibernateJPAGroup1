package pl.employees.mapper.configurer;

import ma.glasnost.orika.MapperFactory;
import org.springframework.stereotype.Component;
import pl.employees.mapper.MappingConfigurer;
import pl.employees.model.entity.ProjectEntity;
import pl.employees.model.to.ProjectTo;

@Component
public class ProjectMapperConfigurer implements MappingConfigurer {

    @Override
    public void configure(MapperFactory mapperFactory) {
        mapperFactory.classMap(ProjectEntity.class, ProjectTo.class).byDefault().register();
    }
}
