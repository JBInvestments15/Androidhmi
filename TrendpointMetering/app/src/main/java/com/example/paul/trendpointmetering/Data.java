package com.example.paul.trendpointmetering;


import net.wimpi.modbus.msg.ReadInputRegistersResponse;
import net.wimpi.modbus.wrapper.ModbusTCPClient;

public class Data {
	double PQM_V_phase_1 = 0;
	double PQM_V_phase_2 = 0;
	double PQM_V_phase_3 = 0;
	double PQM_A_phase_1_low = 0;
	double PQM_A_phase_1_high = 0;
	double PQM_A_phase_2_low = 0;
	double PQM_A_phase_2_high = 0;
	double PQM_A_phase_3_low = 0;
	double PQM_A_phase_3_high = 0;
	double PQM_PF_phase_1 = 0;
	double PQM_PF_phase_2 = 0;
	double PQM_PF_phase_3 = 0;
	double PQM_kW_phase_1_low = 0;
	double PQM_kW_phase_1_high = 0;
	double PQM_kW_phase_2_low = 0;
	double PQM_kW_phase_2_high = 0;
	double PQM_kW_phase_3_low = 0;
	double PQM_kW_phase_3_high = 0;
	double PQM_kWh_phase_1_low = 0;
	double PQM_kWh_phase_1_high = 0;
	double PQM_kWh_phase_2_low = 0;
	double PQM_kWh_phase_2_high = 0;
	double PQM_kWh_phase_3_low = 0;
	double PQM_kWh_phase_3_high = 0;
	double PQM_V_allPhases = 0;
	double PQM_A_allPhases_low = 0;
	double PQM_A_allPhases_high = 0;
	double PQM_PF_allPhases = 0;
	double PQM_kW_allPhases_low = 0;
	double PQM_kW_allPhases_high = 0;
	double PQM_kWh_allPhases_low = 0;
	double PQM_kWh_allPhases_high = 0;
	double PQM_A_phase_N_low = 0;
	double PQM_A_phase_N_high = 0;
	double PQM_VTHD_phase_1 = 0;
	double PQM_VTHD_phase_2 = 0;
	double PQM_VTHD_phase_3 = 0;
	double PQM_ITHD_phase_1 = 0;
	double PQM_ITHD_phase_2 = 0;
	double PQM_ITHD_phase_3 = 0;
	
	SQLiteJDBC SQLite = new SQLiteJDBC();

