package basepatterns.creational.singleton;

import java.io.FileWriter;
import java.io.IOException;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is Log file \n\n";

    public static synchronized ProgramLogger getProgramLogger(){
        if(programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return  programLogger;
    }

    private ProgramLogger(){

    }

    public void addLogInfo(String logInfo){
        logFile += logInfo + "\n";
    }

    public void log2File (){
        try(FileWriter writer = new FileWriter("logs.txt", true)){
            writer.write(logFile);
            writer.write("\n\n");
        } catch (IOException e) {
            System.out.println("Не удалось записать.");
        }
    }

    public void showLogFile(){
        System.out.println(logFile);
    }



}

