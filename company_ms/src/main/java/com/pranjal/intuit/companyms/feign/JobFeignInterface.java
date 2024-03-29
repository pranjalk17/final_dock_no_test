package com.pranjal.intuit.companyms.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "job-service", url = "$job-service.url")
@FeignClient(name = "job-service")
public interface JobFeignInterface {

    @DeleteMapping("/api/v1/jobs/deleteByCompany/{companyId}")
    ResponseEntity<String> deleteJobsByCompanyId(@PathVariable Long companyId);

}
