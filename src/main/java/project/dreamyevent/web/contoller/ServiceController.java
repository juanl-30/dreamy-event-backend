package project.dreamyevent.web.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.dreamyevent.domain.ServiceDomain;
import project.dreamyevent.domain.service.ServiceService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/services")
public class ServiceController {
  @Autowired
  private ServiceService serviceService;

  @GetMapping()
  public ResponseEntity<List<ServiceDomain>> getAll() {
    return new ResponseEntity<>(serviceService.getAll(), HttpStatus.OK);
  }
}
