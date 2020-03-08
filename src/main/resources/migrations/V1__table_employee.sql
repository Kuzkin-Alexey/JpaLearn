create table if not exists employee
(
    id           bigserial,
    email        varchar(255) unique,
    first_name   varchar(255),
    last_name    varchar(255),
    created_date bigint
)
