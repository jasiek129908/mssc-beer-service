package guru.springframwork.msscbreweryservice.web.mappers;

import guru.springframwork.msscbreweryservice.domain.Beer;
import guru.springframwork.msscbreweryservice.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * @author Jan Oleksik (jan.oleksik@hycom.pl)
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}