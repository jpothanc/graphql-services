package com.ibit.services;

import com.ibit.repository.WebCounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class WebCounterCmdServiceImpl implements WebCounterCmdService {
    private final WebCounterRepository webCounterRepository;

    @Autowired
    public WebCounterCmdServiceImpl(WebCounterRepository webCounterRepository) {
        this.webCounterRepository = webCounterRepository;
    }
    @Override
    public int getCounter(String siteName) {
        return webCounterRepository.findById(siteName).get().getCounter();
    }

}
