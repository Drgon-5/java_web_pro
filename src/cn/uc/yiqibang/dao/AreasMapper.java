package cn.uc.yiqibang.dao;

import cn.uc.yiqibang.beans.Areas;
import cn.uc.yiqibang.utils.Result;

public interface AreasMapper {
	

	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated Fri Nov 10 16:12:02 GMT+08:00 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated Fri Nov 10 16:12:02 GMT+08:00 2017
     */
    int insert(Areas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated Fri Nov 10 16:12:02 GMT+08:00 2017
     */
    int insertSelective(Areas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated Fri Nov 10 16:12:02 GMT+08:00 2017
     */
    Areas selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated Fri Nov 10 16:12:02 GMT+08:00 2017
     */
    int updateByPrimaryKeySelective(Areas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated Fri Nov 10 16:12:02 GMT+08:00 2017
     */
    int updateByPrimaryKey(Areas record);
}