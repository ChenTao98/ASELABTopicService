package com.chentao.aselab.topic.repository;

import com.chentao.aselab.topic.entity.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Long> {
    Topic findTopicById(Long id);
}
