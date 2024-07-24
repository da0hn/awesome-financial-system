package dev.da0hn.system.financial.application.api.rest.dto;

import java.math.BigDecimal;
import java.time.Instant;

public record ClientDetail(
  Long id,
  String name,
  Integer age,
  String address,
  String accountNumber,
  BigDecimal balance,
  Instant createdAt,
  Instant updatedAt
) {
}
