package info.pupcode.model.repo;

import info.pupcode.model.cfg.Peer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by fabientronche1 on 23.10.15.
 */
@Repository
public interface PeerRepository extends CrudRepository<Peer, Long> {

}
