
create table human
(
    id bigserial primary key,
    fio varchar(100) not null,
    birthday date not null,
    gender varchar(8) not null,
    number_of_children bigint
);

create table head_department
(
    id bigint primary key references human on delete cascade
);


create table department
(
    id bigserial primary key,
    name varchar(100) not null unique,
    head_department_id bigint not null references head_department
);


create table brigade
(
    id bigserial primary key,
    name varchar(100) not null unique,
    department_id bigint not null references department on delete cascade
);


create table employee
(
    id 	bigint 	primary key references human on delete cascade,
    brigade_id bigint not null references  brigade,
    start_work_experience_date date not null,
    salary bigint check ( salary > 0 )
);


create table medical_examination
(
    id bigserial primary key,
    employee_id bigint not null references employee on delete cascade,
    medical_examination_date date not null,
    is_passed boolean not null
);


create table plane_type
(
    id bigserial primary key,
    name varchar(100) not null,
    capacity integer not null,
    speed integer not null
);


create table plane
(
    id bigserial primary key,
    type_id bigint not null references plane_type,
    techical_brigade_id bigint not null references brigade,
    pilot_brigade_id bigint not null references brigade,
    service_brigade_id bigint not null references brigade,
    start_using_date date not null
);


create table repair
(
    id bigserial primary key,
    plane_id bigint	not null references plane on delete cascade,
    start_time timestamp not null,
    end_time timestamp not null
);


create table technical_inspection
(
    id bigserial primary key,
    plane_id bigint 	not null references plane on delete cascade,
    inspection_time timestamp not null,
    is_executed_inspection boolean not null
);


create table town
(
    id bigserial primary key,
    name varchar(50) not null,
    distance integer not null
);


create table flight
(
    id bigserial primary key,
    type varchar(30) not null,
    plane_id bigint not null references plane,
    town_id bigint not null references town,
    flight_time timestamp not null,
    is_cancelled boolean not null,
    is_departure_abroad boolean not null
);

create table flight_delay
(
    flight_id bigint not null references flight on delete cascade,
    delay_reason varchar(50) not null
);

create table passenger
(
    id bigint primary key references human on delete cascade

);

create table ticket
(
    id bigserial primary key,
    passenger_id bigint not null references passenger,
    flight_id bigint not null references flight on delete cascade,
    status varchar(30) not null,
    is_luggage boolean not null,
    price float not null
);


create table agency
(
    flight_id bigint references flight,
    ticket_id bigint references ticket,
    primary key (flight_id,ticket_id)
);