package dev.da0hn.system.financial.application.api.rest.dto;

public record NewClientCommand(
  String name,
  Integer age,
  String address,
  String accountNumber
) {
}
