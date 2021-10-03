package com.github.backbook.luwu;

import lombok.Data;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import java.util.List;

@Data
class BasicPersonReq {
    String firstName;
    String sss;
}

@Data
class BasicPerson {
    List<String> nameList;
}
@Data
class BasicPersonDto {
     String firstName;
     String lastName;
}


public class MapperObTest {
    public static void main(String[] args) {
        BasicPersonDto basicPersonDto = new BasicPersonDto();
        basicPersonDto.setFirstName("13123");
        basicPersonDto.setLastName("3123124");

        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        //指定映射规则
        mapperFactory.classMap(BasicPerson.class, BasicPersonDto.class)
                .field("nameList[0]", "firstName")
                .field("nameList[1]", "lastName")
                .byDefault()
                .register();
        MapperFacade mapper = mapperFactory.getMapperFacade();
        BasicPerson map = mapper.map(basicPersonDto, BasicPerson.class);


        //简单映射
        MapperFactory mapperFactory1 = new DefaultMapperFactory.Builder().build();
        //指定映射规则
        mapperFactory1.classMap(BasicPerson.class, BasicPersonDto.class)
                .field("sss", "lastName")
                .byDefault()
                .register();
        MapperFacade mapper1 = mapperFactory1.getMapperFacade();
        BasicPersonReq map1 = mapper1.map(basicPersonDto, BasicPersonReq.class);


        System.out.println(map);
        System.out.println(map1);


    }
}
