package com.ssr.portfoliosite.service;

import com.ssr.portfoliosite.model.LoremImage;
import com.ssr.portfoliosite.utils.LoremFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoremService {
    @Autowired
    public LoremFeignClient loremFeignClient;

    public List<LoremImage> getAllImages(){
        return loremFeignClient.getAllLoremImages();
    }

}
