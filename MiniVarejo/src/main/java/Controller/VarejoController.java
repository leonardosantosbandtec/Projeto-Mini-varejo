package Controller;

import org.springframework.web.bind.annotation.*;
import Model.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/varejo")
public class VarejoController {

    private List<Desconto> desconto = new ArrayList<>();


    @GetMapping("/listar")
    public List<Desconto> getListaProduto() {
        return desconto;
    }

    @PostMapping("/cadastrarItem1")
    public void cadastrarAlimento(@RequestBody Alimenticios novoAlimento){
        desconto.add(novoAlimento);
    }

    @PostMapping("/cadastrarItem2")
    public void cadastrarAcessorio(@RequestBody Acessorios novoAcessorio){
        desconto.add(novoAcessorio);
    }

    @PostMapping("/cadastrarItem3")
    public void cadastrarCosmetico(@RequestBody Cosmeticos novoCosmetico){
        desconto.add(novoCosmetico);
    }

    @DeleteMapping("/excluir/{id}")
    public Desconto excluirProduto(@PathVariable int id){
        return desconto.remove(id-1);
    }

    @GetMapping("/registro/{id}")
    public Desconto getRegistro(@PathVariable int id){
        return desconto.get(id-1);
    }

}
