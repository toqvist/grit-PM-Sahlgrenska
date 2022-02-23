package model;

public class FileReader {

    File file = new File("path");
    BufferedReader br = new BufferedReader(new FileReader(file));
    String st;
    
    while((st=br.readLine())!=null) {
        var arrayName = st.split(":");
        var arrayCondition = arrayName[1].split(",");
        var arrayProblem = arrayCondition[2].split("+");
        var arrayRoom = arrayProblem[3].split("-");
        Employee.addPatient(new Patient(arrayName[0], arrayCondition[1], arrayProblem[2], arrayRoom[3]));
    }
}
