create sequence if not exists transaction_seq start with 1 increment by 1;

create table transactions
(
    id               bigint                      not null default nextval('transaction_seq'),
    external_id      varchar(255)                not null,
    sender_id        bigint                      not null,
    receiver_id      bigint                      not null,
    transaction_type varchar(255)                not null,
    amount           decimal(10, 4)              not null,
    created_at       timestamp without time zone not null default now(),
    constraint pk_transactions primary key (id)
);

alter table transactions
    add constraint uk_transactions_external_id unique (external_id);

alter table transactions
    add constraint fk_transactions_on_receiver foreign key (receiver_id) references clients (id);

alter table transactions
    add constraint fk_transactions_on_sender foreign key (sender_id) references clients (id);
