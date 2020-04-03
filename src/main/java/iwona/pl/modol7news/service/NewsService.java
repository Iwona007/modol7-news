package iwona.pl.modol7news.service;


import iwona.pl.modol7news.dao.DaoRepo;
import iwona.pl.modol7news.model.ResultDb;
import iwona.pl.modol7news.model.TheGuardian;
import java.net.URL;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplateHandler;

@Service
public class NewsService {

    private static final String APIKEY = "44109c22-7967-49e2-bc13-0cb54c6bf0ab";
    private DaoRepo daoRepo;

    @Autowired
    public NewsService(DaoRepo daoRepo) {
        this.daoRepo = daoRepo;
//        addNews();
    }

    public TheGuardian theGuardianInfo() {
        RestTemplate restTemplate = new RestTemplate();
        TheGuardian response = restTemplate.getForObject("https://content.guardianapis.com/search?&api-key=" + APIKEY,
                TheGuardian.class);
//        System.out.println(response);
        return response;
    }

    public List<ResultDb> getAll() {
        return daoRepo.getAll();
    }

    public void addNews() {
        int amount = 10;
        for (int i = 0; i < amount; i++) {
            System.out.println(i);
            daoRepo.addNews(i,
                    theGuardianInfo().getResponse().getResults().get(i).getType(),
                    theGuardianInfo().getResponse().getResults().get(i).getSectionName(),
                    theGuardianInfo().getResponse().getResults().get(i).getWebTitle(),
                    theGuardianInfo().getResponse().getResults().get(i).getWebUrl());
        }
    }

    public ResultDb getId(long resId) {
        return daoRepo.getId(resId);
    }

    public void update(ResultDb newResultDb) {
        daoRepo.changeNews(newResultDb);
    }

    public ResultDb search(long resId) {
        return daoRepo.search(resId);
    }

    public void delete(long resId) {
        daoRepo.delete(resId);
    }
}
