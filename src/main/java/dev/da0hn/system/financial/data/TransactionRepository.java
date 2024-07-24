package dev.da0hn.system.financial.data;

import dev.da0hn.system.financial.core.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
