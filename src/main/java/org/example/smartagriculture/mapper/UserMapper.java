package org.example.smartagriculture.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.example.smartagriculture.model.User;
import org.example.smartagriculture.model.UserExample;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smart_user
     *
     * @mbg.generated Fri Jul 12 10:38:30 CST 2024
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smart_user
     *
     * @mbg.generated Fri Jul 12 10:38:30 CST 2024
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smart_user
     *
     * @mbg.generated Fri Jul 12 10:38:30 CST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smart_user
     *
     * @mbg.generated Fri Jul 12 10:38:30 CST 2024
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smart_user
     *
     * @mbg.generated Fri Jul 12 10:38:30 CST 2024
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smart_user
     *
     * @mbg.generated Fri Jul 12 10:38:30 CST 2024
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smart_user
     *
     * @mbg.generated Fri Jul 12 10:38:30 CST 2024
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smart_user
     *
     * @mbg.generated Fri Jul 12 10:38:30 CST 2024
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smart_user
     *
     * @mbg.generated Fri Jul 12 10:38:30 CST 2024
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smart_user
     *
     * @mbg.generated Fri Jul 12 10:38:30 CST 2024
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smart_user
     *
     * @mbg.generated Fri Jul 12 10:38:30 CST 2024
     */
    int updateByPrimaryKey(User record);

    User getUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}