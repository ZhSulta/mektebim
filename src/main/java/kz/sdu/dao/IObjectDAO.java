package kz.sdu.dao;

import java.math.BigDecimal;

public interface IObjectDAO {

    public boolean save(Object obj);
    public boolean delete(BigDecimal id);
}
