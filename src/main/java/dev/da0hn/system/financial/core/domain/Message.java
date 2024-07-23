package dev.da0hn.system.financial.core.domain;

public final class Message {

  public static final String CLIENT_NAME_NOT_BLANK = "client.name.not-blank";

  public static final String CLIENT_AGE_NOT_NULL = "client.age.not-null";

  public static final String CLIENT_AGE_POSITIVE = "client.age.positive";

  public static final String CLIENT_ADDRESS_NOT_BLANK = "client.address.not-blank";

  public static final String CLIENT_ACCOUNT_NUMBER_NOT_BLANK = "client.account-number.not-blank";

  public static final String CLIENT_BALANCE_NOT_NULL = "client.balance.not-null";

  public static final String CLIENT_BALANCE_POSITIVE_OR_ZERO = "client.balance.positive-or-zero";

  public static final String CLIENT_CREATED_AT_NOT_NULL = "client.created-at.not-null";

  public static final String CLIENT_UPDATED_AT_NOT_NULL = "client.updated-at.not-null";

  public static final String TRANSACTION_EXTERNAL_ID = "transaction.external-id.not-null";

  public static final String TRANSACTION_SENDER_NOT_NULL = "transaction.sender.not-null";

  public static final String TRANSACTION_RECEIVER_NOT_NULL = "transaction.receiver.not-null";

  public static final String TRANSACTION_TYPE_NOT_NULL = "transaction.type.not-null";

  public static final String TRANSACTION_AMOUNT_NOT_NULL = "transaction.amount.not-null";

  public static final String TRANSACTION_AMOUNT_POSITIVE = "transaction.amount.positive";

  public static final String TRANSACTION_CREATED_AT_NOT_NULL = "transaction.created-at.not-null";

  private Message() { }

}
