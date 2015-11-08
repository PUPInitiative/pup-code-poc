package info.pupcode.model.repo;

import info.pupcode.model.cfg.FriendNetworkConfig;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by fabientronche1 on 23.10.15.
 */
@Repository
public interface NetworkConfigRepository extends CrudRepository<FriendNetworkConfig, Long> {

    @Query("from FriendNetworkConfig f fetch all properties where f.name=?")
    FriendNetworkConfig findByName(@Param("name") String name);
}
