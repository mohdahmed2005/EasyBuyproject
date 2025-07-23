package com.bestbuy.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestbuy.ecommerce.dao.FaqDao;
import com.bestbuy.ecommerce.entity.Faq;
import com.bestbuy.ecommerce.service.FaqService;

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
