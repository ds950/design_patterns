package basepatterns.creational.singleton;

import java.io.FileWriter;
import java.io.IOException;

public class ProgramRunner {
    public static void main(String[] args) {
            ProgramLogger.getProgramLogger().addLogInfo("First log...");
            ProgramLogger.getProgramLogger().addLogInfo("Second log...");
            ProgramLogger.getProgramLogger().addLogInfo("Third log...");
            ProgramLogger.getProgramLogger().log2File();
            ProgramLogger.getProgramLogger().showLogFile();
    }
}
