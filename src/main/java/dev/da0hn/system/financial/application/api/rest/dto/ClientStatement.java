package dev.da0hn.system.financial.application.api.rest.dto;

import java.util.List;

public record ClientStatement(
  ClientDetail client,
  List<TransactionDetail> transactions
) {
}
