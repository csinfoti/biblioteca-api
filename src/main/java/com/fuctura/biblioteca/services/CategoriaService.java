package com.fuctura.biblioteca.services;

import com.fuctura.biblioteca.dtos.CategoriaDTO;
import com.fuctura.biblioteca.exceptions.IllegalArgumentException;
import com.fuctura.biblioteca.exceptions.ObjectNotFoundException;
import com.fuctura.biblioteca.model.Categoria;
import com.fuctura.biblioteca.repositories.CategoriaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ModelMapper modelMapper;

    //return obj.orElse(null);
    //return cat.orElseThrow(()-> new ObjectNotFoundException("Categoria não encontrada!"));
    public Categoria findById(Integer id) {
        Optional<Categoria> cat = categoriaRepository.findById(id);
        //return cat.orElseThrow(() -> new ObjectNotFoundException("Categoria não encontrada!"));
        if (cat.isPresent()) {
            return cat.get();
        }
        throw new ObjectNotFoundException("Categoria não encontrada!");
    }

    public List<Categoria> findAll(){
        return categoriaRepository.findAll();
    }

    public Categoria save(CategoriaDTO objDTO){
        findByNome(objDTO);
        objDTO.setId(null);
        return categoriaRepository.save(modelMapper.map(objDTO, Categoria.class));
    }

    private void findByNome(CategoriaDTO categoriaDTO){
        Optional<Categoria> cat = categoriaRepository.findByNome(categoriaDTO.getNome());
        if (cat.isPresent() && cat.get().getNome().equals(categoriaDTO.getNome())){
            throw new IllegalArgumentException("Já existe uma categoria com este nome" + categoriaDTO.getNome());
        }
    }
}
