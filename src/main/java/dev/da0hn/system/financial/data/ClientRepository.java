package dev.da0hn.system.financial.data;

import dev.da0hn.system.financial.core.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
