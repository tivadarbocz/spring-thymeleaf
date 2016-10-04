package hu.tb.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by Tivadar Bocz on 2016.10.04..
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Serializable>{

    @Query(value = "SELECT r FROM Role r ")
    Set<Role> getUserRoles();
    /*
    @Query(value = "SELECT r FROM Role r WHERE r.id in (SELECT uxr.user_role_id FROM user_x_role uxr WHERE uxr.user_id = 1)", nativeQuery = true)
    Set<Role> getUserRolesByUserId(@Param("userId") int userId);
     */
}
