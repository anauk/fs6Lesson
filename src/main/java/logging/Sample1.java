package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sample1 {
    static Logger log = LoggerFactory.getLogger(Sample1.class);

    public static void main(String[] args) {
        System.out.println("-begin");

        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.trace("trace");
        log.error("error");

        System.out.println("-end");
    }
}
