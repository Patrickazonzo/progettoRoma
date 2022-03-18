create table admin (
codadmin int,
nomeadmin varchar2 (30),
cognomeadmin varchar2 (30),
constraint p_codadmin primary key (codadmin));

create table docente (
coddocente int,
nomedocente varchar2(30),
cognomedocente varchar2(30),
constraint p_coddocente primary key (coddocente));

create table corsista (
codcorsista int,
nomecorsista varchar2(30),
cognomecorsista varchar2(30),
precedentiformativi varchar2(500),
constraint p_codcorsista primary key (codcorsista));

create table corso (
codcorso int,
nomecorso varchar2(30),
datainiziocorso date,
datafinecorso date,
costocorso number(8,2),
commenticorso varchar2(500),
aulacorso number(2),
coddocente int,
constraint p_codcorso primary key(codcorso),
constraint f_coddocente foreign key(coddocente) references docente(coddocente) on delete cascade);

create table corsistacorso (
codcorsista int,
codcorso int,
constraint p_cc primary key (codcorsista,codcorso),
constraint f_codcorsista foreign key (codcorsista) references corsista(codcorsista) on delete cascade,
constraint f_codcorso foreign key (codcorso) references corso(codcorso) on delete cascade);













