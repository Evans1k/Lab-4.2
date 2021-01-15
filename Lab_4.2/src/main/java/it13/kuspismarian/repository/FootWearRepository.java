package it13.kuspismarian.repository;

import it13.kuspismarian.entity.FootWear;
import it13.kuspismarian.exception.ServiceException;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class FootWearRepository {

    @PostConstruct
    public void init(){
        savedFootWears = new ArrayList<>();
    }

    private static Long lastId = 1L;
    private List<FootWear> savedFootWears;

    public FootWear getFootWearId(final Long id){
        return savedFootWears.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ServiceException(400, "Shoes with this id: " + id + " not found ", null));
    }

    public List<FootWear> getAllFootWears(){
        return savedFootWears;
    }

    public FootWear createFootWear(final FootWear footWears){
        if(footWears.getId() != null){
            throw new ServiceException(400, "Shoes shouldn't have an id ", null);
        }

        ++lastId;
        footWears.setId(lastId);

        savedFootWears.add(footWears);

        return footWears;
    }

    public FootWear updateFootWears(final FootWear footWears){
        if(footWears.getId() == null){
            throw new ServiceException(400, "User shouldn't have an id ", null);
        }

        final FootWear savedFootWear = getFootWearId(footWears.getId());


        savedFootWear.setBrandName(footWears.getBrandName());
        savedFootWear.setPrice(footWears.getPrice());
        savedFootWear.setModelName(footWears.getModelName());

        return savedFootWear;
    }

    public void deleteFootWearId(final Long id){
        if(id == null){
            throw new ServiceException(400, "Id isn't specified", null);
        }

        savedFootWears.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ServiceException(400, "Shoes with this id: " + id + " not found ", null));

        savedFootWears = savedFootWears.stream()
                .filter(e -> !e.getId().equals(id))
                .collect(Collectors.toList());

    }
}
