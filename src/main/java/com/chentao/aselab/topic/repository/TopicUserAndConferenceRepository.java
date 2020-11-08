package com.chentao.aselab.topic.repository;

import com.chentao.aselab.topic.entity.TopicUserAndConference;
import org.springframework.data.repository.CrudRepository;

public interface TopicUserAndConferenceRepository extends CrudRepository<TopicUserAndConference,Long> {
    TopicUserAndConference findTopicUserAndConferenceById(Long id);
}
