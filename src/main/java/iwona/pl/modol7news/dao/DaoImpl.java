package iwona.pl.modol7news.dao;


import iwona.pl.modol7news.model.ResultDb;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements DaoRepo {

  private JdbcTemplate jdbcTemplate;
  private static final String NAME = "info";

  @Autowired
  public DaoImpl(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public void addNews(long resId, String type, String sectionName, String webTitle, String webUrl) {
    ResultDb resultDb = new ResultDb(type, sectionName, webTitle, webUrl);
    String sql = "INSERT INTO info VALUES (?, ?, ?, ?, ?) ";
    jdbcTemplate.update(sql, resultDb.getResId(), resultDb.getType(), resultDb.getSectionName(),
                resultDb.getWebTitle(), resultDb.getWebUrl());
  }

  public List<ResultDb> getAll() {
    List<ResultDb> newsList1 = new ArrayList<>();
    String sql = "SELECT * FROM " + NAME;
    List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
    maps.stream().forEach(element -> newsList1.add(new ResultDb(
                Long.parseLong(String.valueOf(element.get("res_id"))),
                String.valueOf(element.get("type")),
                String.valueOf(element.get("section_name")),
                String.valueOf(element.get("web_title")),
                String.valueOf(element.get("web_url")))));
    return newsList1;
  }

  @Override
  public ResultDb getId(long resId) {
    String sql = "SELECT * FROM " + NAME + " WHERE res_id = ?";
    return jdbcTemplate.queryForObject(sql, (resultSet, i) ->
                new ResultDb(resultSet.getLong("res_id"),
                        resultSet.getString("type"),
                        resultSet.getString("section_name"),
                        resultSet.getString("web_title"),
                        resultSet.getString("web_url")), resId);
  }

  @Override
  public void changeNews(ResultDb newResultDb) {
    String sql = "UPDATE info SET info.type =?, info.section_name =?,"
               + "info.web_title =?,  info.web_url=? WHERE res_id = ?";
    jdbcTemplate.update(sql, newResultDb.getType(), newResultDb.getSectionName(),
                newResultDb.getWebTitle(), newResultDb.getWebUrl(), newResultDb.getResId());
  }

  @Override
  public void delete(long resId) {
    String sql = "DELETE FROM " + NAME + " WHERE res_id = ?";
    jdbcTemplate.update(sql, resId);
  }

}

