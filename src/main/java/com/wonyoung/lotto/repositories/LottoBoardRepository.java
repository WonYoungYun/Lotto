package com.wonyoung.lotto.repositories;

import com.wonyoung.lotto.models.LottoBoard;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LottoBoardRepository extends CrudRepository<LottoBoard, Long> {

    List<LottoBoard> findAllByOrderByRegdate();

}
