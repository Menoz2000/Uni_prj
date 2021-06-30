insert into ingrediente VALUES
(1,'ghiaccio a cubetti','analcolico',0,NULL),
(2,'gin','alcolico',40,NULL),
(3,'acqua tonica','analcolico',0,NULL),
(4,'scorza di limone','analcolico',0,NULL)

select * from ingrediente

insert into origine VALUES
(1,'inghilterra','')

insert into tipo VALUES
(1,'long drink','')

insert into cocktail VALUES
(1,'gin tonic',4,1,1,1,'',1,0,NULL)

insert into composizione VALUES
(1,1,1),(1,2,1),(1,3,3),(1,4,1)

select c.id,c.nome,c.grado_alcolico,c.preferito,c.descrizione,c.iconico,c.mine,o.nome,t.nome,i.nome as nome_ingrediente,i.tipo as tipologia_ingrediente,i.grado_alcolico as grado_alcolico_ingrediente
from cocktail c
join origine o on (o.id=c.id)
join tipo t on (t.id=c.id)
join composizione ci on (ci.fk_cocktail=c.id)
join ingrediente i on (ci.fk_ingrediente=i.id)

