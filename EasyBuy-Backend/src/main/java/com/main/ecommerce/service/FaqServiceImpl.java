package com.main.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.ecommerce.dao.FaqDao;
import com.main.ecommerce.entity.Faq;
import com.main.ecommerce.service.FaqService;

import java.util.List;

@Service
public class FaqServiceImpl implements FaqService {

    @Autowired
    private FaqDao faqDao;

    @Override
    public List<Faq> getAllFaqs() {
        return faqDao.getAllFaqs();
    }
}
