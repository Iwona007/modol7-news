package iwona.pl.modol7news.controller;



import iwona.pl.modol7news.dao.DaoImpl;
import iwona.pl.modol7news.model.ResultDb;
import iwona.pl.modol7news.service.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/news")
public class NewsController {

  private NewsService newsService;

  public NewsController(NewsService newsService) {
    this.newsService = newsService;
  }

  @GetMapping
    public String getAll(Model model) {
    model.addAttribute("newsList", newsService.getAll());
    return "news";
  }

  @GetMapping("/update/{resId}")
    public String edit(@PathVariable Integer resId, Model model) {
    ResultDb newResutkDb = newsService.getId(resId);
    model.addAttribute("newresultdb", newResutkDb);
    return "update";
  }

  @PostMapping("/update")
    public String editedit(@ModelAttribute ResultDb newresultdb) {
    System.out.println(newresultdb);
    newsService.update(newresultdb);
    return "redirect:/news";
  }

  @GetMapping("/delete/{resId}")
    public String delete(@PathVariable long resId) {
    newsService.delete(resId);
    return "redirect:/news";
  }
}
