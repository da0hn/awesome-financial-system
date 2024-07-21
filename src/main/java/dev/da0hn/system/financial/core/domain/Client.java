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
import org.hibernate.annotations.SoftDelete;
import org.hibernate.annotations.SoftDeleteType;

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
@SoftDelete(strategy = SoftDeleteType.DELETED, columnName = "deleted")
public class Client implements Serializable {

  @Serial
  private static final long serialVersionUID = 5913964656486171566L;

  @Id
  @SequenceGenerator(name = "client_seq", sequenceName = "client_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_seq")
  private Long id;

  @Column(name = "client_name", nullable = false, updatable = false)
  @NotBlank(message = "client.name.not-blank")
  private String name;

  @Column(name = "age", nullable = false)
  @NotNull(message = "client.age.not-null")
  @Positive(message = "client.age.positive")
  private Integer age;

  @Column(name = "address", nullable = false)
  @NotBlank(message = "client.address.not-blank")
  private String address;

  @Column(name = "account_number", unique = true, nullable = false, updatable = false)
  @NotBlank(message = "client.account-number.not-blank")
  private String accountNumber;

  @NotNull(message = "client.current-amount.not-null")
  @PositiveOrZero(message = "client.current-amount.positive")
  @Column(name = "balance", nullable = false)
  private BigDecimal balance;

  @NotNull(message = "client.created-at.not-null")
  @Column(name = "created_at", nullable = false, updatable = false)
  private Instant createdAt;

  @NotNull(message = "client.updated-at.not-null")
  @Column(name = "updated_at", nullable = false)
  private Instant updatedAt;

  @NotNull(message = "client.deleted.not-null")
  @Column(name = "deleted", nullable = false)
  private Boolean deleted;

  @Fetch(FetchMode.SUBSELECT)
  @OneToMany(mappedBy = "sender", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<Transaction> sentTransactions = new HashSet<>();

  @Fetch(FetchMode.SUBSELECT)
  @OneToMany(mappedBy = "receiver", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<Transaction> receivedTransactions = new HashSet<>();

}
