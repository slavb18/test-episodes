/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.ilb.test.web;

import ru.ilb.test.api.ResourcesResource;
import ru.ilb.test.resource.Resource;
import ru.ilb.test.resource.Resources;


public class ResourcesResourceImpl implements ResourcesResource {

    @Override
    public Resources list() {
        Resources res=new Resources();
        res.getResources().add(new Resource().withHref("http://link.ru").withRole("role").withTitle("title"));
        return res;
    }

}
