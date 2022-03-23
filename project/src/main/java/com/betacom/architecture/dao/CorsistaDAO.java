package com.betacom.architecture.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

import com.betacom.businesscomponent.idgenerator.CorsistaIdGenerator;
import com.betacom.businesscomponent.model.Corsista;

public class CorsistaDAO implements GenericDAO<Corsista>, DAOConstants {
	private CachedRowSet rowSet;

	public static CorsistaDAO getFactory() throws DAOException {
		return new CorsistaDAO();
	}

	private CorsistaDAO() throws DAOException {
		try {

			rowSet = RowSetProvider.newFactory().createCachedRowSet();

		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
	}

	@Override
	public void create(Connection conn, Corsista entity) throws DAOException, ClassNotFoundException, IOException {

		try {
			rowSet.setCommand(SELECT_CORSISTA);
			rowSet.execute(conn);
			rowSet.moveToInsertRow();
			rowSet.updateLong(1, CorsistaIdGenerator.getInstance().getNextId());
			rowSet.updateString(2, entity.getNomeCorsista());
			rowSet.updateString(3, entity.getCognomeCorsista());
			rowSet.updateByte(4, entity.getPrecedentiFormativi());
			rowSet.insertRow();
			rowSet.moveToCurrentRow();
			rowSet.acceptChanges();

		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
	}

	@Override
	public void delete(Connection conn, Corsista entity) throws DAOException {
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(DELETE_CORSISTA);
			ps.setLong(1, entity.getCodCorsista());
			ps.execute();
			conn.commit();
		} catch (SQLException sql) {
			throw new DAOException(sql);
		}

	}

	@Override
	public Corsista getById(Connection conn, long id) throws DAOException {
		PreparedStatement ps;
		Corsista corsista = null;
		try {

			ps = conn.prepareStatement(SELECT_CORSISTA_BYID);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				corsista = new Corsista();
				corsista.setCodCorsista(rs.getInt(1));
				corsista.setNomeCorsista(rs.getString(2));
				corsista.setCognomeCorsista(rs.getString(3));
				corsista.setPrecedentiFormativi(rs.getByte(4));
			}
		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
		return corsista;
	}

	@Override
	public Corsista[] getAll(Connection conn) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}
}
