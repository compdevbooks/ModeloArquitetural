package com.compdevbooks.dao.memory.person;

import com.compdevbooks.dao.memory.AMemoryDAO;
import com.compdevbooks.entity.IEntity;
import com.compdevbooks.entity.address.City;
import com.compdevbooks.entity.address.GPSCoordinate;
import com.compdevbooks.entity.address.Phone;
import com.compdevbooks.entity.person.Person;

import java.util.ArrayList;
import java.util.List;

public abstract class PersonDAO<ENTITY extends IEntity> extends AMemoryDAO<ENTITY> {

    public List<ENTITY> getByName(String name) {
        ArrayList<ENTITY> list = new ArrayList<>();
        for (ENTITY e : database) {
            if (((Person)e).getName().contains(name))
                list.add(e);
        }
        return list;
    }

    public List<ENTITY> getByCity(City city) {
        ArrayList<ENTITY> list = new ArrayList<>();
        for (ENTITY e : database) {
            if (((Person)e).getAddress().getCity().equals(city))
                list.add(e);
        }
        return list;
    }

    public ENTITY getByPhone(Phone phone) {
        for (ENTITY e : database)
            if (((Person)e).getPhones().contains(phone))
                return e;
        return null;
    }

    public List<ENTITY> getByGPSCoordinate(GPSCoordinate gps, int radius) {
        ArrayList<ENTITY> list = new ArrayList<>();
        for (ENTITY e : database) {
            double latitude,longitude;
            latitude = ((Person)e).getAddress().getGpsCoordinate().getLatitude();
            longitude = ((Person)e).getAddress().getGpsCoordinate().getLongitude();

            if (Math.abs(latitude-gps.getLatitude()) <= radius)
                if (Math.abs(longitude-gps.getLongitude()) <= radius)
                    list.add(e);
        }
        return list;
    }

}
