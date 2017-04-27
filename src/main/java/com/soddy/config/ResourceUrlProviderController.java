package com.soddy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

/**
 * 静态文件缓存，md5方式，访问静态文件，后缀加md5编码，以此处理更改静态文件，缓存不生效问题
 * 注：服务器重启才能变换md5
 * 页面使用方式：
 * <script type="text/javascript" src="${pageContext.request.contextPath }${urls.getForLookupPath('/js/common.js') }"></script>
 * Created by soddygosongguochao on 2017/4/27.
 */
@ControllerAdvice
public class ResourceUrlProviderController {
//    @Autowired
//    private ResourceUrlProvider resourceUrlProvider;
//
//    @ModelAttribute("urls")
//    public ResourceUrlProvider urls() {
//        return this.resourceUrlProvider;
//    }
}
