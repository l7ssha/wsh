package xyz.l7ssha.wsh.model;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
public class Player {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, length = 20)
    @NonNull
    String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @Nullable
    Session session;

    public Player() { }

    public Player(@NonNull Long id, @NonNull String name, @Nullable Session session) {
        this.id = id;
        this.name = name;
        this.session = session;
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

    @Nullable
    public Session getSession() {
        return session;
    }

    public void setSession(@Nullable Session session) {
        this.session = session;
    }
}
