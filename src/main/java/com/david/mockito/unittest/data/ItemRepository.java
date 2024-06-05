package com.david.mockito.unittest.data;

import com.david.mockito.unittest.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {


}
