package dev.da0hn.system.financial.core.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transactions")
@Entity(name = "Transactions")
public class Transaction implements Serializable {

  @Serial
  private static final long serialVersionUID = 2612523049791142796L;

  @Id
  @SequenceGenerator(name = "transaction_seq", sequenceName = "transaction_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transaction_seq")
  private Long id;

  @NotNull(message = Message.TRANSACTION_EXTERNAL_ID)
  @Column(name = "external_id", unique = true, nullable = false, updatable = false)
  private String externalId;

  @NotNull(message = Message.TRANSACTION_SENDER_NOT_NULL)
  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  @JoinColumn(name = "sender_id", nullable = false, updatable = false)
  private Client sender;

  @NotNull(message = Message.TRANSACTION_RECEIVER_NOT_NULL)
  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  @JoinColumn(name = "receiver_id", nullable = false, updatable = false)
  private Client receiver;

  @NotNull(message = Message.TRANSACTION_TYPE_NOT_NULL)
  @Column(name = "transaction_type", nullable = false)
  @Enumerated(EnumType.STRING)
  private Type type;

  @NotNull(message = Message.TRANSACTION_AMOUNT_NOT_NULL)
  @Positive(message = Message.TRANSACTION_AMOUNT_POSITIVE)
  @Column(name = "amount", nullable = false)
  private BigDecimal amount;

  @NotNull(message = Message.TRANSACTION_CREATED_AT_NOT_NULL)
  @Column(name = "created_at", nullable = false, updatable = false)
  private Instant createdAt;

  public enum Type {
    DEPOSIT,
    WITHDRAW
  }

}
