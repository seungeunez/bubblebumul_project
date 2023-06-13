package com.example.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Machine;

@Repository
public interface MachineRepository extends JpaRepository<Machine, BigInteger> {


    //해당아이디의 정보
    Machine findByWashing_id(String wid);

    //기기 목록하려고 있음
    List<Machine> findByWashing_idOrderByNoDesc(String id);

    //기기 선택 삭제_1
    // <T> List<T> deleteAllByNo(Class<T> no);


    //기기 선택 삭제_2
    // @Query(value = " <script> DELETE FROM MACHINE WHERE wid = :map.wid AND no IN ( <foreach collection = 'map.chk' item='tmp' separator=','> :tmp </foreach> ) </script>",  nativeQuery=true)
    // int deleteAllByNo(@Param("map") Map<String, Object> map);

    //기기 선택 삭제_3
    






    
    
}
