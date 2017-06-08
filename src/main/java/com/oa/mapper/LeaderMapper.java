package com.oa.mapper;

import com.oa.entity.Leader;

public interface LeaderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leaders
     *
     * @mbg.generated Wed Jun 07 08:17:00 CST 2017
     */
    int insert(Leader record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leaders
     *
     * @mbg.generated Wed Jun 07 08:17:00 CST 2017
     */
    int insertSelective(Leader record);

    Leader selectByUserName(String username);

    String getNameFromId(int id);
}