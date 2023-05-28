import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @Autowired
    private ItemRepository itemRepository;
    
    @GetMapping("/index")
    public String getIndex(Model model) {
        // Buscar todos os itens não deletados do banco de dados
        List<Item> items = itemRepository.findByDeletedIsNull();
        
        // Adicionar a lista de itens ao modelo
        model.addAttribute("items", items);
        
        // Retornar o nome do template Thymeleaf que será usado para renderizar a página
        return "index";
    }
}
