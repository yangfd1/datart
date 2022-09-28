package datart.server.service;

import datart.core.entity.DashboradLog;
import datart.core.mappers.DashboardLogMapper;

public interface DashboardLogService extends BaseCRUDService<DashboradLog, DashboardLogMapper> {

    void log(DashboradLog log);

}