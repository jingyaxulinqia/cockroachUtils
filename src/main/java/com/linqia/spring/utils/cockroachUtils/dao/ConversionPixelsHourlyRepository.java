package com.linqia.spring.utils.cockroachUtils.dao;

import com.linqia.spring.utils.cockroachUtils.entity.ConversionPixelHourly;
import com.linqia.spring.utils.cockroachUtils.entity.People;
import org.joda.time.DateTime;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ConversionPixelsHourlyRepository extends CrudRepository<ConversionPixelHourly, Long>{

    public void deleteAllByDayHourLessThan(DateTime dayhour);


}
