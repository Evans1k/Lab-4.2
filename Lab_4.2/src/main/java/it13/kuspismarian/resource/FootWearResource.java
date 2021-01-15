package it13.kuspismarian.resource;

import it13.kuspismarian.dto.FootWearDTO;
import it13.kuspismarian.service.FootWearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FootWearResource {
    @Autowired
    private FootWearService footWearService;

    @GetMapping("/footwears/{id}")
    public FootWearDTO getFootWearId(final @PathVariable Long id){
        return footWearService.getFootWearId(id);
    }

    @GetMapping("/footwears")
    public List<FootWearDTO> getAllFootWears(){
        return footWearService.getAllFootWear();
    }

    @PostMapping("/footwears")
    public FootWearDTO createFootWear(final @RequestBody FootWearDTO footWearDTO){
        return footWearService.createFootWear(footWearDTO);
    }

    @PutMapping("/footwears")
    public FootWearDTO updateFootWear(final @RequestBody FootWearDTO footWearDTO){
        return footWearService.updateFootWear(footWearDTO);
    }

    @DeleteMapping("/footwears/{id}")
    public void deleteFootWearId(final @PathVariable Long id){
        footWearService.deleteFootWearId(id);
    }
}
