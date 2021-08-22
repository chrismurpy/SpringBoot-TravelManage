package com.murphy.service.impl;

import com.github.pagehelper.PageInfo;
import com.murphy.domain.Route;
import com.murphy.service.RouteService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RouteServiceImplTest extends TestCase {

    @Resource
    private RouteService routeService;

    @Test
    public void testFindPage() {
        Route route = new Route();
        route.setRname("北京");
        PageInfo<Route> page = routeService.findPage(route, 1, 5);

        page.getList().forEach((r) -> {
            System.out.println(r.getRid() + "\t" + r.getRname() + "\t" + r.getCategory().getCname() +
                    "\t" + r.getSeller().getSname() + "\t" + r.getRouteImgList().size());
        });
    }

    @Test
    public void testFindById() {
        Route r = routeService.findById(34);
        System.out.println(r.getRid() + "\t" + r.getRname() + "\t" + r.getCategory().getCname() +
                "\t" + r.getSeller().getSname() + "\t" + r.getRouteImgList().size());
    }
}