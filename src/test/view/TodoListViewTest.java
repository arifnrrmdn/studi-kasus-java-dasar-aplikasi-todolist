package test.view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import services.TodoListService;
import services.TodoListServiceImpl;
import view.TodolistView;

public class TodoListViewTest {

    public static void main(String[] args) {
        testRemoveTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodolistView todolistView = new TodolistView(todoListService);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standard Classes");

        todolistView.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodolistView todolistView = new TodolistView(todoListService);

        todolistView.addTodoList();
        todoListService.showTodoList();
        todolistView.addTodoList();
        todoListService.showTodoList();
        todolistView.addTodoList();

    }

    public static void testRemoveTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodolistView todolistView = new TodolistView(todoListService);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standard Classes");

        todoListService.showTodoList();
        todolistView.removeTodoList();
        todoListService.showTodoList();
        todolistView.removeTodoList();
        todoListService.showTodoList();
        todolistView.removeTodoList();
        todoListService.showTodoList();

    }


}
