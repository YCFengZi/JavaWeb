package net.zjitc.Utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.InputStream;
import java.text.DateFormat;
import java.util.Properties;

public class JdbcUtils {
    public static DataSource dataSource;
    static {
        try{
            Properties properties = new Properties();

            InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            properties.load(in);
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static DataSource getDataSource(){
        return dataSource;
    }
}
