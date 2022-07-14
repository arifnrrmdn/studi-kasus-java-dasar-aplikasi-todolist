package services;

public interface TodoListService {

    // menampilkan data
    void showTodoList();

    // menambah data
    void addTodoList(String todo);

    // menghapus data
    void removeTodoList(Integer number);

}
