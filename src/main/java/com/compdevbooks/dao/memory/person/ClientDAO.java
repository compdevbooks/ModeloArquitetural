package com.compdevbooks.dao.memory.person;

import com.compdevbooks.entity.person.*;

import java.util.ArrayList;
import java.util.List;

public class ClientDAO extends PersonDAO<Client> {

    public List<Client> getBySeller(Seller seller) {
        ArrayList<Client> clients = new ArrayList<>();
        for (Client c : database) {
            if (c.getSeller().equals(seller))
                clients.add(c);
        }
        return clients;
    }

}
