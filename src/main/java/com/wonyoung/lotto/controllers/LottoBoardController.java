package com.wonyoung.lotto.controllers;


import com.wonyoung.lotto.models.LottoBoard;
import com.wonyoung.lotto.repositories.LottoBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LottoBoardController {

    @Autowired
    private LottoBoardRepository lottoRepo;


    @GetMapping("/")
    public List<LottoBoard> LottoIndex(){
        List<LottoBoard> boardList = lottoRepo.findAllByOrderByRegdate();
        return boardList;
    }


}
