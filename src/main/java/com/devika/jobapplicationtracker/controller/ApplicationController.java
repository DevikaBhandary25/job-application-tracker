package com.devika.jobapplicationtracker.controller;

import com.devika.jobapplicationtracker.entity.Application;
import com.devika.jobapplicationtracker.service.ApplicationService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping
    public List<Application> getAllApplications() {
        return applicationService.getAllApplications();
    }

    @PostMapping
    public Application createApplication(@Valid @RequestBody Application application) {
        return applicationService.createApplication(application);
    }

    @DeleteMapping("/{id}")
    public String deleteApplication(@PathVariable Long id) {
        applicationService.deleteApplication(id);
        return "Application deleted successfully";
    }

    @PutMapping("/{id}")
    public Application updateApplication(
            @PathVariable Long id,
            @Valid @RequestBody Application application) {

        return applicationService.updateApplication(id, application);
    }

    @GetMapping("/status/{status}")
    public List<Application> getApplicationsByStatus(@PathVariable String status) {
        return applicationService.getApplicationsByStatus(status);
    }
}