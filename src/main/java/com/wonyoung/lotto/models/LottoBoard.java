package com.wonyoung.lotto.models;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "tb_lotto")
public class LottoBoard {

    public LottoBoard() {
    }

    public LottoBoard(int[] i) {
        for(int j : i)
            lnumber.add(j);

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lno;

    private ArrayList<Integer> lnumber = new ArrayList<>();

    @CreationTimestamp
    private Timestamp regdate;

    public Long getLno() {
        return lno;
    }

    public void setLno(Long lno) {
        this.lno = lno;
    }

    public List<Integer> getLnumber() {
        return lnumber;
    }

    public void setLnumber(ArrayList<Integer> lnumber) {
        this.lnumber = lnumber;
    }

    public Timestamp getRegdate() {
        return regdate;
    }

    public void setRegdate(Timestamp regdate) {
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        return "LottoBoard{" +
                "lno=" + lno +
                ", lnumber=" + lnumber +
                ", regdate=" + regdate +
                '}';
    }
}
