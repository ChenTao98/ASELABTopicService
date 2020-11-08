package com.chentao.aselab.topic.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class TopicUserAndConference {
    @Id
    private Long id;

    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Set<Topic> nTopics = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Topic> getnTopics() {
        return nTopics;
    }

    public void setnTopics(Set<Topic> nTopics) {
        this.nTopics = nTopics;
    }
}
