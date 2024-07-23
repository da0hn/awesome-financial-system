package dev.da0hn.system.financial.core.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Clients")
@Table(name = "clients")
public class Client implements Serializable {

  @Serial
  private static final long serialVersionUID = 5913964656486171566L;

  @Id
  @SequenceGenerator(name = "client_seq", sequenceName = "client_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_seq")
  private Long id;

  @Column(name = "client_name", nullable = false, updatable = false)
  @NotBlank(message = Message.CLIENT_NAME_NOT_BLANK)
  private String name;

  @Column(name = "age", nullable = false)
  @NotNull(message = Message.CLIENT_AGE_NOT_NULL)
  @Positive(message = Message.CLIENT_AGE_POSITIVE)
  private Integer age;

  @Column(name = "address", nullable = false)
  @NotBlank(message = Message.CLIENT_ADDRESS_NOT_BLANK)
  private String address;

  @Column(name = "account_number", unique = true, nullable = false, updatable = false)
  @NotBlank(message = Message.CLIENT_ACCOUNT_NUMBER_NOT_BLANK)
  private String accountNumber;

  @NotNull(message = Message.CLIENT_BALANCE_NOT_NULL)
  @PositiveOrZero(message = Message.CLIENT_BALANCE_POSITIVE_OR_ZERO)
  @Column(name = "balance", nullable = false)
  private BigDecimal balance;

  @NotNull(message = Message.CLIENT_CREATED_AT_NOT_NULL)
  @Column(name = "created_at", nullable = false, updatable = false)
  private Instant createdAt;

  @NotNull(message = Message.CLIENT_UPDATED_AT_NOT_NULL)
  @Column(name = "updated_at", nullable = false)
  private Instant updatedAt;

  @Fetch(FetchMode.SUBSELECT)
  @OneToMany(mappedBy = "sender", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<Transaction> sentTransactions = new HashSet<>();

  @Fetch(FetchMode.SUBSELECT)
  @OneToMany(mappedBy = "receiver", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<Transaction> receivedTransactions = new HashSet<>();

}
