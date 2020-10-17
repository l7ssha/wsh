package xyz.l7ssha.wsh.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xyz.l7ssha.wsh.model.Session;

@Repository
public interface SessionRepository extends CrudRepository<Session, Long> {
}
