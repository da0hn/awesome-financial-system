package dev.da0hn.system.financial.application.api.rest.dto;

import dev.da0hn.system.financial.core.domain.TransactionType;

public record NewTransactionCommand(
  String from,
  String to,
  TransactionType type,
  String amount
) {
}
