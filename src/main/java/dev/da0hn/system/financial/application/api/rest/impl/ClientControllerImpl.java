package dev.da0hn.system.financial.application.api.rest.impl;

import dev.da0hn.system.financial.application.api.rest.ClientController;
import dev.da0hn.system.financial.application.api.rest.dto.ClientDetail;
import dev.da0hn.system.financial.application.api.rest.dto.ClientStatement;
import dev.da0hn.system.financial.application.api.rest.dto.NewClientCommand;
import dev.da0hn.system.financial.application.api.rest.dto.NewTransactionCommand;
import dev.da0hn.system.financial.application.api.rest.dto.TransactionDetail;
import dev.da0hn.system.financial.core.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/clients")
public class ClientControllerImpl implements ClientController {

  private final ClientService clientService;

  public ClientControllerImpl(final ClientService clientService) { this.clientService = clientService; }

  @Override
  public ResponseEntity<ClientDetail> create(@RequestBody final NewClientCommand command) {
    return null;
  }

  @Override
  public ResponseEntity<ClientStatement> getStatement(@PathVariable final String accountNumber) {
    return null;
  }

  @Override
  public ResponseEntity<List<TransactionDetail>> getTodayTransactions() {
    return null;
  }

  @Override
  public ResponseEntity<TransactionDetail> makeTransaction(@RequestBody final NewTransactionCommand command) {
    return null;
  }

}
