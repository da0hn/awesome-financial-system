package dev.da0hn.system.financial.core.service;

import dev.da0hn.system.financial.application.api.rest.dto.ClientDetail;
import dev.da0hn.system.financial.application.api.rest.dto.ClientStatement;
import dev.da0hn.system.financial.application.api.rest.dto.NewClientCommand;
import dev.da0hn.system.financial.application.api.rest.dto.NewTransactionCommand;
import dev.da0hn.system.financial.application.api.rest.dto.TransactionDetail;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ClientService {

  ClientDetail create(NewClientCommand command);

  ClientStatement getStatement(@PathVariable String accountNumber);

  List<TransactionDetail> getTodayTransactions();

  TransactionDetail makeTransaction(NewTransactionCommand command);

}
