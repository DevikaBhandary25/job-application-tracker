package com.devika.jobapplicationtracker.service;

import com.devika.jobapplicationtracker.entity.Application;
import com.devika.jobapplicationtracker.exception.ResourceNotFoundException;
import com.devika.jobapplicationtracker.repository.ApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    private final ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    public Application createApplication(Application application) {
        return applicationRepository.save(application);
    }

    public void deleteApplication(Long id) {
        applicationRepository.deleteById(id);
    }

    public Application updateApplication(Long id, Application updatedApplication) {

        Application existingApplication = applicationRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Application not found with id: " + id
                        ));

        existingApplication.setCompany(updatedApplication.getCompany());
        existingApplication.setRole(updatedApplication.getRole());
        existingApplication.setLocation(updatedApplication.getLocation());
        existingApplication.setStatus(updatedApplication.getStatus());
        existingApplication.setApplicationDate(updatedApplication.getApplicationDate());
        existingApplication.setJobType(updatedApplication.getJobType());
        existingApplication.setJobUrl(updatedApplication.getJobUrl());

        return applicationRepository.save(existingApplication);
    }

    public List<Application> getApplicationsByStatus(String status) {
        return applicationRepository.findByStatus(status);
    }
}