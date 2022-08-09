package guru.springframwork.msscbreweryservice.repositories;

import guru.springframwork.msscbreweryservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * @author Jan Oleksik (jan.oleksik@hycom.pl)
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}