package com.lsilva.matheus.compras.resolvers.queries;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.lsilva.matheus.compras.entities.Client;
import com.lsilva.matheus.compras.utils.ClientTestUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryGraphQL  implements GraphQLQueryResolver {

    private final ClientTestUtils clientTestUtils;

    public QueryGraphQL(ClientTestUtils clientTestUtils) {
        this.clientTestUtils = clientTestUtils;
    }


    public String queryTest(){
        return "Query test running ok!";
    }

    public Client clientQueryTest(){
        return new Client("Matheus Silva","matheus.silva@domain.com");
    }

    public List<Client> clientListQueryTest(){
        return clientTestUtils.buildClientListForTest();
    }

    public Client findClientByNameQueryTest(String name){
        return clientTestUtils.findClientForTestByName(name);
    }
}
