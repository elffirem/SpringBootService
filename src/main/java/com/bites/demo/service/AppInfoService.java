package com.bites.demo.service;

import com.bites.demo.model.AppInfo;
import com.bites.demo.repository.AppInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppInfoService {
    private final AppInfoRepository appInfoRepository;

    public List<AppInfo> getAllAppInfos() {
        return appInfoRepository.findAll();
    }

    public AppInfo getAppInfoById(Long id) {
        return appInfoRepository.findById(id).orElse(null);
    }

    public AppInfo createAppInfo(AppInfo appInfo) {
        return appInfoRepository.save(appInfo);
    }

    public AppInfo updateAppInfo(Long id, AppInfo appInfo) {
        if (appInfoRepository.existsById(id)) {
            appInfo.setId(id);
            return appInfoRepository.save(appInfo);
        }
        return null;
    }

    public void deleteAppInfo(Long id) {
        appInfoRepository.deleteById(id);
    }
}
