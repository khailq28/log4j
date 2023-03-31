package com.company;


import org.apache.log4j.Logger;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    // add classpath of Properties before run
    //
    static Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) throws IOException, SQLException {
	// write your code here
        log.debug("Hello this is a debug message");
        log.info("Hello this is an info message");
    }
}
