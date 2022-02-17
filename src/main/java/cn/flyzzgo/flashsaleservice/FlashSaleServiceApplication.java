package cn.flyzzgo.flashsaleservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Flyzz
 */
@SpringBootApplication
@MapperScan("cn.flyzzgo.flashsaleservice.mapper")
public class FlashSaleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlashSaleServiceApplication.class, args);
    }

}
