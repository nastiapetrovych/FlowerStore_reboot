package com.example.demo.flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class FlowerService {
    private  final FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public  void addFlower(Flower flower) {
        Optional<Flower> flowerOptional = flowerRepository
                .findAllById(flower.getId());
        if (flowerOptional.isPresent()){
            throw new IllegalStateException("The id is taken");
        }
        flowerRepository.save(flower);
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }
}
