package com.example.physlearn;

public class Result {
    private int ID;
    private String NAME;
    private String DATE;
    private String RESULT;
    public Result()
    {
        ID=0;
        NAME ="";
        DATE ="";
        RESULT ="";
    }
    public Result(String nAME, String dATE, String rESULT) {

        NAME = nAME;
        DATE = dATE;
        this.RESULT = rESULT;
    }
    public int getID()
    {
        return ID;
    }
    public String getNAME() {
        return NAME;
    }
    public String getDATE() {
        return DATE;
    }
    public String getRESULT() {
        return RESULT;
    }
    public void setID(int id)
    {
        ID=id;
    }
    public void setNAME(String nAME) {
        NAME = nAME;
    }
    public void setDATE(String dATE) {
        DATE = dATE;
    }
    public void setRESULT(String rESULT) {
        RESULT = rESULT;
    }
}
