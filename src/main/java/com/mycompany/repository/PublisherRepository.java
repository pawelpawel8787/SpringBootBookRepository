package com.mycompany.repository;

import com.mycompany.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by HP on 2018-01-13.
 */
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
