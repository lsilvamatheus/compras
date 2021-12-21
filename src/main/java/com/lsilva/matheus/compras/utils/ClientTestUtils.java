package com.lsilva.matheus.compras.utils;

import com.lsilva.matheus.compras.entities.Client;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ClientTestUtils {

    public List<Client> buildClientListForTest(){
        return Arrays.asList(
                new Client("João Silva", "jsilva@domain.com"),
                new Client("Lucas Silva", "jsilva@domain.com"),
                new Client("Tonho Silva", "tonho.silva@domain.com"),
                new Client("Tião Silva", "tiao.silva@domain.com")
        );
    }

    public  Client findClientForTestByName(String name){
        return buildClientListForTest().stream()
                .filter(client -> client.getName().equals(name)).findFirst()
                .orElseThrow(ClientNotFoundException::new);
    }
}
