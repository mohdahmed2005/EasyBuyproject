package com.youtube.ecommerce.service;

import com.youtube.ecommerce.dao.FaqDao;
import com.youtube.ecommerce.entity.Faq;
import com.youtube.ecommerce.service.FaqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
