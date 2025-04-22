package Controller;

import Repositories.AdminInfoDb;
import model.AdminInfo;

import java.util.List;

public class AdminInfoControllerImpl implements AdminInfoController {

    private static final AdminInfoDb adminInfoDb = new AdminInfoDb();

    @Override
    public List<AdminInfo> getAllAdminInfo() {
        return adminInfoDb.getAllInfoDb();
    }

    @Override
    public String addAdminInfo(AdminInfo adminInfo) {
        return adminInfoDb.addAdminInfoDb(adminInfo);
    }

    @Override
    public String deleteAdminInfo(int id) {
        return adminInfoDb.deleteAdminInfoDb(id);
    }

    @Override
    public String updateAdminInfo(int id,AdminInfo adminInfo) {
        return adminInfoDb.updateAdminInfoDb(id,adminInfo);
    }
}
