show databases;
create database vmap4;
use vmap4;
# drop database vmap4;
show engines;
show variables like "have%";
show variables like "default_storage_engine";
set default_storage_engine=MyISAM;
set default_storage_engine=InnoDB;
show variables like "%storage_engine%";
create table main_list(
    
);