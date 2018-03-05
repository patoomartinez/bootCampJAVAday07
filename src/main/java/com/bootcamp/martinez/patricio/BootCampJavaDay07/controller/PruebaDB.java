package com.bootcamp.martinez.patricio.BootCampJavaDay07.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.api.mysqla.result.Resultset;

public class PruebaDB {
	public void insertSupplier(int supplierID, String supplierName, String supplierAddress) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PreparedStatement pst = ConexionJDBCs.connection.prepareStatement(
				"INSERT INTO `bootCampJava`.`SUPPLIERS` (`idSUPPLIERS`, `sNAME`, `address`) VALUES (?, ?, ?)");
		pst.setInt(1, supplierID);
		pst.setString(2, supplierName);
		pst.setString(3, supplierAddress);
		pst.execute();
		pst.close();
	}

	public void viewGreenPartsSupplier() {
		try {
			Statement sentenciaSQL = ConexionJDBCs.getConnection().createStatement();
			ResultSet rs = sentenciaSQL.executeQuery(
					"SELECT sNAME, COUNT(pNAME) as 'number' " + "FROM SUPPLIERS NATURAL JOIN CATALOG NATURAL JOIN PARTS"
							+ " WHERE (pCOLOR = 'green') " + " GROUP BY sNAME " + "ORDER BY sNAME;");

			printResultSetII(rs);
			rs.close();
			ConexionJDBCs.desconectar();
		} catch (SQLException ex) {
			System.out.println(ex);
		}
	}

	public void viewGreenAndRedPartsSupplier() {
		try {
			Statement sentenciaSQL = ConexionJDBCs.getConnection().createStatement();
			ResultSet rs = sentenciaSQL.executeQuery("SELECT sNAME as 'supplier name', max(COST) as 'product cost'"
					+ " FROM PARTS natural join SUPPLIERS natural join CATALOG"
					+ " WHERE pCOLOR= 'green' or pCOLOR='red'" + " group by sNAME;");

			printResultSetII(rs);
			rs.close();
			ConexionJDBCs.desconectar();
		} catch (SQLException ex) {
			System.out.println(ex);
		}
	}

	public void printResultSetII(ResultSet rs) throws SQLException {
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnsNumber = rsmd.getColumnCount();
		while (rs.next()) {
			for (int i = 1; i <= columnsNumber; i++) {
				System.out.print(rs.getString(i) + " ");
			}
			System.out.println();
		}
	}

	public void updateSupplier(String oldName, String newName) {

		// System.out.println("INGRESE nombre de supplier a remplazar");

		try {
			PreparedStatement sentenciaSQL = ConexionJDBCs.getConnection().prepareStatement(
					"UPDATE `bootCampJava`.`SUPPLIERS` SET `sNAME`='" + newName + "' WHERE `sNAME`='" + oldName + "';");

			int i = sentenciaSQL.executeUpdate();

			if (i == 1) {
				System.out.println("update executed");
			}
			ConexionJDBCs.desconectar();
		} catch (SQLException ex) {
			System.out.println(ex);
		}
	}

	public void updatePrice(int idSupplier, int idParts) {

		try {
			PreparedStatement sentenciaSQL = ConexionJDBCs.getConnection()
					.prepareStatement("UPDATE `bootCampJava`.`CATALOG`" + " SET `cost`= cost+5 WHERE `idSUPPLIERS`='"
							+ idSupplier + "' and`idPARTS`='" + idParts + "';");

			int i = sentenciaSQL.executeUpdate();

			if (i == 1) {
				System.out.println("update executed");
			}
			ConexionJDBCs.desconectar();
		} catch (SQLException ex) {
			System.out.println(ex);
		}
	}

	public void removeSupplier(String supplierName) {
		try {
			PreparedStatement sentenciaSQL = ConexionJDBCs.getConnection()
					.prepareStatement("DELETE FROM `bootCampJava`.`SUPPLIERS` WHERE `sNAME`='" + supplierName + "';");

			int i = sentenciaSQL.executeUpdate();
			if (i == 1) {
				System.out.println("Ssupplier has been deleted");
			}
			ConexionJDBCs.desconectar();
		} catch (SQLException ex) {
			System.out.println(ex);
		}
	}

}
