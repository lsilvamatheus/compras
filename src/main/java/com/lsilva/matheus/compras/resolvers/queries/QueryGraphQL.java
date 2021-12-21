package com.lsilva.matheus.compras.resolvers.queries;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.lsilva.matheus.compras.entities.Client;
import org.springframework.stereotype.Component;

@Component
public class QueryGraphQL  implements GraphQLQueryResolver {

    public String queryTest(){
        return "Query test running ok!";
    }

    public Client clientQueryTest(){
        return new Client("Matheus Silva","matheus.silva@domain.com");
    }
}