	public void setPQM_V_phase_1(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_V_phase_1");
	      this.PQM_V_phase_1 = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	public double getPQM_V_phase_1() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_V_phase_2(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_V_phase_2");
	      this.PQM_V_phase_2 = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	public double getPQM_V_phase_2() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_V_phase_3(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_V_phase_3");
	      this.PQM_V_phase_3 = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	public double getPQM_V_phase_3() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_A_phase_1_low(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_A_phase_1_low");
	      this.PQM_A_phase_1_low = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_A_phase_1_low() {
	       return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_A_phase_1_high(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_A_phase_1_high");
	      this.PQM_A_phase_1_high = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_A_phase_1_high() {
	      return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	
	
	public void setPQM_A_phase_2_low(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_A_phase_2_low");
	      this.PQM_A_phase_2_low = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_A_phase_2_low() {
	       return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_A_phase_2_high(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_A_phase_2_high");
	      this.PQM_A_phase_2_high = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_A_phase_2_high() {
	      return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_A_phase_3_low(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_A_phase_3_low");
	      this.PQM_A_phase_3_low = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_A_phase_3_low() {
	       return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_A_phase_3_high(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_A_phase_3_high");
	      this.PQM_A_phase_3_high = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_A_phase_3_high() {
	      return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }	
	
	public void setPQM_PF_phase_1(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_PF_phase_1");
	      this.PQM_PF_phase_1 = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_PF_phase_1() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }	
	
	public void setPQM_PF_phase_2(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_PF_phase_2");
	      this.PQM_PF_phase_2 = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_PF_phase_2() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }	
	
	public void setPQM_PF_phase_3(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_PF_phase_3");
	      this.PQM_PF_phase_3 = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_PF_phase_3() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }	
	
	public void setPQM_kW_phase_1_low(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_kW_phase_1_low");
	      this.PQM_kW_phase_1_low = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_kW_phase_1_low() {
	       return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_kW_phase_1_high(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_kW_phase_1_high");
	      this.PQM_kW_phase_1_high = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_kW_phase_1_high() {
	      return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_kW_phase_2_low(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_kW_phase_2_low");
	      this.PQM_kW_phase_2_low = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_kW_phase_2_low() {
	       return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_kW_phase_2_high(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_kW_phase_2_high");
	      this.PQM_kW_phase_2_high = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_kW_phase_2_high() {
	      return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_kW_phase_3_low(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_kW_phase_3_low");
	      this.PQM_kW_phase_3_low = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_kW_phase_3_low() {
	       return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_kW_phase_3_high(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_kW_phase_3_high");
	      this.PQM_kW_phase_3_high = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_kW_phase_3_high() {
	      return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_kWh_phase_1_low(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_kWh_phase_1_low");
	      this.PQM_kWh_phase_1_low = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_kWh_phase_1_low() {
	       return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_kWh_phase_1_high(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_kWh_phase_1_high");
	      this.PQM_kWh_phase_1_high = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_kWh_phase_1_high() {
	      return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_kWh_phase_2_low(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_kWh_phase_2_low");
	      this.PQM_kWh_phase_2_low = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_kWh_phase_2_low() {
	       return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_kWh_phase_2_high(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_kWh_phase_2_high");
	      this.PQM_kWh_phase_2_high = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_kWh_phase_2_high() {
	      return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_kWh_phase_3_low(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_kWh_phase_3_low");
	      this.PQM_kWh_phase_3_low = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_kWh_phase_3_low() {
	       return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_kWh_phase_3_high(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_kWh_phase_3_high");
	      this.PQM_kWh_phase_3_high = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_kWh_phase_3_high() {
	      return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_V_allPhases(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_V_allPhases");
	      this.PQM_V_allPhases = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_V_allPhases() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_A_allPhases_low(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_A_allPhases_low");
	      this.PQM_A_allPhases_low = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_A_allPhases_low() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }	
		
	public void setPQM_A_allPhases_high(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_A_allPhases_high");
	      this.PQM_A_allPhases_high = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_A_allPhases_high() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }	
	
	public void setPQM_PF_allPhases(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_PF_allPhases");
	      this.PQM_PF_allPhases = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_PF_allPhases() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_kW_allPhases_low(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_kW_allPhases_low");
	      this.PQM_kW_allPhases_low = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_kW_allPhases_low() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }	
		
	public void setPQM_kW_allPhases_high(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_kW_allPhases_high");
	      this.PQM_kW_allPhases_high = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_kW_allPhases_high() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }	
	
	public void setPQM_kWh_allPhases_low(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_kWh_allPhases_low");
	      this.PQM_kWh_allPhases_low = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_kWh_allPhases_low() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }	
		
	public void setPQM_kWh_allPhases_high(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_kWh_allPhases_high");
	      this.PQM_kWh_allPhases_high = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_kWh_allPhases_high() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }	
	
	public void setPQM_A_phase_N_low(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_A_phase_N_low");
	      this.PQM_A_phase_N_low = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_A_phase_N_low() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }	
		
	public void setPQM_A_phase_N_high(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_A_phase_N_high");
	      this.PQM_A_phase_N_high = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public double getPQM_A_phase_N_high() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }	
	
	public void setPQM_VTHD_phase_1(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_VTHD_phase_1");
	      this.PQM_VTHD_phase_1 = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	public double getPQM_VTHD_phase_1() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_VTHD_phase_2(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_VTHD_phase_2");
	      this.PQM_VTHD_phase_2 = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	public double getPQM_VTHD_phase_2() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_VTHD_phase_3(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_VTHD_phase_3");
	      this.PQM_VTHD_phase_3 = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	public double getPQM_VTHD_phase_3() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_ITHD_phase_1(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_ITHD_phase_1");
	      this.PQM_ITHD_phase_1 = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	public double getPQM_ITHD_phase_1() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_ITHD_phase_2(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_ITHD_phase_2");
	      this.PQM_ITHD_phase_2 = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	public double getPQM_ITHD_phase_2() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	
	public void setPQM_ITHD_phase_3(ReadInputRegistersResponse data) {
	      SQLiteJDBC.WriteToDatabase( data, "PQM_ITHD_phase_3");
	      this.PQM_ITHD_phase_3 = Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	public double getPQM_ITHD_phase_3() {
		  return Double.parseDouble(SQLite.getSingleDataPointFromDB("Data"));
	   }
	

}
