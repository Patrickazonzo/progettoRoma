package com.betacom.architecture.dao;

public interface DAOConstants {
	public String SELECT_CORSISTA = "Select* from corsista";
	public String SELECT_CORSISTA_BYID = "Select * from corsista where codCorsista=?";
	public String DELETE_CORSISTA = "Delete from corsista where codCorsista=?";
	public String DELETE_CORSO = "Delete from corso where codCorso=?";
	public String SELECT_CORSO_BYID = "Select * from corso where codCorso=?";
	public String SELECT_REPORT = "Select * from report";
	public String SELECT_ADMIN_COD = "Select codadmin from admin where nomeadmin = ?,cognomeadmin = ? ";
	public String SELECT_CORSISTA_SEQ = "Select corsista_seq.nextval from dual";
	public String SELECT_CORSO = "Select * from corso";
	public String SELECT_DOC ="select * from docente";
	public String SELECT_COGNOME_DOC = "Select cognomedocente from docente"
			+ "join corso on corso.coddocente = docente.coddocente"
			+ "where corso.codcorso = (select codcorso from corso"
			+ "where nomecorso = '?')";


	public String SELECT_TOT_CORSISTI = "Select count(*) as tot_corsista from corsista";// ok
	public String SELECT_CORSO_PIU_FREQUE = "select nomecorso, conteggio from corsofreq where conteggio = (select max(conteggio) from corsofreq)";
	public String SELECT_DATA_ULTIMO_CORSO = "Select max(datainiziocorso) as dataultimocorso from corso";// ok
	public String SELECT_DURATA_MEDIA_CORSO = "Select AVG(datafinecorso-datainiziocorso) as durata_media_corsi from corso";// ok //giorni lavorativi?
	public String SELECT_NUM_COMMENTI = "Select count(commenticorso) as tot_commenti from corso";// ok
	public String SELECT_ELENCO_CORSISTI = "Select nomecorsista as nome,cognomecorsista as cognome,codcorsista as codice "
			+ "from corsista order by cognomecorsista desc";// ok
	public String SELECT_DOC_CORSO = "SELECT  nomedocente as nome, cognomedocente as cognome, "
			+ "COUNT(*) AS numcorsi FROM docente " + "join corso on corso.coddocente=docente.coddocente "
			+ "GROUP BY nomedocente, cognomedocente having count(*)>1;";// OK
	public String SELECT_POSTI_LIBERI = "Select nomecorso, 12-count(*) as posti_disponibili from corso "
			+ "left join corsistacorso on corso.codcorso=corsistacorso.codcorso " + "GROUP BY corso.nomecorso "
			+ "HAVING count(*)<=12";// ok
	public String SELECT_INFO_CORSISTA = "Select * from corso "
			+ "join corsistacorso on corsistacorso.codcorso=corso.codcorso "
			+ "join corsista on corsista.codcorsista=corsistacorso.codcorsista";
	
	public String INSERT_CORSISTA = "Insert into corsista values(?,?,?,?)";//
	public String SELECT_CORSISTACORSO = "Select * from corsistacorso";// ok

	public String SELECT_DELETE_CORSI = "Select nomecorso from corso " + "where datainiziocorso>CURRENT_DATE";// OK
	

}
