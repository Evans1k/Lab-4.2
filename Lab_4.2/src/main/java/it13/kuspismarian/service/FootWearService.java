package it13.kuspismarian.service;

import it13.kuspismarian.dto.FootWearDTO;

import java.util.List;

public interface FootWearService {
    FootWearDTO getFootWearId(Long id);
    List<FootWearDTO> getAllFootWear();
    FootWearDTO createFootWear(FootWearDTO footWearDTO);
    FootWearDTO updateFootWear(FootWearDTO footWearDTO);
    void deleteFootWearId(Long id);

}
