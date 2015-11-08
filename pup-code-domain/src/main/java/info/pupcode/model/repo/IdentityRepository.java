package info.pupcode.model.repo;

import info.pupcode.model.cfg.FriendNetworkConfig;
import info.pupcode.model.cfg.Identity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by fabientronche1 on 08.11.15.
 */
@Repository
public interface IdentityRepository extends CrudRepository<Identity, Long> {

}
