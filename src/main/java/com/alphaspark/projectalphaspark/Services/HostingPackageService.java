package com.alphaspark.projectalphaspark.Services;

import com.alphaspark.projectalphaspark.Entities.HostingPackage;

import java.util.List;

public interface HostingPackageService {
    List<HostingPackage> getAllPackages();
    HostingPackage getHostingPackage(Long packageId);
    HostingPackage customPackage(HostingPackage hostingPackage);
    HostingPackage updatePackage(HostingPackage hostingPackage);
    boolean deletePackage(Long packageId);
}
