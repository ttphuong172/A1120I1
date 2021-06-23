package service;

import model.VillaHouseStandard;

import java.util.List;

public interface VillaHouseStandardService {
    List<VillaHouseStandard> selectAllVillaHouseStandard();
    VillaHouseStandard findVillaHouseStandardById(String villaHouseStandardId);
}
