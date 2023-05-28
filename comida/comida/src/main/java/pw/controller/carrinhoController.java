package pw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class carrinhoController {
    private List<String> itensCarrinho = new ArrayList<>();

    @GetMapping("/carrinho")
    public String mostrarCarrinho(Model model) {
        model.addAttribute("itens", itensCarrinho);
        return "carrinho";
    }

    @PostMapping("/carrinho/adicionar")
    public String adicionarItem(@RequestParam("item") String item) {
        itensCarrinho.add(item);
        return "redirect:/carrinho";
    }

    @PostMapping("/carrinho/remover")
    public String removerItem(@RequestParam("item") String item) {
        itensCarrinho.remove(item);
        return "redirect:/carrinho";
    }
}
