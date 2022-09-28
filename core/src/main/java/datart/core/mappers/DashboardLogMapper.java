package datart.core.mappers;

import datart.core.entity.DashboradLog;
import datart.core.mappers.ext.CRUDMapper;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DashboardLogMapper extends CRUDMapper {

    @Insert({
        "insert into dashboard_log (id, `user_id`, ",
        "user_name, role_name, ",
        "resource_type, resource_id, ",
        "resource_name, resource_folder, ",
        "create_by,create_time, ",
            "update_by,update_time)",
        "values (#{id,jdbcType=VARCHAR}, #{userId,jdbcType=VARCHAR}, ",
        "#{userName,jdbcType=VARCHAR}, #{roleName,jdbcType=VARCHAR}, ",
        "#{resourceType,jdbcType=VARCHAR}, #{resourceId,jdbcType=VARCHAR}, ",
        "#{resourceName,jdbcType=VARCHAR}, #{resourceFolder,jdbcType=VARCHAR}, ",
        "#{createBy,jdbcType=VARCHAR},#{createTime,jdbcType=TIMESTAMP},",
         "#{updateBy,jdbcType=VARCHAR},#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(DashboradLog log);

}