create table if not exists lesson_1_employee
(
    id            serial,
    email         varchar(255) unique,
    first_name    varchar(255),
    last_name     varchar(255),
    created_date  bigint not null
)
