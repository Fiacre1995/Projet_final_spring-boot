package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modeles.Reductions;
import com.example.demo.repository.ReductionsRepository;

@Service
public class ReductionServiceImpl implements ReductionService {
	
	@Autowired
	ReductionsRepository reductionsrepository;
	@Override
	public List<Reductions> getAll() {
		// TODO Auto-generated method stub
		return reductionsrepository.findAll();
	}

	@Override
	public Reductions Create(Reductions reduction) {
		// TODO Auto-generated method stub
		return reductionsrepository.save(reduction);
	}

	@Override
	public Reductions Update(Reductions reduction) {
		// TODO Auto-generated method stub
		return reductionsrepository.save(reduction);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		reductionsrepository.deleteById(id);
		
	}
	
	

}
