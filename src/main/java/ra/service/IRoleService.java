package ra.service;

import ra.model.domain.Role;
import ra.model.domain.RoleName;

public interface IRoleService {
    Role findByUsername(RoleName roleName);
}
