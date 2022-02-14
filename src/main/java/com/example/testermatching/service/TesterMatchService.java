package com.example.testermatching.service;

import com.example.testermatching.model.TesterMatchResponse;
import com.example.testermatching.model.TesterMatchVo;
import com.example.testermatching.repository.BugRepository;
import com.example.testermatching.repository.DeviceRepository;
import com.example.testermatching.repository.TesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TesterMatchService {

    @Autowired
    TesterRepository testerRepository;

    @Autowired
    DeviceRepository deviceRepository;

    @Autowired
    BugRepository bugRepository;

    public TesterMatchVo getLookUpValues() {
        TesterMatchVo testerMatchVo = new TesterMatchVo();

        testerMatchVo.setCountries(testerRepository.findAllDistinctCountries());
        testerMatchVo.setDevices(deviceRepository.findByOrderByDescriptionAsc());
        return testerMatchVo;
    }

    public List<TesterMatchResponse> getTesterMatch(TesterMatchVo testerMatchVo) {
        List<Long> deviceIds = testerMatchVo.getDevices().stream().map(device -> device.getId()).collect(Collectors.toList());
        List<TesterMatchResponse> responseList = bugRepository.findAllBugs(testerMatchVo.getCountries(), deviceIds);
        return responseList;
    }
}
