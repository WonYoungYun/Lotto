package com.wonyoung.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_lotto")
@Getter
@Setter
@ToString
public class lottoBoard {

    public lottoBoard() {
    }

    public lottoBoard(String lnumber) {
        this.lnumber = lnumber;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lno;

    private String lnumber;

    @CreationTimestamp
    private Timestamp regdate;


}
