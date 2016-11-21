package com.theironyard;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by zach on 11/21/16.
 */
public interface BeerRepo extends CrudRepository<Beer, String> {
}
