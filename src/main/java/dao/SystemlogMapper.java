package dao;

import model.Systemlog;

public interface SystemlogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Systemlog record);

    int insertSelective(Systemlog record);

    Systemlog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Systemlog record);

    int updateByPrimaryKey(Systemlog record);
}