Link Name   : adminlink
Connection  : Successful 
DB Name     : PERP.REGRESS.RDBMS.DEV.US.ORACLE.COM
DB Version  : Oracle Database 10g Enterprise Edition Release 10.2.0.3.0 - Prod

drop database link ADMINLINK;
--
create database link ADMINLINK
  connect to perp_sas_env identified by "perp_sas_env"
  using 'db10g';


Select * from dual@ADMINLINK
