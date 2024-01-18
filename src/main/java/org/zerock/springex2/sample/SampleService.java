package org.zerock.springex2.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@ToString
@Service
@RequiredArgsConstructor
public class SampleService {

    private final SampleDAO sampleDAO;
    //@RequiredArgsConstructor - final로 작성

    //@Autowired
    //private SampleDAO sampleDAO;
    //SampleService에 sampleDAO 변수선언하고 @Autowired 주입
    //SampleTests에 sampleDAO 확인
}
