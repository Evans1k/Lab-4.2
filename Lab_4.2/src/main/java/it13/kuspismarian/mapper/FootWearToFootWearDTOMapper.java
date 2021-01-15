package it13.kuspismarian.mapper;

import it13.kuspismarian.dto.FootWearDTO;
import it13.kuspismarian.entity.FootWear;
import org.springframework.stereotype.Component;

@Component
public class FootWearToFootWearDTOMapper {
    public FootWear toEntity(final FootWearDTO footWearDTO){
        final FootWear footWear = new FootWear();

        footWear.setId(footWearDTO.getId());
        footWear.setModelName(footWearDTO.getModelName());
        footWear.setPrice(footWearDTO.getPrice());
        footWear.setBrandName(footWearDTO.getBrandName());

        return footWear;
    }

    public FootWearDTO toDTO(final FootWear footWear){
        final FootWearDTO footWearDTO = new FootWearDTO();

        footWearDTO.setId(footWear.getId());
        footWearDTO.setModelName(footWear.getModelName());
        footWear.setPrice(footWear.getPrice());
        footWear.setBrandName(footWear.getBrandName());

        return footWearDTO;
    }
}
