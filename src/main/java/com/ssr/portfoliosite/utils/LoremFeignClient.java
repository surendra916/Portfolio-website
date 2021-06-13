package com.ssr.portfoliosite.utils;


import com.ssr.portfoliosite.model.LoremImage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(
        value = "LoremFeignClient",
        url="${lorempicsum.baseurl}"
)
public interface LoremFeignClient {
    @GetMapping("list")
    List<LoremImage> getAllLoremImages();
}
