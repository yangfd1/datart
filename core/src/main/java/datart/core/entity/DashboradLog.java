package datart.core.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
public class DashboradLog extends BaseEntity {
    private String userId;

    private String userName;

    private String roleName;

    private String resourceType;

    private String resourceId;

    private String resourceName;

    private String resourceFolder;
}