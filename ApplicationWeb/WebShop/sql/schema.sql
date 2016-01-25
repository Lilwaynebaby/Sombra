-- roles
-- noinspection SqlDialectInspection
create table roles (
		uid serial primary key,
		name varchar(200)
);

-- users
-- noinspection SqlDialectInspection
create table users (
		uid serial primary key,
		login varchar(200),
		email varchar(200),
		role_id int not null references roles(uid)
);
create table product (
		uid serial primary key,
		name varchar(200),
		description varchar(200)
);