package iwona.pl.modol7news.confo;


import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DbConfig {

  private DataSource dataSource;

  @Autowired
    public DbConfig(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  public JdbcTemplate jdbcTemplate() {
    return new JdbcTemplate(dataSource);
  }

// only in order to fill in DB.
//    @EventListener(ApplicationReadyEvent.class)
//    public void initResult() {
//        String sql = "CREATE TABLE info(res_id int auto_increment, type varchar (255), section_name varchar(255)," +
//                " web_title varchar (255), web_url varchar (255), primary key(res_id))";
//        jdbcTemplate().update(sql);
//    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void dropTable() {
//        String sql;
//        sql = "DROP TABLE IF EXISTS info";
//        jdbcTemplate().update(sql);
//    }
}
