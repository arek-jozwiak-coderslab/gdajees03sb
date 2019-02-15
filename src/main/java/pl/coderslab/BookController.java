package pl.coderslab;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.coderslab.model.Book;


import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.Collection;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/test-repo/{id}")
    @ResponseBody
    public String testRepo(@PathVariable long id) {
        Book book = bookRepository.findOne(id);
        return book.toString();
    }

    @GetMapping("/book/add")
    public String addBook(Model model) {
        model.addAttribute("book", new Book());
        return "book/add";
    }

    @GetMapping("/book/edit/{id}")

    public String editBook(Model model, @PathVariable long id) {
        Book b = bookRepository.findOne(id);
        model.addAttribute("book", b);

        return "book/edit";
    }

    @RequestMapping(value = "/book/edit", method = RequestMethod.POST)
    public String processFormEdit(Model model, @Valid Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "book/edit";
        }
        bookRepository.save(book);
        return "redirect:/book/list";
    }

    @GetMapping("/book/list")
    public String showList(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "book/list";
    }

    @RequestMapping(value = "/book/add", method = RequestMethod.POST)
    public String processForm( @Valid Book book, BindingResult result,
                              RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "book/add";
        }
        redirectAttributes.addFlashAttribute("message", "dodany prawidłowo ");
        bookRepository.save(book);
        return "redirect:/book/list";
    }

}