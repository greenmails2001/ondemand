-- drop table Auto_Mail_Messages;
Create table Auto_Mail_Messages (
    amm_id Number ,
    amm_code varchar2(30) not null,
    message_type Varchar2(30) not null,
    message_title Varchar2(1000) not null,
    message_body varchar2(4000) not null,
    description varchar2(4000) not null,
    created_by varchar2(30) not null,
    create_date date not null,
    modified_by varchar2(4000),
    modify_date date
);

alter table Auto_Mail_Messages
  add constraint amm_pk primary key (amm_ID);
  
alter table AUTO_MAIL_MESSAGES
  add constraint AMM_UK unique (AMM_CODE); 
  
create sequence amm_seq;   
  
create sequence Amh_Seq;

-- drop table Auto_mail_histories;
Create table Auto_mail_histories (
    amh_id number ,
    message_type Varchar2(30) not null,
    message_title Varchar2(1000) not null,
    message_body varchar2(4000) not null,
    description varchar2(4000) not null,
    created_by varchar2(30) not null,
    create_date date not null,
    modified_by varchar2(4000),
    modify_date date,
    send_state Varchar2(1) default 'N'  
);

alter table AUTO_MAIL_HISTORIES
  add constraint AMH_PK primary key (AMH_ID);

 
