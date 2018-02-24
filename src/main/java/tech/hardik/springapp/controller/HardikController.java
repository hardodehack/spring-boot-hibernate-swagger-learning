package tech.hardik.springapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import tech.hardik.springapp.entity.HardikEntity;
import tech.hardik.springapp.service.HardikRepositories;

@Api(value = "onlinestore", description = "Operations pertaining to products in Online Store")
@RestController()
public class HardikController {

	@Autowired
	HardikRepositories hardikRepo;

	@ApiOperation(value = "View a list of available products", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping("/hardik")
	public List<HardikEntity> getAllHardik() {
		return hardikRepo.findAll();
	}

	@PostMapping("/hardik")
	public HardikEntity createHardik(@Valid @RequestBody HardikEntity hEntity) {
		return hardikRepo.save(hEntity);
	}

}
