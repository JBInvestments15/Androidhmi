package com.example.paul.trendpointmetering;

public class DataView {

	private Data model;
	
	
	public DataView(Data model)
	{
		this.model = model;
	}
	
	public String getVPhase1(){
		String result = null;
		double resultDouble = model.getPQM_V_phase_1();
		resultDouble = resultDouble * 0.10;
		result = Double.toString(resultDouble);
		
		return result;
	}

    public String getVPhase2(){
        String result = null;
        double resultDouble = model.getPQM_V_phase_2();
        resultDouble = resultDouble * 0.10;
        result = Double.toString(resultDouble);

        return result;
    }

    public String getVPhase3(){
        String result = null;
        double resultDouble = model.getPQM_V_phase_3();
        resultDouble = resultDouble * 0.10;
        result = Double.toString(resultDouble);

        return result;
    }
	
	public String getAPhase1(){
		String result = null;
		double resultTotal = 0;
		double resultHigh = model.getPQM_A_phase_1_high();
		double resultLow = model.getPQM_A_phase_1_low();
        if(resultLow == 0){
            resultHigh = resultHigh * .001;
            result = Double.toString(resultHigh);
            return result;
        }else{
            resultTotal = ((resultLow)*65535) + resultHigh;
            resultTotal = resultTotal * .001;
            result = Double.toString(resultTotal);
            return result;
        }}

    public String getAPhase2(){
        String result = null;
        double resultTotal = 0;
        double resultHigh = model.getPQM_A_phase_2_high();
        double resultLow = model.getPQM_A_phase_2_low();
        if(resultLow == 0){
            resultHigh = resultHigh * .001;
            result = Double.toString(resultHigh);
            return result;
        }else{
            resultTotal = ((resultLow)*65535) + resultHigh;
            resultTotal = resultTotal * .001;
            result = Double.toString(resultTotal);
            return result;
        }}

    public String getAPhase3(){
        String result = null;
        double resultTotal = 0;
        double resultHigh = model.getPQM_A_phase_3_high();
        double resultLow = model.getPQM_A_phase_3_low();
        if(resultLow == 0){
            resultHigh = resultHigh * .001;
            result = Double.toString(resultHigh);
            return result;
        }else{
            resultTotal = ((resultLow)*65535) + resultHigh;
            resultTotal = resultTotal * .001;
            result = Double.toString(resultTotal);
            return result;
        }}


    public String getPFPhase1(){
        String result = null;
        double resultDouble = model.getPQM_PF_phase_1();
        resultDouble = resultDouble * 0.10;
        result = Double.toString(resultDouble);

        return result;
    }

    public String getPFPhase2(){
        String result = null;
        double resultDouble = model.getPQM_PF_phase_2();
        resultDouble = resultDouble * 0.10;
        result = Double.toString(resultDouble);

        return result;
    }

    public String getPFPhase3(){
        String result = null;
        double resultDouble = model.getPQM_PF_phase_3();
        resultDouble = resultDouble * 0.10;
        result = Double.toString(resultDouble);

        return result;
    }



    public String getkWPhase1(){
        String result = null;
        double resultTotal = 0;
        double resultHigh = model.getPQM_kW_phase_1_high();
        double resultLow = model.getPQM_kW_phase_1_low();
        if(resultLow == 0){
            resultHigh = resultHigh * .001;
            result = Double.toString(resultHigh);
            return result;
        }else{
            resultTotal = ((resultLow)*65535) + resultHigh;
            resultTotal = resultTotal * .001;
            result = Double.toString(resultTotal);
            return result;
        }}

    public String getkWPhase2(){
        String result = null;
        double resultTotal = 0;
        double resultHigh = model.getPQM_kW_phase_2_high();
        double resultLow = model.getPQM_kW_phase_2_low();
        if(resultLow == 0){
            resultHigh = resultHigh * .001;
            result = Double.toString(resultHigh);
            return result;
        }else{
            resultTotal = ((resultLow)*65535) + resultHigh;
            resultTotal = resultTotal * .001;
            result = Double.toString(resultTotal);
            return result;
        }}

    public String getkWPhase3(){
        String result = null;
        double resultTotal = 0;
        double resultHigh = model.getPQM_kW_phase_3_high();
        double resultLow = model.getPQM_kW_phase_3_low();
        if(resultLow == 0){
            resultHigh = resultHigh * .001;
            result = Double.toString(resultHigh);
            return result;
        }else{
            resultTotal = ((resultLow)*65535) + resultHigh;
            resultTotal = resultTotal * .001;
            result = Double.toString(resultTotal);
            return result;
        }}


    public String getkWhPhase1(){
        String result = null;
        double resultTotal = 0;
        double resultHigh = model.getPQM_kWh_phase_1_high();
        double resultLow = model.getPQM_kWh_phase_1_low();
        if(resultLow == 0){
            resultHigh = resultHigh * .001;
            result = Double.toString(resultHigh);
            return result;
        }else{
            resultTotal = ((resultLow)*65535) + resultHigh;
            resultTotal = resultTotal * .001;
            result = Double.toString(resultTotal);
            return result;
        }}

