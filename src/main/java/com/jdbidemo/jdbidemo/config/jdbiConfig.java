package com.jdbidemo.jdbidemo.config;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.spi.JdbiPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import java.util.List;

public class jdbiConfig {

    @Bean

    public Jdbi jdbi(List<JdbiPlugin> jdbiPlugins, List<RowMapper<?>> rowMappers, DbConnectionInfo dbConnectionInfo) {
        TransactionAwareDataSourceProxy proxy = transactionAwareDataSourceProxy(dbConnectionInfo);
        Jdbi jdbi = Jdbi.create(proxy);
        jdbiPlugins.forEach(jdbi::installPlugin);
        rowMappers.forEach(jdbi::registerRowMapper);
        return jdbi;
    }
}
