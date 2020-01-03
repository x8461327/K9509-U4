package cn.kgc.service.imp;

import cn.kgc.domain.District;
import cn.kgc.domain.DistrictExample;
import cn.kgc.domain.Street;
import cn.kgc.domain.StreetExample;
import cn.kgc.mapper.DistrictMapper;
import cn.kgc.mapper.StreetMapper;
import cn.kgc.service.DistritctService;
import cn.kgc.util.PageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DistritctServiceImp implements DistritctService {

    @Autowired
    private DistrictMapper districtMapper;
    @Autowired
    private StreetMapper streetMapper;

    @Override
    public PageInfo<District> getDistrictByPage(PageUtil pageUtil) {
        PageHelper.startPage(pageUtil.getPage(),pageUtil.getRows());
        //查询
        DistrictExample districtExample=new DistrictExample();
        List<District> list= districtMapper.selectByExample(districtExample);
        return new PageInfo<>(list);
    }

    @Override
    public PageInfo<Street> getStreetByPage(PageUtil pageUtil) {
        PageHelper.startPage(pageUtil.getPage(),pageUtil.getRows());
        //查询
        StreetExample streetExample =new StreetExample();
        List<Street> list = streetMapper.selectByExample(streetExample);
        return new PageInfo<>(list);
    }

    @Override
    public int addDistrict(District district) {
        return districtMapper.insertSelective(district);
    }

    @Override
    public int updateDistrict(District district) {
        return districtMapper.updateByPrimaryKeySelective(district);
    }

    @Override
    @Transactional
    public void deleteDistrict(Integer id) throws RuntimeException {
            streetMapper.delStreetByDistritc(id);
            districtMapper.deleteByPrimaryKey(id);
    }
}