    public String getkWhPhase2(){
        String result = null;
        double resultTotal = 0;
        double resultHigh = model.getPQM_kWh_phase_2_high();
        double resultLow = model.getPQM_kWh_phase_2_low();
        if(resultLow == 0){
            resultHigh = resultHigh * .001;
            result = Double.toString(resultHigh);
            return result;
        }else{
            resultTotal = ((resultLow)*65535) + resultHigh;
            resultTotal = resultTotal * .001;
            result = Double.toString(resultTotal);
            return result;
        }}

    public String getkWhPhase3(){
        String result = null;
        double resultTotal = 0;
        double resultHigh = model.getPQM_kWh_phase_3_high();
        double resultLow = model.getPQM_kWh_phase_3_low();
        if(resultLow == 0){
            resultHigh = resultHigh * .001;
            result = Double.toString(resultHigh);
            return result;
        }else{
            resultTotal = ((resultLow)*65535) + resultHigh;
            resultTotal = resultTotal * .001;
            result = Double.toString(resultTotal);
            return result;
        }}


    public String getVallPhases(){
        String result = null;
        double resultDouble = model.getPQM_V_allPhases();
        resultDouble = resultDouble * 0.10;
        result = Double.toString(resultDouble);

        return result;
    }



    public String getAallPhases(){
        String result = null;
        double resultTotal = 0;
        double resultHigh = model.getPQM_A_allPhases_low();
        double resultLow = model.getPQM_A_allPhases_high();
        if(resultLow == 0){
            resultHigh = resultHigh * .001;
            result = Double.toString(resultHigh);
            return result;
        }else{
            resultTotal = ((resultLow)*65535) + resultHigh;
            resultTotal = resultTotal * .001;
            result = Double.toString(resultTotal);
            return result;
        }}



    public String getPFallPhases(){
        String result = null;
        double resultDouble = model.getPQM_PF_allPhases();
        resultDouble = resultDouble * 0.10;
        result = Double.toString(resultDouble);

        return result;
    }


    public String getkWallPhases(){
        String result = null;
        double resultTotal = 0;
        double resultHigh = model.getPQM_kW_allPhases_low();
        double resultLow = model.getPQM_kW_allPhases_high();
        if(resultLow == 0){
            resultHigh = resultHigh * .001;
            result = Double.toString(resultHigh);
            return result;
        }else{
            resultTotal = ((resultLow)*65535) + resultHigh;
            resultTotal = resultTotal * .001;
            result = Double.toString(resultTotal);
            return result;
        }}


    public String getkWhallPhases(){
        String result = null;
        double resultTotal = 0;
        double resultHigh = model.getPQM_kWh_allPhases_low();
        double resultLow = model.getPQM_kWh_allPhases_high();
        if(resultLow == 0){
            resultHigh = resultHigh * .001;
            result = Double.toString(resultHigh);
            return result;
        }else{
            resultTotal = ((resultLow)*65535) + resultHigh;
            resultTotal = resultTotal * .001;
            result = Double.toString(resultTotal);
            return result;
        }}


    public String getAPhaseN(){
        String result = null;
        double resultTotal = 0;
        double resultHigh = model.getPQM_A_phase_N_low();
        double resultLow = model.getPQM_A_phase_N_high();
        if(resultLow == 0){
            resultHigh = resultHigh * .001;
            result = Double.toString(resultHigh);
            return result;
        }else{
            resultTotal = ((resultLow)*65535) + resultHigh;
            resultTotal = resultTotal * .001;
            result = Double.toString(resultTotal);
            return result;
        }}



    public String getVTHDPhase1(){
        String result = null;
        double resultDouble = model.getPQM_VTHD_phase_1();
        resultDouble = resultDouble * 0.10;
        result = Double.toString(resultDouble);

        return result;
    }


    public String getVTHDPhase2(){
        String result = null;
        double resultDouble = model.getPQM_VTHD_phase_2();
        resultDouble = resultDouble * 0.10;
        result = Double.toString(resultDouble);

        return result;
    }



    public String getVTHDPhase3(){
        String result = null;
        double resultDouble = model.getPQM_VTHD_phase_3();
        resultDouble = resultDouble * 0.10;
        result = Double.toString(resultDouble);

        return result;
    }



    public String getITHDPhase1(){
        String result = null;
        double resultDouble = model.getPQM_VTHD_phase_1();
        resultDouble = resultDouble * 0.10;
        result = Double.toString(resultDouble);

        return result;
    }



    public String getITHDPhase2(){
        String result = null;
        double resultDouble = model.getPQM_VTHD_phase_2();
        resultDouble = resultDouble * 0.10;
        result = Double.toString(resultDouble);

        return result;
    }



    public String getITHDPhase3(){
        String result = null;
        double resultDouble = model.getPQM_VTHD_phase_3();
        resultDouble = resultDouble * 0.10;
        result = Double.toString(resultDouble);

        return result;
    }
}
