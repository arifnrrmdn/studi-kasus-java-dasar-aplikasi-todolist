package repository;

import entitiy.Todolist;

public interface TodoListRepository {

    // mendapatkan data
    Todolist[] getAll();

    // menambah data
    void add(Todolist todolist);

    // menghapus data
    boolean remove(Integer number);

}
