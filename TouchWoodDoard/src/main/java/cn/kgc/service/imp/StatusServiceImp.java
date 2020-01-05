package cn.kgc.service.imp;

import cn.kgc.domain.Status;
import cn.kgc.mapper.StatusMapper;
import cn.kgc.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImp implements StatusService {
    @Autowired
    private StatusMapper statusMapper;
    @Override
    public List<Status> selectStatus() {
        return statusMapper.selectStatus();
    }
}
