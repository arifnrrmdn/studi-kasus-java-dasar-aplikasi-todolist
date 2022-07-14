import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import services.TodoListService;
import services.TodoListServiceImpl;
import view.TodolistView;

public class AplikasiTodoListV2 {

    public static void main(String[] args) {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodolistView todolistView = new TodolistView(todoListService);

        todolistView.showTodoList();
    }
}
