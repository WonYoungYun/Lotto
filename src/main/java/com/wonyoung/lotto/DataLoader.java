package com.wonyoung.lotto;


import com.wonyoung.lotto.models.LottoBoard;
import com.wonyoung.lotto.repositories.LottoBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    private LottoBoardRepository lottoRepo;
    @Override
    public void run(ApplicationArguments args) {
        lottoRepo.save(new LottoBoard(new int[]{1,1,1,1,1,1}));

    }

}
