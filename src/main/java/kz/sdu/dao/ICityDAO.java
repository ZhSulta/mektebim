package kz.sdu.dao;

import kz.sdu.entities.City;

import java.math.BigDecimal;


public interface ICityDAO extends IObjectDAO{

    public City find(BigDecimal id);


}
