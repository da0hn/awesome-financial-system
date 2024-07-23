create sequence if not exists client_seq start with 1 increment by 1;

CREATE TABLE clients
(
    id             bigint                      not null default nextval('client_seq'),
    balance        decimal(10, 4)              not null,
    client_name    varchar(255)                not null,
    age            integer                     not null,
    address        varchar(255)                not null,
    account_number varchar(255)                not null,
    created_at     timestamp without time zone not null default now(),
    updated_at     timestamp without time zone not null default now(),
    constraint pk_clients primary key (id)
);

alter table clients
    add constraint uk_clients_account_number unique (account_number);
