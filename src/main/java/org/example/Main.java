package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author luopan
 */
public class Main {
    static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
    logger.info("开始执行");
    logger.error("执行异常");
    }
}