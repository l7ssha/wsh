package xyz.l7ssha.wsh.service;

import org.springframework.stereotype.Service;
import xyz.l7ssha.wsh.model.Player;
import xyz.l7ssha.wsh.model.Session;
import xyz.l7ssha.wsh.repository.PlayerRepository;
import xyz.l7ssha.wsh.repository.SessionRepository;

import java.util.Map;

@Service
public class GameService {
    private final PlayerRepository playerRepository;
    private final SessionRepository sessionRepository;

    public GameService(PlayerRepository playerRepository, SessionRepository sessionRepository) {
        this.playerRepository = playerRepository;
        this.sessionRepository = sessionRepository;
    }

    public Session saveNewSession(String name) {
        var session = new Session();
        session.setName(name);

        return sessionRepository.save(session);
    }

    public Player saveNewPlayer(String name) {
        var player = new Player();
        player.setName(name);

        return playerRepository.save(player);
    }

    public Iterable<Player> fetchPlayersForSession(Long sessionId) {
        return playerRepository.getPlayersBySessionId(sessionId);
    }
}
