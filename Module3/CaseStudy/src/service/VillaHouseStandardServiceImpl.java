package service;

import model.VillaHouseStandard;
import repository.VillaHouseStandardRepository;
import repository.VillaHouseStandardRepositoryImpl;

import java.util.List;

public class VillaHouseStandardServiceImpl implements VillaHouseStandardService {
    VillaHouseStandardRepository villaHouseStandardRepository=new VillaHouseStandardRepositoryImpl();
    @Override
    public List<VillaHouseStandard> selectAllVillaHouseStandard() {
        return villaHouseStandardRepository.selectAllVillaHouseStandard();
    }
}
