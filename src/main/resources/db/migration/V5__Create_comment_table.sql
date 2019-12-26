create table comment
(
	id BIGINT auto_increment,
	type INT not null,
	parent_id BIGINT not null,
	commentator int not null,
	gmt_create BIGINT not null,
	gmt_modified BIGINT not null,
	like_count BIGINT default 0,
	constraint comment_pk
		primary key (id)
);

