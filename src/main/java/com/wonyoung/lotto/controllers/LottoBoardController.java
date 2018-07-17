package com.wonyoung.lotto.controllers;


import com.wonyoung.lotto.models.LottoBoard;
import com.wonyoung.lotto.repositories.LottoBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LottoBoardController {

    @Autowired
    private LottoBoardRepository lottoRepo;


    @GetMapping("/")
    public String LottoIndex(Model model){
        model.addAttribute("result", lottoRepo.findAllByOrderByRegdate());
        return "index";
    }


}
