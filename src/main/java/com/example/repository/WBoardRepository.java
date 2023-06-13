package com.example.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Board;

@Repository
public interface WBoardRepository extends JpaRepository<Board, BigInteger> {

    
    
}
