package main.java.com.thomasbrasil.controller;

@RestController
@RequestMapping("/api/vms")
public class VmsController {
    private final VmsService vmsService;

    @Autowired
    public VmsController(VmsService vmsService) {
        this.vmsService = vmsService;
    }

    @GetMapping("/vms")
    public List<Vms> getAllVms() {
        return vmsService.getAllVms();
    }

    @GetMapping("/vms/{id}")
    public Vms getVmsById(@PathVariable Long id) {
        return vmsService.getVmsById(id);
    }

    @PostMapping("/vms")
    public Vms createVms(@RequestBody Vms vms) {
        return vmsService.createVms(vms);
    }

    @PutMapping("/vms/{id}")
    public Vms updateVms(@PathVariable Long id, @RequestBody Vms vms) {
        return vmsService.updateVms(id, vms);
    }

    @DeleteMapping("/vms/{id}")
    public void deleteVms(@PathVariable Long id) {
        vmsService.deleteVms(id);
    }
}
