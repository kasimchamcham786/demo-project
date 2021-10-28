package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.material.Asset;

public interface AssetService {
	
	public List<Asset> getAsset();
	
	public Asset getAsset(long AssetId);
	
	public Asset addAsset(Asset asset);
	
	public Asset updateAsset(Asset asset);
	

}
