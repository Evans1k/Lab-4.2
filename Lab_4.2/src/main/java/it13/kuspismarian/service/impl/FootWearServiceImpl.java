package it13.kuspismarian.service.impl;

import it13.kuspismarian.dto.FootWearDTO;
import it13.kuspismarian.exception.ServiceException;
import it13.kuspismarian.mapper.FootWearToFootWearDTOMapper;
import it13.kuspismarian.repository.FootWearRepository;
import it13.kuspismarian.service.FootWearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FootWearServiceImpl implements FootWearService {

    @Autowired
    private FootWearRepository footWearRepository;

    @Autowired
    private FootWearToFootWearDTOMapper footWearTofootWearDTOMapper;

    @Override
    public FootWearDTO getFootWearId(final Long id) {

        return footWearTofootWearDTOMapper.toDTO(footWearRepository.getFootWearId(id));
    }

    @Override
    public List<FootWearDTO> getAllFootWear() {
        return footWearRepository.getAllFootWears().stream()
                .map(e -> footWearTofootWearDTOMapper.toDTO(e))
                .collect(Collectors.toList());
    }

    @Override
    public FootWearDTO createFootWear(final FootWearDTO footWearDTO) {
        if(footWearDTO.getId() != null){
            throw new ServiceException(400, "Shoes shouldn't have an id ", null);
        }

        return footWearTofootWearDTOMapper.toDTO(footWearRepository.createFootWear(footWearTofootWearDTOMapper.toEntity(footWearDTO)));
    }

    @Override
    public FootWearDTO updateFootWear(final FootWearDTO footWearDTO) {
        if(footWearDTO.getId() == null){
            throw new ServiceException(400, "Shoes have an id ", null);
        }

        return footWearTofootWearDTOMapper.toDTO(footWearRepository.updateFootWears(footWearTofootWearDTOMapper.toEntity(footWearDTO)));
    }

    @Override
    public void deleteFootWearId(final Long id) {
        footWearRepository.deleteFootWearId(id);
    }
}
