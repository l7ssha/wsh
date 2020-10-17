package xyz.l7ssha.wsh.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xyz.l7ssha.wsh.model.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
    Iterable<Player> getPlayersBySessionId(Long id);
}
