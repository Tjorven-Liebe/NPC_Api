package net.standardsucht.logger;

import net.standardsucht.services.common.Vars;
import org.bukkit.Bukkit;

/**
 * @since 05.12.2021
 */

public class Logger {

    public Logger() {

    }

    public static Logger getLogger() {
        return new Logger();
    }

    public void send(LogType type, String... toSend) {
        for (String string : toSend) {
            Bukkit.getConsoleSender().sendMessage(Vars.prefix + type.toString() + string);
        }
    }

    public void error(String... string) {
        for (String toLog : string) {
            Bukkit.getConsoleSender().sendMessage(Vars.prefix + LogType.ERROR.toString() + toLog);
        }

    }

    public void error(Throwable... throwable) {
        for (Throwable exceptionMessage : throwable) {
            error("" + exceptionMessage.getClass().getName());
            error("" + exceptionMessage.getMessage());
            for (StackTraceElement element : exceptionMessage.getStackTrace()) {
                error(element.toString());
            }

        }
    }

    public void error(Exception... exception) {
        for (Exception exceptionMessage : exception) {
            error("" + exceptionMessage.getClass().getName());
            error("" + exceptionMessage.getMessage());
            for (StackTraceElement element : exceptionMessage.getStackTrace()) {
                error(element.toString());
            }
        }
    }

//    public void info(String... info) {
//        for (String string : info)
//            Bukkit.getConsoleSender().sendMessage(Vars.prefix + "" + string);
//    }
//
//    public void warn(String... warn) {
//        for (String string : warn) {
//            Bukkit.getConsoleSender().sendMessage(Vars.prefix + "" + string);
//        }
//    }
//
//    public String getDate() {
//        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM. HH:mm:ss"));
//    }
}