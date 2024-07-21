package dev.da0hn.system.financial.core.domain;

import java.io.Serial;

public class DomainValidationException extends RuntimeException {

  @Serial
  private static final long serialVersionUID = -6098717522969739537L;

  public DomainValidationException() {
  }

  public DomainValidationException(final String message) {
    super(message);
  }

  public DomainValidationException(final String message, final Throwable cause) {
    super(message, cause);
  }

}
