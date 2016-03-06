# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table job (
  title                     varchar(255),
  description               TEXT,
  link                      varchar(255),
  category                  varchar(255))
;

create table studies (
  sp_name                   varchar(255),
  length                    float,
  url                       varchar(255),
  field_name                varchar(255),
  area_name                 varchar(255),
  executor_name             varchar(255),
  overlord_name             varchar(255),
  sp_city_name              varchar(255),
  active                    boolean,
  coordinates               varchar(255),
  hzz_categories            varchar(255))
;




# --- !Downs

drop table if exists job cascade;

drop table if exists studies cascade;

