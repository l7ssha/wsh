package xyz.l7ssha.wsh.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.List;

@Entity
public class Session {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, length = 20)
    @NonNull
    String name;

    @OneToMany(mappedBy = "session")
    List<Player> players;

    public Session() { }

    public Session(@NonNull Long id, @NonNull String name) {
        this.id = id;
        this.name = name;
    }

    @NonNull
    public Long getId() {
        return id;
    }

    public void setId(@NonNull Long id) {
        this.id = id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
