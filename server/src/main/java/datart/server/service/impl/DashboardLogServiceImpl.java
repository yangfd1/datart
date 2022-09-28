/*
 * Datart
 * <p>
 * Copyright 2021
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package datart.server.service.impl;

import datart.core.entity.*;
import datart.core.mappers.DashboardLogMapper;
import datart.server.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class DashboardLogServiceImpl extends BaseService implements DashboardLogService {

    private final DashboardLogMapper dashboardLogMapper;


    public DashboardLogServiceImpl(DashboardLogMapper dashboardLogMapper) {
        this.dashboardLogMapper = dashboardLogMapper;
    }
    @Override
    @Transactional
    public void log(DashboradLog dashboradLog) {
        dashboardLogMapper.insert(dashboradLog);
    }

    @Override
    public void requirePermission(DashboradLog entity, int permission) {
        return;
    }
}
