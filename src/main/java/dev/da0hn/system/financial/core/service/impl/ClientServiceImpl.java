package dev.da0hn.system.financial.core.service.impl;

import dev.da0hn.system.financial.application.api.rest.dto.ClientDetail;
import dev.da0hn.system.financial.application.api.rest.dto.ClientStatement;
import dev.da0hn.system.financial.application.api.rest.dto.NewClientCommand;
import dev.da0hn.system.financial.application.api.rest.dto.NewTransactionCommand;
import dev.da0hn.system.financial.application.api.rest.dto.TransactionDetail;
import dev.da0hn.system.financial.core.service.ClientService;
import dev.da0hn.system.financial.data.ClientRepository;
import dev.da0hn.system.financial.data.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

  private final ClientRepository clientRepository;

  private final TransactionRepository transactionRepository;

  public ClientServiceImpl(final ClientRepository clientRepository, final TransactionRepository transactionRepository) {
    this.clientRepository = clientRepository;
    this.transactionRepository = transactionRepository;
  }

  @Override
  public ClientDetail create(final NewClientCommand command) {
    return null;
  }

  @Override
  public ClientStatement getStatement(final String accountNumber) {
    return null;
  }

  @Override
  public List<TransactionDetail> getTodayTransactions() {
    return List.of();
  }

  @Override
  public TransactionDetail makeTransaction(final NewTransactionCommand command) {
    return null;
  }

}
