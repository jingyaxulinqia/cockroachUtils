package com.linqia.spring.utils.cockroachUtils;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.linqia.spring.utils.cockroachUtils.dao.ConversionPixelsDailyRepository;
import com.linqia.spring.utils.cockroachUtils.dao.ConversionPixelsHourlyRepository;
import com.linqia.spring.utils.cockroachUtils.dao.PeopleRepository;
import com.linqia.spring.utils.cockroachUtils.entity.ConversionPixelDaily;
import com.linqia.spring.utils.cockroachUtils.entity.ConversionPixelHourly;
import com.linqia.spring.utils.cockroachUtils.entity.People;
import org.springframework.context.ConfigurableApplicationContext;
import org.joda.time.DateTime;
import java.util.List;

public class CockroachUtilsApplication {

	public static void main(String[] args){
	    Injector injector = Guice.createInjector();
        Abc abc = injector.getInstance(Abc.class);
        System.out.println("abc = "+abc.val);
//            ContextFactory ctxFactory = injector.getInstance(ContextFactory.class);
//        ConfigurableApplicationContext ctx = ctxFactory.getContext();
        ConfigurableApplicationContext ctx = ContextFactory.getContext();
        PeopleRepository peopleRepository = ctx.getBean("peopleRepository", PeopleRepository.class);
        People kevin = new People("Leanne", "77876@gmail.com", 22, "2711 N 1st st, San Mateo" );
        peopleRepository.save(kevin);
        System.out.println("insert Leanne done!");

        ConversionPixelsHourlyRepository hourlyRepository = ctx.getBean("conversionPixelsHourlyRepository", ConversionPixelsHourlyRepository.class);
        ConversionPixelHourly hourly=new ConversionPixelHourly("link/8943743779219.png", DateTime.now(), "www.google.com", 30, 12, 1, true, DateTime.now(), DateTime.now());
        hourlyRepository.save(hourly);
        List<ConversionPixelHourly> curHours= (List<ConversionPixelHourly>) hourlyRepository.findAll();
        System.out.println("hourly init success");
        System.out.println(curHours);

        ConversionPixelsDailyRepository dailyRepository = ctx.getBean("conversionPixelsDailyRepository", ConversionPixelsDailyRepository.class);
        ConversionPixelDaily daily=new ConversionPixelDaily("link/8943743779219.png", DateTime.now(), "www.google.com", 30l, 12l, 1l, 2, DateTime.now(), DateTime.now());
        dailyRepository.save(daily);
        List<ConversionPixelDaily> curDailys= (List<ConversionPixelDaily>) dailyRepository.findAll();
        System.out.println("daily init success");
        System.out.println(curDailys);

        List<People> peoples = peopleRepository.findAll();
        for( People p : peoples) {
            System.out.println(p.toString());
        }
        System.out.println("done");


    }
}
