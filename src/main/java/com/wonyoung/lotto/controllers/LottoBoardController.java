package com.wonyoung.lotto.controllers;



import com.wonyoung.lotto.models.LottoBoard;
import com.wonyoung.lotto.repositories.LottoBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;


@Controller
@RequestMapping("/lotto/")
public class LottoBoardController {

    @Autowired
    private LottoBoardRepository lottoRepo;


    @GetMapping("/lottoMain")
    public String LottoIndex(Model model){
        model.addAttribute("result", lottoRepo.findAllByOrderByRegdate());
        return "lotto/lottoMain";
    }

    @PostMapping("/lottoMain")
    public String LottoPull(){
        int[] numbers = new int[6];
        for(int i=0; i<numbers.length; i++){
            int n = (int)(Math.random()*45 +1);
            numbers[i] = n;
            for(int j =0; j<i; j++){
                if(numbers[j] == numbers[i]) {
                    i--;
                }
            }
        }
        Arrays.sort(numbers);
        lottoRepo.save(new LottoBoard(numbers));
        return "redirect:/lotto/lottoMain";
    }

}
