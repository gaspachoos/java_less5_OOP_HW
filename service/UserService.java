package service;

import model.impl.Student;

import java.util.List;

public interface UserService<T>{

     T createUser(String name,String lastName,int groupId);

     T getById(int id) throws Exception;

     List<T> getAllUsers();

     }
