package com.demo.doAn;

import com.demo.doAn.models.Nguoidung;
import com.demo.doAn.models.NguoidungPK;
import com.demo.doAn.repository.NguoidungRepository;
import com.demo.doAn.services.NguoidungService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class DoAnApplication implements CommandLineRunner {

    @Autowired
    private NguoidungService nguoidungService;

    @Autowired
    private NguoidungRepository nguoidungRepository;

    public static void main(String[] args) {
        SpringApplication.run(DoAnApplication.class, args);
    }

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
        corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin",
                "Content-Type", "Accept", "Authorization", "Origin,Accept", "X-Requested-With",
                "Access-Control-Request-Method", "Access-Control-Request-Headers"));
        corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
                "Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
        corsConfiguration.setAllowedMethods(Arrays.asList("GET", "PUT", "POST", "DELETE", "OPTIONS"));
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }

    @Override
    public void run(String... args) throws Exception {
//        Nguoidung nguoidung1 = new Nguoidung();
//        NguoidungPK nguoidungPK = new NguoidungPK();
//        nguoidungPK.setMaND("GV01");
//        nguoidungPK.setMaCV("ROLE_GV");
//        nguoidung1.setUsername("GV01");
//        nguoidung1.setPassword("GV01");
//        nguoidung1.setNguoidungPK(nguoidungPK);
//        nguoidungService.luuNguoidung(nguoidung1);
//
//        Nguoidung nguoidung2 = new Nguoidung();
//        NguoidungPK nguoidungPK2 = new NguoidungPK();
//        nguoidungPK2.setMaND("GV02");
//        nguoidungPK2.setMaCV("ROLE_GV");
//        nguoidung2.setUsername("GV02");
//        nguoidung2.setPassword("GV02");
//        nguoidung2.setNguoidungPK(nguoidungPK2);
//        nguoidungService.luuNguoidung(nguoidung2);
        nguoidungService.laydsNguoidung();
    }

}
