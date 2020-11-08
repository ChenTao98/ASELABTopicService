package com.chentao.aselab.topic.repository;

import com.chentao.aselab.topic.entity.Topic;
import com.chentao.aselab.topic.entity.TopicAndConference;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface TopicAndConferenceRepository extends CrudRepository<TopicAndConference,Long> {
    TopicAndConference findTopicAndConferenceById(Long id);
}
