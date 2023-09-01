package com.bites.demo.controller;

import com.bites.demo.model.AppInfo;
import com.bites.demo.service.AppInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/app-info")
@RequiredArgsConstructor
public class AppInfoController {
    private final AppInfoService appInfoService;

    @GetMapping
    public List<AppInfo> getAllAppInfos() {
        return appInfoService.getAllAppInfos();
    }

    @GetMapping("/{id}")
    public AppInfo getAppInfoById(@PathVariable Long id) {
        return appInfoService.getAppInfoById(id);
    }

    @PostMapping
    public AppInfo createAppInfo(@RequestBody AppInfo appInfo) {
        return appInfoService.createAppInfo(appInfo);
    }

    @PutMapping("/{id}")
    public AppInfo updateAppInfo(@PathVariable Long id, @RequestBody AppInfo appInfo) {
        return appInfoService.updateAppInfo(id, appInfo);
    }

    @DeleteMapping("/{id}")
    public void deleteAppInfo(@PathVariable Long id) {
        appInfoService.deleteAppInfo(id);
    }
}
