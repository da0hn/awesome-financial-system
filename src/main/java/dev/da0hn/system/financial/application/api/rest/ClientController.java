package dev.da0hn.system.financial.application.api.rest;

import dev.da0hn.system.financial.application.api.rest.dto.ClientDetail;
import dev.da0hn.system.financial.application.api.rest.dto.ClientStatement;
import dev.da0hn.system.financial.application.api.rest.dto.NewClientCommand;
import dev.da0hn.system.financial.application.api.rest.dto.NewTransactionCommand;
import dev.da0hn.system.financial.application.api.rest.dto.TransactionDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ClientController {

  ResponseEntity<ClientDetail> create(NewClientCommand command);

  ResponseEntity<ClientStatement> getStatement(@PathVariable String accountNumber);

  ResponseEntity<List<TransactionDetail>> getTodayTransactions();

  ResponseEntity<TransactionDetail> makeTransaction(NewTransactionCommand command);

}
