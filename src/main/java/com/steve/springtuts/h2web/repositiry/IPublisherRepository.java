package com.steve.springtuts.h2web.repositiry;

import com.steve.springtuts.h2web.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface IPublisherRepository extends CrudRepository<Publisher, Long> {
}
