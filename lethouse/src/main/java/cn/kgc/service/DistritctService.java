package cn.kgc.service;

import cn.kgc.domain.District;
import cn.kgc.domain.Street;
import cn.kgc.util.PageUtil;
import com.github.pagehelper.PageInfo;

public interface DistritctService {

    PageInfo<District> getDistrictByPage(PageUtil pageUtil);
    PageInfo<Street> getStreetByPage(PageUtil pageUtil);
    int addDistrict(District district);
    int updateDistrict(District district);
    void deleteDistrict(Integer id);

}
