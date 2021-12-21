package com.lsilva.matheus.compras.resolvers.queries;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class QueryGraphQL  implements GraphQLQueryResolver {

    public String queryTest(){
        return "Query test running ok!";
    }
}
