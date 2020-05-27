package br.com.preparatorioconcurso;

import java.io.File;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class DataSourceConfiguration {

	@Autowired
	public static Environment environment;

	@Bean
	@SuppressWarnings("rawtypes")
    public DataSource getDataSource() {
		
		String separador = "/";
		StringBuilder walletDiretorio = new StringBuilder (System.getProperty("user.dir").replace("/", separador))
			.append(separador).append("src").append(separador).append("main").append(separador)
			.append("resources").append(separador).append("Wallet_BI_Bruno");
		
		System.out.println(walletDiretorio.toString());
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:oracle:thin:@bi_high?TNS_ADMIN="+walletDiretorio.toString());
        dataSourceBuilder.username("POC_ARQUITETURA");
        dataSourceBuilder.password("poc_arquiteturahml04");
        return dataSourceBuilder.build();
    }
	
}
