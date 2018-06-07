package Ihospital;

import java.util.ArrayList;


public interface IfileBinary {

    public static void loadAllData(){}

    public static void SaveAllData(){}

    public ArrayList<Object> readData();

    public void writeData(Object o);
}
