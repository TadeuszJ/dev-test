package org.tadeusz.jereczek;

import org.apache.commons.cli.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Options options = new Options();
        options.addOption("t", "task", true, "task number");
        options.addOption("h", "help", false, "print this message");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        String taskNumber = cmd.getOptionValue("t");

        TaskFactory taskFactory = new TaskFactory();
        Task task = taskFactory.getTask(taskNumber);

        if (task != null) {
            task.run();
        } else {
            HelpFormatter helpFormatter = new HelpFormatter();
            helpFormatter.printHelp("dev-test", options);
        }
    }
}
