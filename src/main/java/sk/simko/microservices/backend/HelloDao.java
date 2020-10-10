package sk.simko.microservices.backend;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloDao extends JpaRepository<Hello, Long> {
}
