truncate table admin;
truncate table corso;
truncate table corsista;
truncate table corsistacorso;
truncate table docente;

drop table admin cascade constraint;
drop table corso cascade constraint;
drop table corsista cascade constraint;
drop table corsistacorso cascade constraint;
drop table docente cascade constraint;
drop sequence corsista_seq;
drop view corsofreq cascade constraint;