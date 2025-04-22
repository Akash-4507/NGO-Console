package Controller;

import model.AdminInfo;

import java.util.List;

public interface AdminInfoController {

    List<AdminInfo> getAllAdminInfo();
    String addAdminInfo(AdminInfo adminInfo);
    String deleteAdminInfo(int id);
    String updateAdminInfo(int id,AdminInfo adminInfo);
}
