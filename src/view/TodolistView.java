package view;


import entitiy.Todolist;
import services.TodoListService;
import util.InputUtil;

public class TodolistView {

    private TodoListService todoListService;


    public TodolistView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    // tampilan data
    public void showTodoList() {
        while (true) {

            todoListService.showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = InputUtil.input("Pilih");
            if(input.equals("1")) {
                addTodoList();
            } else if (input.equals("2")) {
                removeTodoList();
            } else if (input.equals("x")){
                break;
            }else {
                System.out.println("Masukan angka 1 atau 2");
            }
        }
    }

    // menambah data
    public void addTodoList() {
        System.out.println("MENAMBAH TODOLIST");

        var todo = InputUtil.input("Masukan Todo (tekan x Jika Batal)");

        if (todo.equals("x")) {
            // batal
        } else  {
            todoListService.addTodoList(todo);
        }
    }

    // menghapus data
    public void removeTodoList() {
        System.out.println("MENGHAPUS TODO LIST");

        var number = InputUtil.input("Nomor yang dihapus (tekan x jika batal)");

        if (number.equals("x")) {
            // batal
        } else {
            todoListService.removeTodoList(Integer.valueOf(number));
        }
    }
}
