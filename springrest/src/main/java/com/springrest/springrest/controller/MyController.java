package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.material.Asset;

import com.springrest.springrest.services.AssetService;

@RestController

public class MyController {
	
	@Autowired
	private AssetService assetService;
	
	@GetMapping("/home")
	public String home() {
		return "This company Will provide you electronic items";	
	}
	
	// Get The Asset 
	@GetMapping("/Asset")
	
	public List<Asset> getAsset() {
		return this.assetService.getAsset();
		
	}
	
	@GetMapping("/asset/{assetId}")
	public Asset getAsset(@PathVariable String assetId ) 
	{
		return this.assetService.getAsset(Long.parseLong(assetId));		
	
	}
	
	@PostMapping(path = "/asset", consumes = "application/json")
	public Asset addAsset(@RequestBody Asset asset) {
		return this.assetService.addAsset(asset);
	}
	
	@PutMapping(path = "/asset", consumes = "application/json")
	public Asset updateAsset(@RequestBody Asset asset) {
		return this.assetService.updateAsset(asset);
	}
	

}
