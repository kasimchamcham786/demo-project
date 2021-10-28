package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.material.Asset;

@Service

public class AssetServiceImpl implements AssetService {
	
	List<Asset> list;
	
	public AssetServiceImpl() {
		
		list = new ArrayList<>(); 
		list.add(new Asset(234,"keyboard","This keyboard is very useful it has light in it to use in a night time"));
		list.add(new Asset(246,"mouse","This keyboard is very useful it has light in it to use in a night time"));
	}

	@Override
	public List<Asset> getAsset() {
		 
		return list;
	}
	
	@Override
	public Asset getAsset(long AssetId) {
		
		Asset a = null;
		for(Asset asset:list)
		{
			if(asset.getId()==AssetId)
			{
				a=asset;
				break;
			}
		}
		return a;
	}
	
	@Override
	public Asset addAsset(Asset asset) {
		
		list.add(asset);
		
		return asset;
	}
	
	@Override
	public Asset updateAsset(Asset asset) {
		
		list.add(asset);
		
		return asset;
	}
	
	
	

}
