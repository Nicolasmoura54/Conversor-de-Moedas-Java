package br.com.ConversorDeMoedas.Model;


public class RespostaPair {

    private String result;
    private String base_code;
    private String target_code;
    private double conversion_rate;
    private double conversion_result;

    public String getResult() {
        return result;
    }

    public double getConversion_rate() {
        return conversion_rate;
    }

    public double getConversion_result() {
        return conversion_result;
    }

}
