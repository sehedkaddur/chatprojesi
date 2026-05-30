package controller;
import model.Mesaj;
import org.springframework.web.bind.annotation.*;
import service.MesajService;
@RestController
@RequestMapping("/mesaj")
public class MesajController {
    private MesajService mesajService;
    public MesajController(MesajService mesajService) {
        this.mesajService = mesajService;
    }
    @PostMapping("/kaydet")
    public Mesaj mesajKaydet(@RequestBody Mesaj mesaj) {
        return mesajService.mesajKaydet(mesaj);
    }}