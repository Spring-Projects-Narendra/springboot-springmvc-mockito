package com.nar.mockitodemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MDaoImpl implements MDao{

    @Override
    public String getnNameById(int id) {

        if(id == 1){
            return "nar";
        }else if(id == 2 ){
            return "dev";
        }else{
            return "bhaggu";
        }
    }

    @Override
    public int getIdByName(String name) {
        return 250;
    }
}
