create schema if not exists delta;

create table if not exists delta.customers (
    id serial primary key,
    name varchar(255) not null
);
