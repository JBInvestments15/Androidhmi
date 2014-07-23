package com.example.paul.trendpointmetering;

import java.net.InetAddress;
import java.net.UnknownHostException;

import net.wimpi.modbus.wrapper.ModbusTCPClient;

public class DataController {

	private Data model;
	private DataView view;
	ModbusTCPClient MBTCP = new ModbusTCPClient();
	public DataController(Data model, DataView view)
	{
		this.model = model;
		this.view = view;
	}
	
	
	public void addDataPointVPhase1(){
		
		String astr = "67.109.50.149";
		
        InetAddress addr = null;
		try {
			addr = InetAddress.getByName(astr);
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String address = addr.toString();
		try {
			model.setPQM_V_phase_1(MBTCP.readInputRegisters("5200", "1", address));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
public void addDataPointVPhase2(){
		
		String astr = "67.109.50.149";
		
        InetAddress addr = null;
		try {
			addr = InetAddress.getByName(astr);
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String address = addr.toString();
		try {
			model.setPQM_V_phase_2(MBTCP.readInputRegisters("5200", "1", address));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}






public void addDataPointVPhase3(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_V_phase_3(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}







public void addDataPointAPhase1low(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_A_phase_1_low(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}






public void addDataPointAPhase1high(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_A_phase_1_high(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}






public void addDataPointAPhase2low(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_A_phase_2_low(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}






public void addDataPointAPhase2high(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_A_phase_2_high(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}






public void addDataPointAPhase3low(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_A_phase_3_low(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}






public void addDataPointAPhase3high(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_A_phase_3_high(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}






public void addDataPointPFPhase1(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_PF_phase_1(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}






public void addDataPointPFPhase2(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_PF_phase_2(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}






public void addDataPointPFPhase3(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_PF_phase_3(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}





public void addDataPointkWPhase1low(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_kW_phase_1_low(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}






public void addDataPointkWPhase1high(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_kW_phase_1_high(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}







public void addDataPointkWPhase2low(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_kW_phase_2_low(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}







public void addDataPointkWPhase2high(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_kW_phase_2_high(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}







public void addDataPointkWPhase3low(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_kW_phase_3_low(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}






public void addDataPointkWPhase3high(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_kW_phase_3_high(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}







public void addDataPointkWhPhase1low(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_kWh_phase_1_low(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}







public void addDataPointkWhPhase1high(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_kWh_phase_1_high(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}







public void addDataPointkWhPhase2low(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_kWh_phase_2_low(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}






public void addDataPointkWhPhase2high(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_kWh_phase_2_high(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}








public void addDataPointkWhPhase3low(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_kWh_phase_3_low(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}







public void addDataPointkWhPhase3high(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_kWh_phase_3_high(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}







public void addDataPointVallPhases(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_V_allPhases(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}






public void addDataPointAallPhaseslow(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_A_allPhases_low(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}






public void addDataPointAPhaseshigh(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_A_allPhases_high(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}






public void addDataPointPFallPhases(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_PF_allPhases(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}








public void addDataPointkWallPhaseslow(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_kW_allPhases_low(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}







public void addDataPointkWallPhaseshigh(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_kW_allPhases_high(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}







public void addDataPointkWhallPhaseslow(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_kWh_allPhases_low(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}









public void addDataPointkWhallPhaseshigh(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_kWh_allPhases_high(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}







public void addDataPointAPhaseNlow(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_A_phase_N_low(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}








public void addDataPointAPhaseNhigh(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_A_phase_N_high(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}









public void addDataPointVTHDPhase1(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_VTHD_phase_1(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}









public void addDataPointVTHDPhase2(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_VTHD_phase_2(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}









public void addDataPointVTHDPhase3(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_VTHD_phase_3(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}









public void addDataPointITHDPhase1(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_ITHD_phase_1(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}









public void addDataPointITHDPhase2(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_ITHD_phase_2(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}








public void addDataPointITHDPhase3(){
	
	String astr = "67.109.50.149";
	
    InetAddress addr = null;
	try {
		addr = InetAddress.getByName(astr);
	} catch (UnknownHostException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String address = addr.toString();
	try {
		model.setPQM_ITHD_phase_3(MBTCP.readInputRegisters("5200", "1", address));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}






	
	public String getVPhase1(){
		 	 
		return view.getVPhase1();	
	}
	
	public String getVPhase2(){
	 	 
		return view.getVPhase2();	
	}
	
	public String getVPhase3(){
	 	 
		return view.getVPhase3();	
	}
	
	public String getAPhase1(){
		return view.getAPhase1();	
	}
	
	public String getAPhase2(){
		return view.getAPhase2();	
	}
	
	public String getAPhase3(){
		return view.getAPhase3();	
	}
	
	public String getPFPhase1(){
		return view.getPFPhase1();	
	}
	
	public String getPFPhase2(){
		return view.getPFPhase2();	
	}
	
	public String getPFPhase3(){
		return view.getPFPhase3();	
	}
	
	public String getkWPhase1(){
		return view.getkWPhase1();	
	}
	
	public String getkWPhase2(){
		return view.getkWPhase2();	
	}
	
	public String getkWPhase3(){
		return view.getkWPhase3();	
	}
	
	public String getkWhPhase1(){
		return view.getkWhPhase1();	
	}
	
	public String getkWhPhase2(){
		return view.getkWhPhase2();	
	}
	
	public String getkWhPhase3(){
		return view.getkWhPhase3();	
	}
	
	public String getVallPhases(){
		return view.getVallPhases();	
	}
	
	public String getAallPhases(){
		return view.getAallPhases();	
	}
	
	public String getPFallPhases(){
		return view.getPFallPhases();	
	}
	
	public String getkWallPhases(){
		return view.getkWallPhases();	
	}
	
	public String getkWhallPhases(){
		return view.getkWhallPhases();	
	}
	
	public String getAPhaseN(){
		return view.getAPhaseN();	
	}
	
	public String getVTHDPhase1(){
		return view.getVTHDPhase1();	
	}
	
	public String getVTHDPhase2(){
		return view.getVTHDPhase2();	
	}
	
	public String getVTHDPhase3(){
		return view.getVTHDPhase3();	
	}
	
	public String getITHDPhase1(){
		return view.getITHDPhase1();	
	}
	
	public String getITHDPhase2(){
		return view.getITHDPhase2();	
	}
	
	public String getITHDPhase3(){
		return view.getITHDPhase3();	
	}
	
	
}
