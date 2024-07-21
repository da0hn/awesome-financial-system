package dev.da0hn.system.financial.core.domain;

import java.io.Serial;

public class ResourceNotFoundException extends DomainValidationException {

  @Serial
  private static final long serialVersionUID = 1961885557874047849L;

  public ResourceNotFoundException(final String message) {
    super(message);
  }

}
