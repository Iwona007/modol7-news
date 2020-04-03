package iwona.pl.modol7news.dao;


import iwona.pl.modol7news.model.ResultDb;
import iwona.pl.modol7news.model.TheGuardian;
import java.net.URL;
import java.util.List;

public interface DaoRepo {

  void addNews(long resId, String type, String sectionName, String webTitle, URL webUrl);

  List<ResultDb> getAll();

  ResultDb getId(long resId);

  void changeNews(ResultDb newResultDb);

  void delete(long resId);

}
