package iwona.pl.modol7news.dao;


import iwona.pl.modol7news.model.ResultDb;
import java.util.List;

public interface DaoRepo {

  void addNews(long resId, String type, String sectionName, String webTitle, String webUrl);

  List<ResultDb> getAll();

  ResultDb getId(long resId);

  void changeNews(ResultDb newResultDb);

  ResultDb search(long resId);

  void delete(long resId);

}
