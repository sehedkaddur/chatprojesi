package controller;
import model.SohbetOdasi;
import org.springframework.web.bind.annotation.*;
import service.SohbetOdasiService;
@RestController
@RequestMapping("/sohbetodasi")
public class SohbetOdasiController {
    private SohbetOdasiService sohbetOdasiService;
    public SohbetOdasiController(SohbetOdasiService sohbetOdasiService) {
        this.sohbetOdasiService = sohbetOdasiService;
    }
    @PostMapping("/kaydet")
    public SohbetOdasi sohbetOdasiKaydet(@RequestBody SohbetOdasi sohbetOdasi) {
        return sohbetOdasiService.sohbetOdasiKaydet(sohbetOdasi);
    }}