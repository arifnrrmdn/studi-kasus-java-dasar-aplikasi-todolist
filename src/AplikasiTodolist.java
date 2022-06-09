import java.util.Scanner;

public class AplikasiTodolist {

    public static String[] model = new String[10];

    public static void main(String[] args) {
        viewShowTodoList();
    }

    // menampilkan todolist
    public static void showTodoList() {
        System.out.println("TODO LIST");
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    // test menampilkan todolist
    public static void testShowTodoList() {
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java Dasar";
        model[2] = "Belajar Java OOP";
        showTodoList();
    }

    // menambah todolist
    public static void addTodoList(String todo) {
        // cek apakah model penuh?
        var penuh = true;
        for (int i = 0; i < model.length; i++) {
            if(model[i] == null) {
                //masih ada yang kosong
                penuh = false;
                break;
            }
        }

        // jika penuh kita resize ukuran array 2x lipat
        if (penuh){
            var temp= model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList(){
        for (int i = 1; i <= 25; i++) {
            addTodoList("Contoh todo ke " + i);
        }

        showTodoList();
    }

    // menghapus todolist
    public static boolean removeTodoList(Integer number) {

        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            // menggeser
            for (int i = (number - 1); i < model.length; i++) {
                if(i == model.length - 1) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }

            }

            return true;
        }
    }

    // test menghapus todo
    public static void testRemoveTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    // input data
    public static String input(String info) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    // test input
    public static void testInput() {
        var name = input("Nama");
        System.out.println("Hi! " + name);
    }

    // view showTodoList
    public static void viewShowTodoList() {

        while (true) {
            showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");
            if(input.equals("1")) {
                viewAddTodoList();
            } else if (input.equals("2")) {
                viewRemoveTodoList();
            } else if (input.equals("x")){
                break;
            }else {
                System.out.println("Masukan angka 1 atau 2");
            }
        }

    }

    // test ViewTodoList
    public static void testViewShowTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");
        viewShowTodoList();
    }

    // view addTodoList
    public static void viewAddTodoList() {
        System.out.println("MENAMBAH TODOLIST");

        var todo = input("Masukan Todo (tekan x Jika Batal)");

        if (todo.equals("x")) {
            // batal
        } else  {
            addTodoList(todo);
        }
    }

    // test viewaddtodolist
    public static void testViewAddTodoList() {
        viewAddTodoList();
        showTodoList();
    }


    // view removeTodoList
    public static void  viewRemoveTodoList() {
        System.out.println("MENGHAPUS TODO LIST");

        var number = input("Nomor yang dihapus (tekan x jika batal)");

        if (number.equals("x")) {

        } else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if (!success) {
                System.out.println("Gagal menghapus todolist : " + number);
            }
        }
    }

    // test viewremovetodolist
    public static void testViewRemoveTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");

        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }
}
