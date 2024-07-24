package dev.da0hn.system.financial.application.api.rest.dto;

import dev.da0hn.system.financial.core.domain.TransactionType;

import java.math.BigDecimal;
import java.time.Instant;

public record TransactionDetail(
  String externalId,
  String from,
  String to,
  TransactionType type,
  BigDecimal amount,
  Instant createdAt
) {
}
