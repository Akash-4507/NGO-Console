package Repositories;

import model.AdminInfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdminInfoDb {

    private static final List<AdminInfo> adminInfoList = new ArrayList<AdminInfo>();

    public List<AdminInfo> getAllInfoDb() {
    return adminInfoList;
    }


    public String addAdminInfoDb(AdminInfo adminInfo) {
        adminInfoList.add(adminInfo);
        return "info added";
    }

    public String deleteAdminInfoDb(int id) {
        Iterator<AdminInfo> iterator = adminInfoList.iterator();
        while (iterator.hasNext()) {
            AdminInfo adminInfo = iterator.next();
            if(adminInfo.getInfo_id() == id) {
                iterator.remove();
                return "info removed successfully";
            }
        }
        return "info not found";
    }


    public String updateAdminInfoDb(int id, AdminInfo adminInfo) {
        for(int i=0; i<adminInfoList.size(); i++) {
            if(adminInfoList.get(i).getInfo_id() == id) {
                adminInfoList.set(i, adminInfo);
                return "info updated successfully";
            }
        }
        return "info not found";
    }
}
